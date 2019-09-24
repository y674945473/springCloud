package org.cloud.service.service;

import java.util.List;

import org.cloud.api.vo.Dept;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

@Component
public class IDeptClientServiceFallbackFactory implements FallbackFactory<IDeptClientService>{

	public IDeptClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new IDeptClientService() {
            public Dept get(long id) {
                Dept vo = new Dept();
                vo.setDname("【ERROR】Feign-Hystrix"); // 错误的提示
                return vo;
            }

            public List<Dept> list() {
                return null;
            }

            public boolean add(Dept dept) {
                return false;
            }
        };
	}
	

}
