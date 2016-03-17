package com.hyr.ti50;

/**
 * 题目：输出9*9口诀。
 */
public class t16 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j);
				System.out.print("  ");
				if (i * j < 10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
