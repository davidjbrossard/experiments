package eu.webfarmr.saladbar;

import java.util.ArrayList;
import java.util.List;

public class Salad {
	private List<String> ingredients = new ArrayList<String>();
	private String name;
	private String price;
	
	public Salad(String name, List<String> ingredients) {
		this.name = name;
		this.ingredients.clear();
		this.ingredients.addAll(ingredients);
	}
	
	public List<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(List<String> ingredients) {
		this.ingredients = ingredients;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
