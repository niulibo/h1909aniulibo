package cn.jiyun.service;

import cn.jiyun.mapper.Empmapper;
import cn.jiyun.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Empservice {
    @Autowired
    Empmapper em;

    public List<Emp> findall(){
        return em.findall();
    }
    public void addEmp(Emp emp){
        em.addEmp(emp);
    }
    public void delEmpbyid(Integer eid){
        em.delEmpbyid(eid);
    }
    public Emp findbyid(Integer eid){
        return em.findbyid(eid);
    }

    public void updateEmp(Emp emp){
        em.updateEmp(emp);
    }
}
