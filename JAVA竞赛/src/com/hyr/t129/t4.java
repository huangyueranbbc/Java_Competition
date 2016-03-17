package com.hyr.t129;

import java.util.Scanner;

public class t4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入个数：");
		int n = in.nextInt(); // 个数
		String[] ss = new String[n];
		in.nextLine();
		for (int i = 0; i < ss.length; i++) {
			ss[i] = in.nextLine();
		}

		// R12C4s
		for (int i = 0; i < ss.length; i++) {
			char[] c = ss[i].toCharArray();
			int index1 = ss[i].indexOf("R");
			int index2 = ss[i].indexOf("C");
			String hang = ss[i].substring(1, index2);
			String lie = ss[i].substring(index2 + 1, ss[i].length());
			int l = Integer.parseInt(lie);
			// System.out.println(hang+":"+lie);
			String CGL = null;
			if (l <= 26) {
				CGL = (char) ('A' + l - 1) + "";
			} else {
				l = l - 26;
				int temp = l / 26;

				String CGL1, CGL2;
				int tempy = l % 26;
				if (temp == 0) {
					CGL1 = (char) ('A' + temp - 1) + "";
				} else {
					CGL1 = (char) ('A' + temp - 1 + 1) + "";
				}
				CGL2 = (char) ('A' + tempy - 1) + "";
				CGL = CGL1 + CGL2;
			}
			System.out.println(CGL + hang);
		}

	}
}
