package cn.jiyun.service.springbootconsumer.Dao;

import cn.jiyun.service.springbootconsumer.pojo.Emp;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Empdao {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private DiscoveryClient discoveryClient;
    public Emp findbyid(Integer eid){
          /*  String aa ="http://localhost:8081/emp/"+eid;
        return restTemplate.getForObject(aa, Emp.class);*/
        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
        ServiceInstance serviceInstance = instances.get(0);
        //获取service-provider的信息
        String uri="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/emp/"+eid;
        return restTemplate.getForObject(uri,Emp.class);
    }
}
