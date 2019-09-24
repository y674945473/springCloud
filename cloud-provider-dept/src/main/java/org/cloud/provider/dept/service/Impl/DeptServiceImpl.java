package org.cloud.provider.dept.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.cloud.api.vo.Dept;
import org.cloud.provider.dept.dao.IDeptDao;
import org.cloud.provider.dept.service.DeptService;

public class DeptServiceImpl implements DeptService {

	@Resource
    private IDeptDao deptDAO ;
    public Dept get(long id) {
        return this.deptDAO.findById(id);
    }

    public boolean add(Dept dept) {
        return this.deptDAO.doCreate(dept);
    }

    public List<Dept> list() {
        return this.deptDAO.findAll();
    }

}
