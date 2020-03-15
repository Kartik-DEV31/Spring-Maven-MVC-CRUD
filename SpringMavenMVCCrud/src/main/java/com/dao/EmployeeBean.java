package com.dao;

public class EmployeeBean {
	
	int Employee_ID;
	String Employee_Name;
	String Phone;
	String DeleteEmployee;
	String UpdateEmployee;
	String PhoneUpdate;
	
	public String getPhoneUpdate() {
		return PhoneUpdate;
	}
	public void setPhoneUpdate(String phoneUpdate) {
		PhoneUpdate = phoneUpdate;
	}
	public String getUpdateEmployee() {
		return UpdateEmployee;
	}
	public void setUpdateEmployee(String updateEmployee) {
		UpdateEmployee = updateEmployee;
	}
	public String getDeleteEmployee() {
		return DeleteEmployee;
	}
	public void setDeleteEmployee(String deleteEmployee) {
		DeleteEmployee = deleteEmployee;
	}
	public int getEmployee_ID() {
		return Employee_ID;
	}
	public void setEmployee_ID(int employee_ID) {
		Employee_ID = employee_ID;
	}
	public String getEmployee_Name() {
		return Employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		Employee_Name = employee_Name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}

}
