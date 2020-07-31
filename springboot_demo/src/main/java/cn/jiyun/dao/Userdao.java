package cn.jiyun.dao;

import cn.jiyun.pojo.Userpojo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface Userdao extends tk.mybatis.mapper.common.Mapper<Userpojo> {
}
