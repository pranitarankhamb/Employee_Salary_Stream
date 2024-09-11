package org.emp.repository;

import java.util.ArrayList;
import java.util.List;
import org.emp.model.*;
import org.emp.repository.*;

public class EmployeeRepositoryImpl extends DBConfig implements EmployeeRepository{
	
	List<EmloyeeModel> list;
	
	int empId=0;
	public int getEmployeeId() {
    	try {
    		stmt=conn.prepareStatement("select max(eid) from employee");
    	    rs=stmt.executeQuery();
    	    if(rs.next()) {
    	    	empId=rs.getInt(1);
    	    }
    	    return ++empId;
}
    	catch(Exception ex) {
    		return -1;
    	}
    }

	@Override
	public boolean isAddNewEmployee(EmloyeeModel model) {
		try {
			int employeeId=this.getEmployeeId();
			stmt=conn.prepareStatement("insert into employee values('0',?,?,?,?,?,?,?,?,?) ");
			//stmt.setInt(1, employeeId);
			stmt.setString(1, model.getName());
			stmt.setString(2, model.getDepartment());
			stmt.setDate(3, model.getJoin_date());
			stmt.setInt(4, model.getPrimary_contact());
			stmt.setInt(5, model.getSecondary_contact());
			stmt.setString(6, model.getEmail());
			stmt.setDate(7, model.getBirth_date());
			stmt.setString(8,model.getGender());
			stmt.setString(9, model.getAddress());
			
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex) {
			System.out.println("Error is"+ex);
		}
		return false;
	}

	@Override
	public List<EmloyeeModel> getAllEmployees() {
		try {
			list = new ArrayList<EmloyeeModel>();
			stmt=conn.prepareStatement("select *from employee");
			rs=stmt.executeQuery();
			while(rs.next()){
				EmloyeeModel model = new EmloyeeModel();
			 model.setId(rs.getInt(1));
			 model.setName(rs.getString(2));
			 model.setDepartment(rs.getString(3));
			 model.setJoin_date(rs.getDate(4));
			 model.setPrimary_contact(rs.getInt(5));
			 model.setSecondary_contact(rs.getInt(6));
			 model.setEmail(rs.getString(7));
			 model.setBirth_date(rs.getDate(8));
			 model.setGender(rs.getString(9));
			 model.setAddress(rs.getString(10));
			 list.add(model);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex) {
			System.out.println("error is"+ex);
			return null;
		}		
	}

	@Override
	public boolean isDeleteEmployeeById(int eid) {
		try {
			stmt=conn.prepareStatement("delete from employee where empid=?");
			stmt.setInt(1, eid);
			int value = stmt.executeUpdate();
			return value>0?true:false;
			
		}catch(Exception ex) {
			System.out.println("Error in EmployeeImpl "+ex);
			return false;
		}
	}

	@Override
	public boolean isUpdateEmployee(EmloyeeModel model) {
		// TODO Auto-generated method stub
		return false;
	}

}


