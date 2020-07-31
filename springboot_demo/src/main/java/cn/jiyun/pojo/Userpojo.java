package cn.jiyun.pojo;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="dept")
public class Userpojo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long deptno;
        private String dname;
        private String loc;

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }
}
