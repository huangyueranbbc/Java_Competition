package com.hyr.ti50;

/**
 * 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个 "水仙花数 "
 * ，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class t3 {
	public static void main(String[] args) {
		for (int i = 100; i <= 999; i++) {
			int a = i / 100; // 百位
			int b = i % 100 / 10; // 十位
			int c = i % 10; // 个位
			if (a * a * a + b * b * b + c * c * c == i) {
				System.out.println(i);
			}
		}
	}
}
