package com.hyr.JAVA5C;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 标题：猜字母
 * 
 * 把abcd...s共19个字母组成的序列重复拼接106次，得到长度为2014的串。
 * 
 * 接下来删除第1个字母（即开头的字母a），以及第3个，第5个等所有奇数位置的字母。
 * 
 * 得到的新串再进行删除奇数位置字母的动作。如此下去，最后只剩下一个字母，请写出该字母。
 * 
 * 答案是一个小写字母，请通过浏览器提交答案。不要填写任何多余的内容。
 */
public class t3 {
	public static void main(String[] args) {
		char[] cr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's' };
		List<Character> list = new ArrayList<Character>();
		for (int i = 0; i < 106; i++) {
			for (char c : cr) {
				list.add(c);
			}
		}

		System.out.println(list.size());

		while (list.size() != 1) {
			for (int i = 1; i <= list.size(); i++) {
				if (list.size() != 1 && (i % 2 != 0)) {
					list.set(i - 1, ' ');
				} else if (list.size() == 1) {
					break;
				}
			}
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) == ' ') {
					list.remove(i);
				}
			}
		}

		System.out.println(list.size());
		System.out.println(list.get(0));
	}
}
