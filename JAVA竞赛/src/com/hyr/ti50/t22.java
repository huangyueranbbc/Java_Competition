package com.hyr.ti50;

/**
 * 题目：利用递归方法求5!。
 */
public class t22 {

	public static void main(String[] args) {
		int result;
		result = req(5);
		System.out.println(result);
	}

	private static int req(int n) {
		int value = 0;
		if (n == 1) {
			// 递归出口
			value = 1;
		} else {
			value = req(n - 1) * n;
		}
		return value;
	}
}
