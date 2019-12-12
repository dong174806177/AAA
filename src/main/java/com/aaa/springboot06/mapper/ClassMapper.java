package com.aaa.springboot06.mapper;

import com.aaa.springboot06.entity.Class;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassMapper {
    //查询
    public List<Class>findAll();
    //删除
    public int delete(Integer c_id);
    //添加
    public int insert(Class c);
    //修改
    public int update(Class c);
     //查询单
    public Class se(Integer c_id);
}
