package com.jse.algorithm;

import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.print(String.format("%d x %d = %d\t", i, j, i * j));
			}
			System.out.println();

		}
	}
}