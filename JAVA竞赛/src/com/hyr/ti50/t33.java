package com.hyr.ti50;

/**
 *题目：打印出杨辉三角形（要求打印出10行如下图）      
            1   
          1    1   
        1    2    1   
      1    3    3    1   
    1    4    6    4    1   
1    5    10    10    5    1   

1
11
121
1331
14641


 */
public class t33 {
	public static void main(String[] args) {
		int[][] num=new int[10][10];
		for(int i=0;i<num.length;i++){
			num[i][i]=1;
			num[i][0]=1;
		}
		for(int i=2;i<10;i++){
			for(int j=1;j<10;j++){
				num[i][j]=num[i-1][j-1]+num[i-1][j];
			}
		}
//		for(int i=0;i<10;i++){
//			for(int j=0;j<10;j++){
//				System.out.print(num[i][j]);
//			}
//			System.out.println();
//		}
		for(int i=0;i<10;i++){
			for(int k=0;k<2*(10-i)-1;k++){
				System.out.print(" ");
			}	
			for(int j=0;j<=i;j++){
				System.out.print(num[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
	}
}
