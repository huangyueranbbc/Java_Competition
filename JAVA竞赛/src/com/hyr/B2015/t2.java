package com.hyr.B2015;

/**
 * 、立方变自身 观察下面的现象,某个数字的立方，按位累加仍然等于自身。 1^3 = 1 8^3 = 512 5+1+2=8 17^3 = 4913
 * 4+9+1+3=17 ... 请你计算包括1,8,17在内，符合这个性质的正整数一共有多少个？ 请填写该数字，不要填写任何多余的内容或说明性的文字。
 */
public class t2 {
	public static void main(String[] args) {
		int count = 0;
		for (long i = 1; i < 1000000; i++) {
			long sum = i * i * i;
			long t = 0;
			long tmp = sum;
			int ac = 0;
			for (int j = 0; j < Long.toString(sum).length(); j++) {
				t += tmp % 10;
				tmp /= 10;
			}
			if (t == i) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("有" + count + "个");
	}
}
