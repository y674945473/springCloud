package org.cloud.provider.dept.job;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class PrintWordsJob implements Job {

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		String date = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss").format(new Date());
		System.out.println("PrintWordsJob start at:" + date + ", prints: Hello Job-" + new Random().nextInt(100));
		
	}

}
