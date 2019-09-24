package org.cloud.provider.dept.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cloud.api.vo.Dept;

@Mapper
public interface IDeptDao {

	public boolean doCreate(Dept vo) ;
    public Dept findById(Long id) ;
    public List<Dept> findAll() ;
}
