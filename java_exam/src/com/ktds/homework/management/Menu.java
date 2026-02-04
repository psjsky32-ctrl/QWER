package com.ktds.homework.management;
/**
 * 메뉴 3가지 소주 3가지
 * 음식마다의 무게 int menuWeight 
 * 술 int alcohol
 * 술 int alcoholWeight = 10
 */

public class Menu {
	private String menuName;
	private int menuWeight;
	private int price;
	private int alcohol;
	private int stock; 
	private final int ALCOHOL_WEIGHT = 10;

	public Menu(String menuName, int menuWeight, int alcohol, int price, int stock) {
		this.menuName = menuName;
		this.menuWeight = menuWeight;
		this.alcohol = alcohol;
		this.price = price;
		this.stock = stock;
	}

	public String getMenuName() {
		return menuName;
	}

	public int getMenuWeight() {
		return menuWeight;
	}

	public int getPrice() {
		return price;
	}

	public int getAlcohol() {
		return alcohol;
	}

	public int getAlcoholWeight() {
		return ALCOHOL_WEIGHT;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
}