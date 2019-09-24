package org.cloud.consumer.controller;

import javax.annotation.Resource;

import org.cloud.api.vo.Dept;
import org.cloud.service.service.IDeptClientService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerDeptController {
	 @Resource
    private IDeptClientService deptService ;
	    @RequestMapping(value = "/consumer/dept/get")
	    public Object getDept(long id) {
	        return this.deptService.get(id);
	    }
	    @RequestMapping(value = "/consumer/dept/list")
	    public Object listDept() {
	        return this.deptService.list();
	    }
	    @RequestMapping(value = "/consumer/dept/add")
	    public Object addDept(Dept dept) throws Exception {
	        return this.deptService.add(dept);
	    }
	
//	public static final String DEPT_GET_URL = "http://MICROCLOUD-PROVIDER-DEPT/dept/get/";
//    public static final String DEPT_LIST_URL = "http://MICROCLOUD-PROVIDER-DEPT/dept/list/";
//    public static final String DEPT_ADD_URL = "http://MICROCLOUD-PROVIDER-DEPT/dept/add?dname=";
//    @Resource
//    private RestTemplate restTemplate;
//    @Resource
//    private HttpHeaders headers;
//    @RequestMapping(value = "/consumer/dept/get")
//    public Object getDept(long id) {
//        Dept dept = this.restTemplate
//                .exchange(DEPT_GET_URL + id, HttpMethod.GET,
//                        new HttpEntity<Object>(this.headers), Dept.class)
//                .getBody();
//        return dept;
//    }
//    @SuppressWarnings("unchecked")
//    @RequestMapping(value = "/consumer/dept/list")
//    public Object listDept() {
//        List<Dept> allDepts = this.restTemplate
//                .exchange(DEPT_LIST_URL, HttpMethod.GET,
//                        new HttpEntity<Object>(this.headers), List.class)
//                .getBody();
//        return allDepts;
//    }
//    @RequestMapping(value = "/consumer/dept/add")
//    public Object addDept(Dept dept) throws Exception {
//        Boolean flag = this.restTemplate.exchange(DEPT_ADD_URL, HttpMethod.POST,
//                new HttpEntity<Object>(dept, this.headers), Boolean.class)
//                .getBody();
//        return flag;
//    }

}
