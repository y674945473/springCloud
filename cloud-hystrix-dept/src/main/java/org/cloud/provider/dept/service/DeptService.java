package org.cloud.provider.dept.service;

import java.util.List;

import org.cloud.api.vo.Dept;
import org.springframework.stereotype.Service;
@Service
public interface DeptService {

    public Dept get(long id) ;

    public boolean add(Dept dept) ;

    public List<Dept> list() ;
}
