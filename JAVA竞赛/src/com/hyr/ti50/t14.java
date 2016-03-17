package com.hyr.ti50;

import java.util.Scanner;

/**
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 */
public class t14 {
	public static void main(String[] args) {
		int year, month, day;
		int days = 0;
		int d = 0;
		int e;
		Scanner in = new Scanner(System.in);
		do {
			e = 0;
			System.out.print("输入年：");
			year = in.nextInt();
			System.out.print("输入月：");
			month = in.nextInt();
			System.out.print("输入天：");
			day = in.nextInt();
			if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31) {
				System.out.println("输入错误，请重新输入！");
				e = 1;
			}
		} while (e == 1);

		// 开始计算
		for (int i = 1; i < month; i++) {
			switch (i) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
					days = 29;
				} else {
					days = 28;
				}
				break;
			}
			d += days;
		}

		System.out.println(d + day);

	}

}
