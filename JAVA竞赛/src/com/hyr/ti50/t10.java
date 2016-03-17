package com.hyr.ti50;

/**
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class t10 {
	public static void main(String[] args) {
		double sum = 100;
		double h = 100;
		for (int i = 1; i < 10; i++) {
			sum = sum + h;
			h = h / 2;
		}
		System.out.println(sum + ":" + h / 2);
	}
}
