package cn.jiyun.service;

import cn.jiyun.dao.Userdao;
import cn.jiyun.pojo.Userpojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Userservice {
    @Autowired
    private Userdao userdao;

    public Userpojo findbyid(Long id){
        return this.userdao.selectByPrimaryKey(id);
    }
}
