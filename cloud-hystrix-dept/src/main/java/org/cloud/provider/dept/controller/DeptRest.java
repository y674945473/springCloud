package org.cloud.provider.dept.controller;

import javax.annotation.Resource;

import org.cloud.api.vo.Dept;
import org.cloud.provider.dept.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller
public class DeptRest {

	@Resource
    private DeptService deptService ;
    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    @HystrixCommand(fallbackMethod="getFallback")// 如果当前调用的get()方法出现了错误，则执行fallback
    public Object get(@PathVariable("id") long id) {
        return this.deptService.get(id) ;
    }
    @RequestMapping(value="/dept/add",method=RequestMethod.GET)
    public Object add(@RequestBody Dept dept) {
        return this.deptService.add(dept) ;
    }
    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public Object list() {
        return this.deptService.list() ;
    }
    
    public Object getFallback(@PathVariable("id") long id) {    // 此时方法的参数 与get()一致
        Dept vo = new Dept() ;
        vo.setDname("【ERROR】Microcloud-Dept-Hystrix");    // 错误的提示
        return vo ;
    }
}
