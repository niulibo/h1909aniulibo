package cn.jiyun.service.springbootprovider.service;

import cn.jiyun.service.springbootprovider.mapper.Empmapper;
import cn.jiyun.service.springbootprovider.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Empservice {
    @Autowired
    private Empmapper em;

    public Emp findbyid(Integer eid){
        return em.findbyid(eid);
    }
}
