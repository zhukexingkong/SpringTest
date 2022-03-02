package com.hebiao.spring;

import java.util.*;

/**
 * @Author HeBiao
 * @Date 2021/5/19 11:37
 * @Description
 */
public class ArraySort {

    public static void main(String[] args){
        int[] testArray =  {1,1,1,3,7,9,1,3,3,4,5,7,9,9,1,9};
        Integer[] test1 = new Integer[]{1,1,1,3,7,9,1,3,3,4,5,7,9,9,1,9};
        List<Integer> test2 = new ArrayList<>(Arrays.asList(1,1,1,3,7,9,1,3,3,4,5,7,9,9,1,9));
        Map<Integer, Integer> testMap = new HashMap<>();
        for(int i = 0; i <= testArray.length - 1; i++){
            if(testMap.containsKey(testArray[i])){
                testMap.put(testArray[i], testMap.get(testArray[i]) + 1);
            }else {
                testMap.put(testArray[i], 1);
            }
        }
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(testMap.entrySet());
        //降序排序
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for(Map.Entry<Integer,Integer> entry : list){
            System.out.print(entry.getKey() + " ");
            System.out.println(entry.getValue());
        }

    }
}
