package cn.jiyun.service.springbootprovider.controller;

import cn.jiyun.service.springbootprovider.pojo.Emp;
import cn.jiyun.service.springbootprovider.service.Empservice;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("emp")
public class Empcontroller {
    @Autowired
    private Empservice es;


    @GetMapping("{eid}")
    public Emp findbyId(@PathVariable("eid") Integer eid){
        Emp emp = es.findbyid(eid);
        return es.findbyid(eid);
    }
}
