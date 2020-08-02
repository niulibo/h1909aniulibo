package cn.jiyun.mapper;

import cn.jiyun.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface Empmapper{
    List<Emp> findall();
    void addEmp(Emp emp);
    void delEmpbyid(Integer eid);
    Emp findbyid(Integer eid);
    void updateEmp(Emp emp);
}
