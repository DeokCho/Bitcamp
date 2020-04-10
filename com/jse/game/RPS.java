package com.jse.game;

import java.util.Random;
import java.util.Scanner;

public class RPS {
	
	public void game(){
		System.out.println("가위(1), 바위(2), 보(3) 을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int st = sc.nextInt();
		String player = "";
		switch(st) {
			case 1: player = "가위(1)"; break;
			case 2: player = "바위(2)"; break;
			case 3: player = "보(3)"; break;
		}
		System.out.println("플레이어 : "+player);
		
		Random rd = new Random();
		int cr = rd.nextInt(3)+1;
		String computer = "";
		switch(cr) {
		case 1: computer = "가위(1)"; break;
		case 2: computer = "바위(2)"; break;
		case 3: computer = "보(3)"; break;
		}
		System.out.println("컴퓨터 : "+computer);
		
		String end = "무승부";
		if(st==cr) {
			System.out.println(end);
		}else if(st==1) {
			switch(cr) {
			case 2: end="패배"; break;
			case 3: end="승리"; break;
			}
		}else if(st==2) {
			switch(cr){
			case 1: end="승리"; break;
			case 3: end="패배"; break;
			}
		}else if(st==3) {
			switch(cr) {
			case 1: end="패배"; break;
			case 2: end="승리"; break;
			}
		}
		System.out.println(end);
	}
}
