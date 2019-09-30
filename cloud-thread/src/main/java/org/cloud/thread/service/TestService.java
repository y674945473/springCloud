package org.cloud.thread.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestService {

	private static Logger logger = LoggerFactory.getLogger(TestService.class);
	public TestService() {
		logger.info("开始工作");
		logger.info("工作中");
		logger.info("工作结束");
	}
}
