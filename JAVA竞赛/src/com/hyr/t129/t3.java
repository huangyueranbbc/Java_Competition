package com.hyr.t129;

import java.util.HashSet;
import java.util.Set;

/**
 * 看下面的算式： □□ x □□ = □□ x □□□ 它表示：两个两位数相乘等于一个两位数乘以一个三位数。 如果没有限定条件，这样的例子很多。
 * 但目前的限定是：这9个方块，表示1~9的9个数字，不包含0。 该算式中1至9的每个数字出现且只出现一次！
 */
public class t3 {
	static Set set = new HashSet<>();

	public static void main(String[] args) {
		int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9};
		allSorft(n, 0, n.length - 1);
	}

	private static void allSorft(int[] n, int start, int end) {
		if (start >= end) {
			if ((n[0] * 10 + n[1]) * (n[2] * 10 + n[3]) == (n[4] * 10 + n[5]) * (n[6] * 100 + n[7] * 10 + n[8])) {
				if (!set.contains((n[0] * 10 + n[1]) * (n[2] * 10 + n[3]))) {
					System.out.println(n[0] + "" + n[1] + "*" + n[2] + "" + n[3] + "=" + n[4] + "" + n[5] + "*" + n[6]
							+ "" + n[7] + "" + n[8]);
					set.add((n[0] * 10 + n[1]) * (n[2] * 10 + n[3]));
				}
			}
			return;
		} else {
			for (int i = start; i <= end; i++) {
				int temp = n[start];
				n[start] = n[i];
				n[i] = temp;
				allSorft(n, start + 1, end);
				temp = n[start];
				n[start] = n[i];
				n[i] = temp;
			}
		}
	}
}
