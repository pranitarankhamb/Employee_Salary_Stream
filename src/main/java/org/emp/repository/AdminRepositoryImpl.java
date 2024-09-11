package org.emp.repository;

import java.util.*;

import org.emp.model.AdminModel;

public class AdminRepositoryImpl extends DBConfig implements AdminRepository {
	List<AdminModel> list = new  ArrayList<AdminModel>();

	@Override
	public boolean isCheckLogin(AdminModel model) {
			try {
				stmt=conn.prepareStatement("select * from admin where username=? and password=?");
				stmt.setString(1, model.getUsername());
				stmt.setString(2, model.getPassword());
				
				rs=stmt.executeQuery();
				if(rs.next())
				{
					return true;
				}
				else
				{
					return false;
				}
			}catch(Exception ex) {
				System.out.println("Error is"+ex);
				return false;
			}
		
		}
}
