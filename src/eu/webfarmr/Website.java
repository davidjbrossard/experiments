package eu.webfarmr;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Illustrate comparators
 * @author djob
 *
 */
public class Website implements Comparable<Website>{
	private String name;
	private String description;
	private URL website;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public URL getWebsite() {
		return website;
	}
	public void setWebsite(URL website) {
		this.website = website;
	}
	
	public static void main(String[] args) throws MalformedURLException {
		List<Website> websites = new ArrayList<Website>();
		Website a = new Website();
		a.setName("Let's cook");
		a.setDescription("Some fascinating website");
		a.setWebsite(new URL("https://www.delscookingtwist.com"));
		Website b = new Website();
		b.setName("XACML stuff");
		b.setDescription("My personal blog");
		b.setWebsite(new URL("https://www.webfarmr.eu"));
		websites.add(a);
		websites.add(b);
		// Let's sort the list
		websites.sort(null);
	}
	@Override
	public int compareTo(Website o) {
		if (o == null) return 1;
		// If the names are different then return whichever is the string order
		// Consider using lower-case comparison
		if (this.getName().compareTo(o.getName())!=0) {
			return this.getName().compareTo(o.getName());
		} else {
			if (this.getWebsite().toString().compareTo(o.getWebsite().toString())!=0) {
				return this.getWebsite().toString().compareTo(o.getWebsite().toString());
			} else {
				return (this.getDescription().compareTo(o.getDescription()));
			}
		}
	}
}
