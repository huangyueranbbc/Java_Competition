package com.hyr.ti50;

import java.util.Scanner;

/**
 * 题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 * 0 1 2 3 4 5 6 7 8 9              4
 * 6 7 8 9 0 1 2 3 4 5
 *  
 */
public class t36 {
	public static void main(String[] args) {
		int N = 10;
		int[] a = new int[N];
		Scanner s = new Scanner(System.in);
		System.out.println("请输入10个整数：");
		for (int i = 0; i < N; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("你输入的数组为：");
		for (int i = 0; i < N; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.print("\n请输入向后移动的位数：");
		int m = s.nextInt();
		int[] b = new int[m];
		for(int i=0;i<m;i++){
			b[i]=a[N-m+i];
		}
		int[] c=new int[N-m];
		for(int i=0;i<N-m;i++){
			c[i]=a[i];
		}
		for(int i=m;i<N;i++){
			System.out.println(i-m);
			a[i]=c[i-m];
		}
		
		for(int i=0;i<m;i++){
			a[i]=b[i];
		}
		
//		0 1 2 3 4 5 6 7 8 9
		for (int i = 0; i < N; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
