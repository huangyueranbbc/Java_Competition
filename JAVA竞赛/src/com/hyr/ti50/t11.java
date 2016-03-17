package com.hyr.ti50;

/**
 * 题目：有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class t11 {
	public static void main(String[] args) {
		int count = 0;
		for (int x = 1; x < 5; x++) {
			for (int y = 1; y < 5; y++) {
				for (int z = 1; z < 5; z++) {
					if (x != y && x != z && y != z) {
						count++;
						System.out.println(x + "" + y + "" + z);
					}
				}
			}
		}
		System.out.println(count);
	}
}
