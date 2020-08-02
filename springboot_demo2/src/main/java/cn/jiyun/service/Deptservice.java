package cn.jiyun.service;

import cn.jiyun.mapper.Deptmapper;
import cn.jiyun.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Deptservice {
    @Autowired
    Deptmapper dm;

    public List<Dept> findallDept(){
        return dm.findallDept();
    }
}
