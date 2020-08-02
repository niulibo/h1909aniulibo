package cn.jiyun.controller;

import cn.jiyun.pojo.Dept;
import cn.jiyun.pojo.Emp;
import cn.jiyun.service.Deptservice;
import cn.jiyun.service.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Controller
@RequestMapping("emp")
public class Empcontroller {
    @Autowired
    private Empservice es;

    @Autowired
    private Deptservice ds;

    @GetMapping("findall")
    public String findall(Model model){
        List<Emp> elist = es.findall();
        model.addAttribute("elist",elist);
        return "emp";
    }

    @GetMapping("toAddEmp")
    public String toaddEmp(Model model){
        List<Dept> dlist = ds.findallDept();
        model.addAttribute("dlist",dlist);
        return "addEmp";
    }

    @PostMapping("addEmp")
    public String addEmp(@ModelAttribute(value="emp") Emp emp){
        es.addEmp(emp);
        return "redirect:/emp/findall";
    }
    @GetMapping("delEmpbyid")
    public String delEmpbyid(@RequestParam(value="eid")Integer eid){
        es.delEmpbyid(eid);
        return "redirect:/emp/findall";
    }
    @GetMapping("toupdateEmp")
    public String toupdateEmp(@RequestParam(value="eid")Integer eid,Model model){
        Emp e = es.findbyid(eid);
        List<Dept> dlist = ds.findallDept();
        model.addAttribute("dlist",dlist);
        model.addAttribute("e",e);
        return "update";
    }
    @PostMapping("updateEmp")
    public String updateEmp(@ModelAttribute(value="emp") Emp emp){
        es.updateEmp(emp);
        return "redirect:/emp/findall";
    }
}
