package org.cloud.thread.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.cloud.thread.controller.RedisController;
import org.cloud.thread.util.ThreadUtil;

public class test {

	public static void main(String[] args) {
//		ThreadUtil thU = new ThreadUtil();
//		thU.run();
//		int ncpus = Runtime.getRuntime().availableProcessors();
//		threadChi();
		RedisController r = new RedisController();
		r.test();
	}
	public static void threadChi(){
		ThreadUtil thU = new ThreadUtil();
		//线程池：20
		ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(20);
		SimpleDateFormat sdf = new SimpleDateFormat();
		for (int i = 0;;i++) {
			newFixedThreadPool.execute(thU.test(i));
			System.out.println("---------------------" + sdf.format(new Date()));
			if (i ==1 ) {
				break;
			}
		}
	}
	
	public void test(){
		int arg1=2;//核心线程
        int arg2=40;//最大线程数量
        int arg3=100;//空余保留时间
        
        ThreadPoolExecutor pool=new ThreadPoolExecutor(arg1, arg2, arg3,TimeUnit.MILLISECONDS, // 时间单位 
        		new LinkedBlockingQueue<Runnable>(3));//默认构造的队列大小为Integer.Max, 可指定大小new LinkedBlockingQueue<Runnable>(3)，队列容量为3
//        for(int i=0;i<10;i++){
////           pool.execute(); 
//　　　　　}
	}
}
