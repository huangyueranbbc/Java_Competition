package com.hyr.B2015;

import java.util.HashSet;
import java.util.Set;

/**
 *三羊献瑞


观察下面的加法算式：


               祥 瑞 生 辉
  +   三 羊 献 瑞
-------------------
            三 羊 生 瑞 气
9 5 6 7
1 0 8 5
1 0 6 5 2
其中，相同的汉字代表相同的数字，不同的汉字代表不同的数字。
请你填写“三羊献瑞”所代表的4位数字（答案唯一）

三 a
羊 b
献 c
瑞 d
生 e
辉 f
祥 g
气 h
 */
public class t3 {
	public static void main(String[] args) {
		int a,b,c,d,e,f,g,h;
		for(int a1=0;a1<=9;a1++){
			for(int a2=0;a2<=9;a2++){
				for(int a3=0;a3<=9;a3++){
					for(int a4=0;a4<=9;a4++){
						for(int a5=0;a5<=9;a5++){
							for(int a6=0;a6<=9;a6++){
								for(int a7=0;a7<=9;a7++){
									for(int a8=0;a8<=9;a8++){
										Set set=new HashSet();
										set.add(a1);set.add(a2);set.add(a3);set.add(a4);
										set.add(a5);set.add(a6);set.add(a7);set.add(a8);
										a = a1;
										b = a2;
										c = a3;
										d = a4;
										e = a5;
										f = a6;
										g = a7;
										h = a8;
										if(set.size()==8){
											if( ((g*1000+d*100+e*10+f)+(a*1000+b*100+c*10+d)) == (a*10000+b*1000+e*100+d*10+h) && a!=0 && h!=0){
												System.out.print(a+" ");
												System.out.print(b+" ");
												System.out.print(c+" ");
												System.out.print(d+" ");
												System.out.print(e+" ");
												System.out.print(f+" ");
												System.out.print(g+" ");
												System.out.print(h+" ");
												System.out.println();
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
