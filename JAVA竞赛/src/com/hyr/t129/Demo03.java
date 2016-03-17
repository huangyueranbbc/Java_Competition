package com.hyr.t129;
import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.LinkedHashSet;  
import java.util.List;  
import java.util.Scanner;  
import java.util.Set;  
  
public class Demo03 {  
    // 去掉重复元素,放入lis   
    public static void removeDuplicate(String s,Set<Character> lis){  
        for(char x:s.toCharArray()){  
            lis.add(x);  
        }  
    }  
    // 为方便操作 将 sets 转 lis    
    public static void convert(List<Character> lis,Set<Character> sets){  
        Iterator<Character> iter = sets.iterator();  
        while(iter.hasNext()){  
            lis.add(iter.next());  
        }  
    }  
    // 检测符合条件的元素组合   
    public static void check(Set<Character> sets){  
        List<Character> lis = new ArrayList<Character>();  
        convert(lis,sets);  // 为方便操作 将 sets 转 lis    
        StringBuffer sb = new StringBuffer();  
        for(int i=0;i<lis.size()-2;i++){  
            for(int j=i+1;j+1<lis.size();j++){   // 向后添加两位,所以 j+1<lis.size()   
                for(int k=j+1;k<lis.size();k++){  
                    sb.append(lis.get(i));  
                    sb.append(lis.get(j));  
                    sb.append(lis.get(k));  
                    System.out.println(sb); // 输出组合   
                    sb.setLength(0);    // 清空   
                }  
            }  
        }  
          
    }  
    public static void main(String[] args){  
        Scanner scan = new Scanner(System.in);  
        System.out.println("输入串（不大于30个字符）。");  
        String s = scan.nextLine();  
        Set<Character> sets = new LinkedHashSet<Character>();  
        removeDuplicate(s,sets);    // 去掉重复元素,放入lis   
        check(sets);    // 检测符合条件的元素组合   
    }  
}  
