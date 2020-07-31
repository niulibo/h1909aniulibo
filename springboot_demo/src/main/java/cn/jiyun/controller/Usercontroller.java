package cn.jiyun.controller;

import cn.jiyun.dao.Userdao;
import cn.jiyun.pojo.Userpojo;
import cn.jiyun.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

@RestController
@RequestMapping("user")
public class Usercontroller {
    @Autowired
    private Userservice userservice;

    @GetMapping("{id}")
    @ResponseBody
    public Userpojo findbyid (@PathVariable("id") Long id){
        return this.userservice.findbyid(id);
    }


}
