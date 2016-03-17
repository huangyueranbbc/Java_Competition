package com.hyr.JAVA5C;

import java.util.Scanner;

public class t9 {
	private static int count=0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		int k = in.nextInt(); // 件数
		int[][] n = new int[h][w];
		int len1 = n.length;// 行数
		int len2 = n[1].length;// 列数
		// System.out.println(len1+"==="+len2);

		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				n[i][j] = in.nextInt();
			}
		}

		for (int i = 0; i < len1; i++) {
			for (int j = 0; j < len2; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}

		// ================================================
		int x = 0, y = 0;// 当前的坐标
		f(n, x, y, k, 0, h, w, 0);
		System.out.println(count);
	}

	/**
	 * 
	 * @param n
	 * @param x
	 *            当前横坐标
	 * @param y
	 *            当前纵坐标
	 * @param k
	 *            目标件数
	 * @param nowk
	 *            当前件数
	 * @param h
	 * @param w
	 * @param max
	 *            当前最大价值
	 * @return
	 */
	private static void f(int[][] n, int x, int y, int k, int nowk, int h, int w, int max) {
		if (x < 0 || y < 0 || x >= h || y >= w || nowk > k) {
			return;
		}
		
		if (max < n[x][y]) {
			f(n, x, y + 1, k, nowk++, h, w, max = n[x][y]);
			f(n, x + 1, y, k, nowk++, h, w, max = n[x][y]);
		}

		f(n, x, y + 1, k, nowk, h, w, max);
		f(n, x + 1, y, k, nowk, h, w, max);
		System.out.println(x + ":" + y + "  当前件数:" + nowk + "  最大价值:" + max + "  目标件数:" + k);
		if (nowk == k && x == h - 1 && y == w - 1) {
			System.out.println(x + ":" + y + "===" + h + ":" + w);
			count++;
		}
		// System.out.println("处理之后:"+x+":"+y+" 当前件数:"+nowk+" 最大价值:"+max+"
		// 目标件数:"+k);

		// return f(n, x, y + 1, k, nowk, h, w, max) + f(n, x+1, y, k, nowk, h,
		// w, max);
	}

}
