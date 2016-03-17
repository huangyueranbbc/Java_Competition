package com.hyr.t129;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * 算法是这样的，如果给定N个不同字符，将这N个字符全排列，最终的结果将会是N!种。如：给定
 * A、B、C三个不同的字符，则结果为：ABC、ACB、BAC、BCA、CAB、CBA一共3!=3*2=6种情况。
 */
public class t1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		 String s = in.nextLine().toUpperCase();
		 char[] c=s.toCharArray();
		 Set sets=new HashSet<>();
		 for(char cs:c){
			 sets.add(cs);
		 }
		 
		 int len=sets.size();
		 int result=len;
		 for(int i=len-1;i>0;i--){
			 result=result*i;
		 }
		 System.out.println(result);
	}
}
