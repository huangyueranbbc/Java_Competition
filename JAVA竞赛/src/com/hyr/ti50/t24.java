package com.hyr.ti50;

import java.util.Scanner;

/**
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。 //使用了长整型最多输入18位
 * 
 */
public class t24 {
	public static void main(String[] args) {
		int num;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		String n = Integer.toString(num);
		System.out.println(n.length());
		char[] c=n.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			System.out.println(c[i]);
		}
	}
}
