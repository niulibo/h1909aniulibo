package cn.jiyun.service.springbootprovider.mapper;

import cn.jiyun.service.springbootprovider.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Empmapper{
    Emp findbyid(Integer eid);
}
