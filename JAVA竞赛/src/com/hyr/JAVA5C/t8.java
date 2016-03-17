package com.hyr.JAVA5C;

import java.util.Scanner;

// Uh+1 Dh-1 Lw-1 Rw+1
public class t8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h, w;
		h = in.nextInt();
		w = in.nextInt();
		int[][] n = new int[h][w];
		System.out.println("输入数组:");
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				n[i][j] = in.nextInt();
			}
		}

		System.out.println("输入坐标和方向以及步数");
		// 蚂蚁坐标
		int x = in.nextInt();
		int y = in.nextInt();

		String way1 = in.next();// 头的方向
		char way = way1.toUpperCase().charAt(0);
		int step = in.nextInt();// 步数
		System.out.println("输入完毕！");

		f(n, y, x, way, step,h);

	}

	private static void f(int[][] n, int x, int y, char way, int step,int h) {
		if (step == 0) {
			System.out.println(x + " " + (h-y+1));
			return;
		}
//		System.out.println(x + " " + y);
		switch (way) {

		case 'U':
//			System.out.print("步数:"+step+x+":"+y+"值:"+n[x][y]);
			// 判断是黑格还是白格
			if (n[x][y] == 1) {
				// 黑格
				n[x][y] = 0;
				y= y + 1;
				way = 'R';
			} else {
				n[x][y] = 1;
				y =y - 1;
				way = 'L';
			}
			break;
		case 'D':
			// 判断是黑格还是白格
			if (n[x][y] == 1) {
				// 黑格
				n[x][y] = 0;
				x = x - 1;
				way = 'L';
			} else {
				n[x][y] = 1;
				x = x + 1;
				way = 'R';
			}
			break;
		case 'L':
			// 判断是黑格还是白格
			if (n[x][y] == 1) {
				// 黑格
				n[x][y] = 0;
				y = y - 1;
				way = 'U';
			} else {
				n[x][y] = 1;
				y = y + 1;
				way = 'D';
			}
//			System.out.println(":"+way);
			break;
		case 'R':
			// 判断是黑格还是白格
			if (n[x][y] == 1) {
				// 黑格
				n[x][y] = 0;
				y = y + 1;
				way = 'D';
			} else {
				n[x][y] = 1;
				y = y - 1;
				way = 'U';
			}
			break;
		default:
			break;
		}
		f(n, x, y, way, --step,h);
	}
}
