package cn.jiyun.service.springbootprovider.pojo;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "dept")
public class Dept {
    @Id
    private Long did;
    private String dname;

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
