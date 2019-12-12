package com.aaa.springboot06.service;

import com.aaa.springboot06.entity.Class;
import com.aaa.springboot06.mapper.ClassMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ClassService {
    @Resource
    ClassMapper  classdao;
    public List<Class>findAll(){
      return   classdao.findAll();
    }
    //删除
    public int delete(Integer c_id){
       return classdao.delete(c_id);

    }
    //添加
    public int insert(Class c){
        return classdao.insert(c);
    }
    //修改
    public int update(Class c){
        return classdao.update(c);
    }
    public Class se(Integer c_id){
        return classdao.se(c_id);
    }
}
