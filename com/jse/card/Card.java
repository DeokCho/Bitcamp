package com.jse.card;

import lombok.Data;

@Data
public class Card {
	private String kind;
	private int number;
	

	@Override
	public String toString() {
		return "kind : "+ kind + ", number : " + number;
	}
}
