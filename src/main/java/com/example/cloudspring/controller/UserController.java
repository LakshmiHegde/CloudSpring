package com.example.cloudspring.controller;

import com.example.cloudspring.Repo.EmployeeRepo;
import com.example.cloudspring.model.Employee;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    EmployeeRepo employeeRepo;

    @RequestMapping("/home")
    public String home()
    {
        return "home.jsp";
    }

    @RequestMapping("/")
    public String index()
    {
        return "index.jsp";
    }

    @RequestMapping("/employees")
    public List<Employee> getemp()
    {
        return employeeRepo.findAll();
    }

    @RequestMapping("/addUser")
    public String addemp(Employee user)
    {
        System.out.println(user);
        System.out.println("entered add emp");
        employeeRepo.save(user);
        return "success.jsp";
    }
    @RequestMapping("delete")
    public String delete(Employee user)
    {
        System.out.println("entered delete");
        employeeRepo.remove(user);
        return "deleted.jsp";
    }
    @RequestMapping("get")
    public String getpage()
    {
        System.out.println("entered getpage");
        return "getpage.jsp";
    }

    @RequestMapping("getEmpById")
    public ModelAndView getemployee(@RequestParam("aid") int aid)
    {
        System.out.println("entered get employee "+aid);
        Employee e=employeeRepo.findByAid(aid);
        ModelAndView mv=new ModelAndView();
        mv.addObject("employee",e);
        mv.setViewName("displayemp.jsp");//I can use MV to pass view and data, now you can acceses data using ${name} in view
        return mv;

    }
}
