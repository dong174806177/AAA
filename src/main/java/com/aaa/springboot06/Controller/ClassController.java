package com.aaa.springboot06.Controller;

import com.aaa.springboot06.entity.Class;
import com.aaa.springboot06.service.ClassService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import javax.annotation.Resource;
import java.util.List;

@Controller
public class ClassController {
    @Resource
    ClassService service;
    @RequestMapping("findAll")
    public String findAll(Model model){
        List<Class>list=service.findAll();
        model.addAttribute("list",list);
        return "success";
    }
    @RequestMapping("delete")
    public String delete(Integer c_id){
        service.delete(c_id);
        return "forward:findAll";
    }
    @RequestMapping("insert")
    public String insert(Class c){
        service.insert(c);
        return "forward:findAll";

    }
    @RequestMapping("update")
    public String update(Class c){
        service.update(c);
        return "redirect:/findAll";
    }
    @RequestMapping("se")
    public String se(Integer c_id,Model model){
        Class c=service.se(c_id);
        model.addAttribute("c",c);
        return "class";
    }
}
