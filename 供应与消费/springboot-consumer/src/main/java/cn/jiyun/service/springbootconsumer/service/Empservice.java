package cn.jiyun.service.springbootconsumer.service;

import cn.jiyun.service.springbootconsumer.Dao.Empdao;
import cn.jiyun.service.springbootconsumer.pojo.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Empservice {
    @Autowired
   private Empdao ed;
   public List<Emp> findbyid(List<Integer> ids){
       ArrayList<Emp> list = new ArrayList<>();
       ids.forEach(s->{
           Emp emp = ed.findbyid(s);
           list.add(emp);
       });
       return list;
   }
}
