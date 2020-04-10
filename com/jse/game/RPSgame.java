package com.jse.game;

import java.util.Random;

public class RPSgame {
	private int pVal;
	private int cVal;
	
	public void setpVal(int pVal) {
		this.pVal = pVal;
	}
	
	public int getpVal() {
		return pVal;
	}
	
	public void setcVal(int cVal) {
		this.cVal = cVal;
	}
	
	public int getCval() {
		return cVal;
	}
	
	
	public String game() {
		String end = "무승부";
		if(pVal==cVal) {
			System.out.println(end);
		}else if(pVal==1) {
			switch(cVal) {
			case 2: end="패배"; break;
			case 3: end="승리"; break;
			}
		}else if(pVal==2) {
			switch(cVal){
			case 1: end="승리"; break;
			case 3: end="패배"; break;
			}
		}else if(pVal==3) {
			switch(cVal) {
			case 1: end="패배"; break;
			case 2: end="승리"; break;
			}
		}
		return end;
	}
}
