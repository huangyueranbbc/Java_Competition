package com.hyr.ti50;

import java.awt.Image;

/**
 * 题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一个扔入海中，拿走了一份。
 * 第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中，拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 * 1276 1596 1996 2496 3121
 */
public class t41 {
	public static void main(String[] args) {
		int sum=0,m=0;
		for(int i=4;i<10000000;i++){
			m=i;
			boolean flag=false;
			for(int j=0;j<4;j++){
				sum=i/4*5+1;
				i=sum;
				if(i%4==0){
					flag=true;
				}else {
					flag=false;
					break;
				}
			}
			i=m;
			if(flag){
				System.out.println(sum/4*5+1);
				break;
			}
		}
	}
}
