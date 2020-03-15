package com.dao;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.dao.EmployeeBean;





@SuppressWarnings("unused")
public class EmpJDBCController {
	
	
	JdbcTemplate template1;
	public void setTemplate1(JdbcTemplate template1)
	{
		
		this.template1=template1;
		
	}
	//insert
	public int save1(EmployeeBean p)
	{
		String sql = "insert into empdata(Employee_Name,Phone) values('"+p.getEmployee_Name()+"',"+p.getPhone()+")";
		return template1.update(sql);
		
	}
	
	
public List<EmployeeBean> getEmployees(){
		
		return template1.query("select * from empdata", new RowMapper<EmployeeBean>() {
			
			public EmployeeBean mapRow(ResultSet rs , int row) throws SQLException
			{
				EmployeeBean e= new EmployeeBean();
				e.setEmployee_ID(rs.getInt(1));
				e.setEmployee_Name(rs.getString(2));
				e.setPhone(rs.getString(3));
				return e;
			}		
			
		} );
		
	}

public int delete1(EmployeeBean p)
{
	String sql2 = "delete from empData where Employee_Name="+"'"+p.getEmployee_Name()+"'";
	return template1.update(sql2);
	
}

public int update1(EmployeeBean p)
{
	String sql3 = "UPDATE empData SET Phone = "+p.getPhoneUpdate()+" WHERE Employee_Name="+"'"+p.getEmployee_Name()+"'";
	return template1.update(sql3);
	
}
	
	

}
