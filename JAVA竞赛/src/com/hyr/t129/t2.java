package com.hyr.t129;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class t2 {
	public static void main(String[] args) {
		String str=new Scanner(System.in).nextLine();
		char[] c = str.toCharArray();
		List<Character> list=new ArrayList<Character>();
		for(char cs:c){
			list.add(cs);
		}
		
		for(int i=0;i<list.size();){
			if(list.get(i)==' ' && list.get(i+1) == ' '){
				list.remove(i+1);
			}else {
				i++;
			}
		}	
		
		for(int i=1;i<list.size();i++){
			if(list.get(i)>'1' && list.get(i)<'9'){
				if(list.get(i-1)>='a' &&list.get(i-1)<='z'){
					list.add(i, '_');
				}
				if (i!=list.size()-1 && list.get(i+1)>='a' && list.get(i+1)<='z') {
					list.add(i+1, '_');
				}
			}
		}
		//qgda fas af             gq35wjgiowe t24g42g g 34g 34g h23ugb ii34ghu 34
		for(int i=0;i<list.size();i++){
			
			if( (i!=0 && list.get(i-1)==' ' && list.get(i)>='a' &&list.get(i)<='z') ){
				list.set(i, Character.toUpperCase(list.get(i)));
			}else if(i==0){
				list.set(0, Character.toUpperCase(list.get(0)));
			}
		}
		
		for(char cs:list){
			System.out.print(cs);
		}
		
		
	}
}
