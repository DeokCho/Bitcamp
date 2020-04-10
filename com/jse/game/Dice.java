package com.jse.game;

import java.util.Random;
import java.util.Scanner;
public class Dice {
	private String expect;
	private int diceNum;
	
	public void setExpect(String expect) {
		this.expect = expect;
	}
	public String getExpect() {
		return expect;
	}
	
	public void setDiceNum(int diceNum) {
		this.diceNum = diceNum;
	}
	
	public int getDice() {
		return diceNum;
	}
	
	public String switchDice() {
		
		String result = "";
		switch(diceNum) {
		case 1:case 3:case 5: result = "홀"; break;
		case 2:case 4:case 6: result = "짝"; break;
		}
				
		String end = "";
		if(expect.equals(result)) {
			end = "정답";
		}else {
			end = "오답";
		}
		return end;
		
	}

}
