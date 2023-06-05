package com.codegym.controller;

import com.codegym.model.Employee;
import com.codegym.model.EmployeeFrom;
import com.codegym.service.EmployeeService;
import com.codegym.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    private final IEmployeeService iEmployeeService = new EmployeeService();
    @GetMapping("")
    public String home(Model model){
        List<Employee> listEmployee=iEmployeeService.findAll();
        model.addAttribute("employee",listEmployee);
        return "/home";
    }
    @GetMapping("create")
    public ModelAndView creatFrom(){
        ModelAndView modelAndView=new ModelAndView("/formEmployee");
        modelAndView.addObject("employeeList",new Employee());
        return modelAndView;
    }
    @Value("${file_upload}")
    private String fileUpload;
    @PostMapping("/save")
    public ModelAndView saveEmployees(@ModelAttribute EmployeeFrom employeeFrom){
        MultipartFile multipartFile=employeeFrom.getImage();
        String fileName=multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(employeeFrom.getImage().getBytes(),new File(fileName+fileUpload));

        }catch (IOException ex){
            ex.printStackTrace();
        }
        Employee employee=new Employee(employeeFrom.getId(),employeeFrom.getName(),employeeFrom.getAddress(),
                employeeFrom.getEmail(),fileName,employeeFrom.getSalary());
        iEmployeeService.save(employee);
        ModelAndView modelAndView=new ModelAndView("/formEmployee");
        modelAndView.addObject("employeeFrom",employeeFrom);
        modelAndView.addObject("message","Created new Employee successfully !");
        return modelAndView;
    }
}
