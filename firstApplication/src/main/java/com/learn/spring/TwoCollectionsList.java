package com.learn.spring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author HeBiao
 * @Date 2021/5/19 11:37
 * @Description
 */
public class TwoCollectionsList {
    public static void main(String[] args){
        System.out.println("请输入第一个集合,以-666结束");
        Scanner scanner1=new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        int value1 = scanner1.nextInt();
        while(value1 != -666){
            list1.add(value1);
            value1 = scanner1.nextInt();
        }
        System.out.println("请输入第二个集合,以-999结束");
        Scanner scanner2=new Scanner(System.in);
        List<Integer> list2 = new ArrayList<>();
        int value2 = scanner2.nextInt();
        while(value2 != -999){
            list2.add(value2);
            value2 = scanner2.nextInt();
        }
        // list1独有
        List<Integer> list1Only = new ArrayList<>(list1);
        list1Only.removeAll(list2);
        // list2独有
        List<Integer> list2Only = new ArrayList<>(list2);
        list2Only.removeAll(list1);
        // 并 = list1独有 + list2
        System.out.println();
        System.out.println("2个集合的并集为如下(方法1: removeAll+addAll)");
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1Only);
        list3.addAll(list2);
        for(Integer v : list3){
            System.out.print(v + " ");
        }
        // 交 = list1 - list1独有
        System.out.println();
        System.out.println("2个集合的交集为如下");
        List<Integer> list4 = new ArrayList<>(list1);
        list4.removeAll(list1Only);
        for(Integer v : list4){
            System.out.print(v + " ");
        }
        // 对称差 = list1独有 + list2独有
        System.out.println();
        System.out.println("2个集合的对称差为如下");
        List<Integer> list5 = new ArrayList<>(list1);
        List<Integer> list6 = new ArrayList<>(list2);
        list5.removeAll(list2);
        list6.removeAll(list1);
        list5.addAll(list6);
        for(Integer v : list5){
            System.out.print(v + " ");
        }
        System.out.println();
    }
}
