package com.hyr.ti50;

/**
 * 题目：两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，
 * c说他不和x,z比，请编程序找出三队赛手的名单。
 */
public class t18 {
	public static void main(String[] args) {
		char[] c1 = { 'a', 'b', 'c' };
		char[] c2 = { 'x', 'y', 'z' };

		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				boolean flag = true;
				if (c1[i] == 'a' && c2[j] == 'x') {
					flag = false;
				} else if (c1[i] == 'c' && c2[j] == 'x') {
					flag = false;
				} else if (c1[i] == 'c' && c2[j] == 'z') {
					flag = false;
				} else {
					flag = true;
				}
				if (flag == true) {
					System.out.println(c1[i] + " vs " + c2[j]);
					break;
				}
			}
		}

	}
}
