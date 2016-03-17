package com.hyr.ti50;

import java.util.Scanner;

/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 * /**在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0
 * ，返回较大的数，此数即为最大公约数，最小公倍数为两数之积除以最大公约数。* /
 * 
 */
public class t6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int k = deff(a, b);
		int h = a * b / k;
		System.out.println(k + ":" + h);
	}

	// 求最大公约数
	static int deff(int x, int y) {
		int t;
		if (x < y) {
			t = y;
			y = x;
			x = t;
		}

		while (y != 0) {
			if (x == y) {
				return x;
			} else {
				int k = x % y;
				x = y;
				y = k;
			}
		}

		return x;
	}
}
