package com.hyr.ti50;

import java.util.Scanner;

/**
 * 题目：求一个3*3矩阵对角线元素之和
 */
public class t29 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] a = new int[3][3];
		System.out.println("请输入9个整数：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.println("输入的3 * 3 矩阵是:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}
}
