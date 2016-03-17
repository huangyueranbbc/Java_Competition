package com.hyr.JAVA5C;

/**
 *
 * 标题：猜年龄
 * 
 * 小明带两个妹妹参加元宵灯会。别人问她们多大了，她们调皮地说：“我们俩的年龄之积是年龄之和的6倍”。小明又补充说：“她们可不是双胞胎，
 * 年龄差肯定也不超过8岁啊。”
 * 
 * 请你写出：小明的较小的妹妹的年龄。
 * 
 * 
 * 注意： 只写一个人的年龄数字，请通过浏览器提交答案。不要书写任何多余的内容。
 * 
 * 
 */
public class t1 {
	public static void main(String[] args) {
		for(int x=1;x<100;x++){
			for(int y=1;y<100;y++){
				if(x*y/(x+y)==6 && (x*y)%(x+y)==0 && (Math.abs(x-y)<=8 || Math.abs(y-x)<=8) && x!=y){
					System.out.println(x+":"+y);
				}
			}
		}
	}
}
