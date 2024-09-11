package org.emp.repository;

import java.util.*;

import org.emp.model.EmployeeLoginModel;

public class EmployeeLoginRepositotyImpl extends DBConfig implements EmployeeLoginRepository{

		List<EmployeeLoginModel> list = new ArrayList<EmployeeLoginModel>();


	@Override
	public boolean isCheckEmployee(EmployeeLoginModel model) {
		try {
			
			stmt = conn.prepareStatement("select *from emp where username=? and password=?");
			stmt.setString(1, model.getUsername());
			stmt.setString(2, model.getPassword());
						
			rs=stmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			else {
				return false;
			}
			
		}catch(Exception ex) {
			System.out.println("Error in EmployeeLoginRepositotyImpl file");
			return false;
		}	
	}
}
  

