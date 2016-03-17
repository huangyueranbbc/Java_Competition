package com.hyr.ti50;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 题目：对10个数进行排序
 */
public class t28 {
	public static void main(String[] args) {
		int[] n=new int[10];
		Scanner in=new Scanner(System.in);
		for(int i=0;i<n.length;i++){
			n[i]=in.nextInt();
		}
		Arrays.sort(n);
		for(int i=0;i<n.length;i++){
			System.out.print(n[i]+" ");
		}
	}
}
