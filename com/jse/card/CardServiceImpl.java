package com.jse.card;

import java.util.Arrays;

public class CardServiceImpl implements CardService{
	private Card[] cards;
	private int i;
	public CardServiceImpl() {
		cards = new Card[3]; 
		i=0; // 0에서 시작해야 for문의 i가 0에서 시작하는 것과 일치함
	}
	
	public void add(Card card) { // 카드 1장짜리 받기 위해 넣음
		cards[i] = card;
		i++; // 배열의 개수를 증가시키기 위해, for문의 i와 동일하게 증가 
	}

	@Override
	public void setCard(Card[] cards) {
		this.cards=cards;
	}

	@Override
	public Card[] getCard() {
		return cards;
	}

	@Override
	public void setI(int i) {
		this.i=i;
	}

	@Override
	public int getI() {
		return i;
	}
	
}
