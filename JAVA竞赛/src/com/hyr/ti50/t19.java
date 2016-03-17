package com.hyr.ti50;

/**
 * 题目：打印出如下图案（菱形）
     *   
    ***   
   *****   
  *******   
   *****   
    ***   
     *   

 */
public class t19 {
	public static void main(String[] args) {
		int h=15,w=15;
		for(int i=1;i<=h;i++){
				//top
				if(i<=(h+1)/2){
					for(int x1=0;x1<(h+1)/2-i;x1++){
						System.out.print(" ");
					}	
					for(int x2=0;x2<1+2*(i-1);x2++){
						System.out.print("*");
					}
					System.out.println();
					// bottom
				}else {
					for(int x2=0;x2<(i-(h+1)/2);x2++){
						System.out.print(" ");
					}
					for(int x1=0;x1<w-(i-(h+1)/2)*2;x1++){
						System.out.print("*");
					}	
					System.out.println();
				}
			}

	}
}
