package com.hyr.ti50;

import java.util.Scanner;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
 * 几个数相加有键盘控制。
 */
public class t8 {
	public static void main(String[] args) {
		long a, b = 0, sum = 0;
		Scanner s = new Scanner(System.in);
		System.out.print("输入数字a的值： ");
		a = s.nextInt();
		System.out.print("输入相加的项数：");
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			b = b + a;
			sum = sum + b;
			a = a * 10;
		}
		System.out.println(sum);

	}
}
