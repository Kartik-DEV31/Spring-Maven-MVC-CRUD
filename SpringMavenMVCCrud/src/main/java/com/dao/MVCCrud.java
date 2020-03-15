package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.EmployeeBean;

@Controller
public class MVCCrud {

	@Autowired
	EmpJDBCController obj;
	//DataEntry
	@RequestMapping(value="/enterdata",method=RequestMethod.POST)
	public String enterEmployee(EmployeeBean employeeBean ) {
		
		obj.save1(employeeBean);
	return "redirect:/viewdata";
		
	}
	//DataDisplay
	@RequestMapping(value="/viewdata")
	public String saveEmployee(Model m) {
		
		List<EmployeeBean> list =obj.getEmployees();
		m.addAttribute("emplist", list);
		return "display";	}
	
	//DataDelete
	@RequestMapping(value="/delete/{employee_Name}")
public String deleteEmployee(EmployeeBean employeeBean,@PathVariable("employee_Name") String employee_Name ) {
		employeeBean.setDeleteEmployee(employee_Name);
		obj.delete1(employeeBean);
	return "redirect:/viewdata";
		
	}
	//DataUpdate
	@RequestMapping(value="/update" , method=RequestMethod.POST)
	public String updateEmployee(EmployeeBean employeeBean) {
		
		obj.update1(employeeBean);
	return "redirect:/viewdata";
		
	}
	

}
