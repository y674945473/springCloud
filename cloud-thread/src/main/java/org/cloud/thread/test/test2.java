package org.cloud.thread.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.cloud.thread.controller.RedisController;
import org.cloud.thread.util.ThreadUtil;

public class test2 {

	public static void main(String[] args) {
//		ThreadUtil thU = new ThreadUtil();
//		thU.run();
//		int ncpus = Runtime.getRuntime().availableProcessors();
//		threadChi();
		RedisController r = new RedisController();
		r.test2();
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
		
//		newFixedThreadPool.shutdown();
		
	}
}
