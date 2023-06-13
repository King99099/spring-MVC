package com.atguigu.springmvc.controller;

import com.atguigu.springmvc.bean.Employee;
import com.atguigu.springmvc.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * ClassName:TestController
 * Package: com.atguigu.springmvc.controller
 * Description :
 *
 * @Author: zlf
 * @Create 2023/5/31 - 16:16
 * @Version: v1.0
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList", employeeList);
        return "emp_list";
    }
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public String getAllEmployeeById(@PathVariable("id")Integer id ,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute(employee);
        return "emp_edit";
    }
    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee";
    }
    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    public String updateEmployee (Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }
}
