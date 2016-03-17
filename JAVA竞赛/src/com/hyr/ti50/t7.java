package com.hyr.ti50;

import java.util.Scanner;

/**
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 */
public class t7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] c;
		c = str.toCharArray();
		int a1 = 0, a2 = 0, a3 = 0, a4 = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= '0' && c[i] <= '9') {
				a1++;
			} else if ((c[i] >= 'a' && c[i] <= 'z') || (c[i] >= 'A' && c[i] <= 'Z')) {
				a2++;
			} else if (c[i] == ' ') {
				a3++;
			} else {
				a4++;
			}
		}

		System.out.println("数字个数: " + a1);
		System.out.println("英文字母个数: " + a2);
		System.out.println("空格个数: " + a3);
		System.out.println("其他字符个数:" + a4);

	}
}
