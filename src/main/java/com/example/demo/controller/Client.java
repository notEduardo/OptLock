package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Controller
public class Client {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@RequestMapping("/thread")
	public ModelAndView thread(@RequestParam(required=false) String message) {
		ModelAndView modelAndView = new ModelAndView("thread");
		modelAndView.addObject("cust", empRepo.findAll());
		modelAndView.addObject("data", new Employee());
		modelAndView.addObject("message", message);
		
		return modelAndView;
	}
	
	@RequestMapping("/threadcheck")
	public ModelAndView threadConfig(Employee cust) {
		ModelAndView modelAndView = new ModelAndView("redirect:/thread");
		Employee single = null;
		
		// Retrieve
		if(cust.getId() == null) {
			modelAndView.addObject("message", "Select an Employee to edit");
		}else{
			single = (empRepo.findById(cust.getId())).get();
			single.setSalary(cust.getSalary());
		}
		
		// Wait
		try {
            Thread.sleep(5000);
		} catch (InterruptedException e) {
            e.printStackTrace();
       	}
		
		// Save
		if(single != null) {
			try {
				empRepo.save(single);
	        } catch (Exception e) {
	            System.err.println(e);
	            Employee temp = (empRepo.findById(cust.getId())).get();
	            System.out.println("Someone updated record already -- " + temp);
	            modelAndView.addObject("message", "Someone updated record already. Your Version= " + single.toString() + "\nNew version:" + temp.toString() + "\nTry updating again");
	        }
		}
		
		return modelAndView;
	}
}
