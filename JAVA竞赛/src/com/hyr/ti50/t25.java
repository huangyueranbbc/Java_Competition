package com.hyr.ti50;

import java.util.Scanner;

/**
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class t25 {
	public static void main(String[] args) {
		int a;
		do {
			Scanner in = new Scanner(System.in);
			a = in.nextInt();
		} while (a < 10000 || a > 99999);
		String s = Integer.toString(a);
		char[] c = s.toCharArray();
		if (c[0] == c[4] && c[1] == c[3]) {
			System.out.println(s + "是回文数");
		}
	}
}
