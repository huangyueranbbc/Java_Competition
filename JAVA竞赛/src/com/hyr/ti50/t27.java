package com.hyr.ti50;

/**
 * 题目：求100之内的素数
 */
public class t27 {
	public static void main(String[] args) {
		boolean flag=false;
		System.out.print(2+" "+3+" ");
		for(int i=1;i<100;i++){
			for(int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					flag=false;break;
				}else {
					flag=true;
				}
			}
			if(flag==true){
				System.out.print(i+" ");
			}

		}
	}
}
