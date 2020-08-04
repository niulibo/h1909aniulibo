package cn.jiyun.service.springbootconsumer.controller;

import cn.jiyun.service.springbootconsumer.pojo.Emp;
import cn.jiyun.service.springbootconsumer.service.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("emp")
public class Empcontroller {

    @Autowired
    Empservice es;
    @GetMapping("{eid}")
    public List<Emp> findbyid(@PathVariable("eid") List<Integer> ids){
        return es.findbyid(ids);
    }
}
