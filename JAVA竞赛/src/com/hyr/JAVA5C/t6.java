package com.hyr.JAVA5C;

/**
 *
 * 标题：李白打酒
 * 
 * 话说大诗人李白，一生好饮。幸好他从不开车。
 * 
 * 一天，他提着酒壶，从家里出来，酒壶中有酒2斗。他边走边唱：
 * 
 * 无事街上走，提壶去打酒。 逢店加一倍，遇花喝一斗。
 * 
 * 这一路上，他一共遇到店5次，遇到花10次，已知最后一次遇到的是花，他正好把酒喝光了。
 * 
 * 请你计算李白遇到店和花的次序，可以把遇店记为a，遇花记为b。则：babaabbabbabbbb
 * 就是合理的次序。像这样的答案一共有多少呢？请你计算出所有可能方案的个数（包含题目给出的）。
 * 
 * 注意：通过浏览器提交答案。答案是个整数。不要书写任何多余的内容。
 */
public class t6 {
	public static void main(String[] args) {
		System.out.println(f(5, 10, 2));
	}

	/**
	 * 
	 * @param shop
	 *            店
	 * @param flower
	 *            花
	 * @param k
	 *            酒
	 * @return
	 */
	private static int f(int shop, int flower, int k) {
		if (shop == 0 && flower == 0 && k == 0) {
			return 1;
		}
		if (shop < 0 | flower < 0 | k < 0) {
			return 0;
		}
		return f(shop - 1, flower, k * 2) + f(shop, flower - 1, k - 1);
	}
}
