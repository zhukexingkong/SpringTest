package com.learn.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author HeBiao
 * @Date 2021/5/19 11:37
 * @Description
 */
public class TwoCollectionsTreeSet {
    public static void main(String[] args){
        System.out.println("请输入第一个集合,以-666结束");
        Scanner scanner1=new Scanner(System.in);
        TreeSet<Integer> set1 = new TreeSet<>();
        int value1 = scanner1.nextInt();
        while(value1 != -666){
            set1.add(value1);
            value1 = scanner1.nextInt();
        }
        System.out.println("请输入第二个集合,以-999结束");
        Scanner scanner2=new Scanner(System.in);
        TreeSet<Integer> set2 = new TreeSet<>();
        int value2 = scanner2.nextInt();
        while(value2 != -999){
            set2.add(value2);
            value2 = scanner2.nextInt();
        }
        // 并
        System.out.println();
        System.out.println("2个集合的并集为如下");
        TreeSet<Integer> set3 = new TreeSet<>(set1);
        set3.addAll(set2);
        for(Integer v : set3){
            System.out.print(v + " ");
        }
        // 交
        System.out.println();
        System.out.println("2个集合的交集为如下");
        TreeSet<Integer> set4 = new TreeSet<>(set1);
        // retainAll 保留 arrayList 中在指定集合中也存在的那些元素，也就是删除指定集合中不存在的那些元素
        set4.retainAll(set2);
        for(Integer v : set4){
            System.out.print(v + " ");
        }
        // 对称差 (A-B)并(B-A)
        System.out.println();
        System.out.println("2个集合的对称差为如下");
        TreeSet<Integer> set5 = new TreeSet<>(set1);
        TreeSet<Integer> set6 = new TreeSet<>(set2);
        set5.removeAll(set2);
        set6.removeAll(set1);
        set5.addAll(set6);
        for(Integer v : set5){
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
