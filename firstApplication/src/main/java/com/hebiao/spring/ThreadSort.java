package com.hebiao.spring;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author HeBiao
 * @Date 2021/5/19 11:37
 * @Description
 */
public class ThreadSort {

    public static class Callable1 implements Callable<String>{
        @Override
        public String call() {
            return "thread1";
        }
    }

    public static class Callable2 implements Callable<String>{
        @Override
        public String call() {
            return "thread2";
        }
    }

    public static class Callable3 implements Callable<String>{
        @Override
        public String call() {
            return "thread3";
        }
    }



    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        List<Future<String>> futureList  = new ArrayList<>();
        Future<String> future1 = threadPool.submit(new Callable1());
        futureList.add(future1);
        Future<String> future2 = threadPool.submit(new Callable2());
        futureList.add(future2);
        Future<String> future3 = threadPool.submit(new Callable3());
        futureList.add(future3);

        for(Future<String> future : futureList) {
            try{
                System.out.println(future.get());
            } catch (Exception e) {

            } finally {
                threadPool.shutdown();
            }
        }
    }
}
