package com.hyr.ti50;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 */
public class t15 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		int[] num={x,y,z};
		Arrays.sort(num);
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
	}
}
