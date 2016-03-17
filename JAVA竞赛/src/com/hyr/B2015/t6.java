package com.hyr.B2015;

/**
 * 我们都知道：1+2+3+ ... + 49 = 1225 现在要求你把其中两个不相邻的加号变成乘号，使得结果为2015
 */
public class t6 {
	public static void main(String[] args) {
		int pre = 1225;

		for (int p1 = 1; p1 < 47; p1++) {
			for (int p2 = p1 + 2; p2 < 49; p2++) {
				int now=pre;
				now = now - p1 - p1 - 1;
				now = now - p2 - p2 - 1;
				now = now + p1 * (p1 + 1);
				now = now + p2 * (p2 + 1);
				if (now == 2015) {
					System.out.println(p1);
				}
			}
		}
	}
}
