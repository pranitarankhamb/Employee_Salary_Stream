package org.emp.repository;

import java.sql.SQLException;
import java.util.*;
import java.util.List;

import org.emp.model.AttendacneModel;

public class AttendaceRepositoryImpl extends DBConfig implements AttendanceRepository {

	List <AttendacneModel> list = new ArrayList<AttendacneModel>();
	
//	public java.sql.Date getDate() {
//		
//		try {
//			stmt = conn.prepareStatement("select curDate()");
//			rs=stmt.executeQuery();
//			if(rs.next()) {
//				return rs.getDate(1);
//			}else {
//				return null;
//			}
//			
//		}catch(Exception ex) {
//			System.out.println("Error in AttendaceRepositoryImpl class"+ex);
//			return null;
//		}
//	}
	
	
	@Override
	public boolean ismarkAttendanceEmployee(AttendacneModel attendaceModel) {
			
		try {
			stmt = conn.prepareStatement("insert into attendance values (?,?,?,?,?)");
			stmt.setInt(1,attendaceModel.getEmpid());
			stmt.setDate(2, attendaceModel.getDate());
		
			stmt.setString(3, attendaceModel.getInTime());
			stmt.setString(4, attendaceModel.getOutTime());
			stmt.setString(5, attendaceModel.getStatus());
			
			int value = stmt.executeUpdate();
			return value>0?true:false;
			
			
		}catch(Exception ex) {
			System.out.println("Error in AttendaceRepositoryImpl"+ex);
		}
		
		
		return false;
	}

	@Override
	public List<AttendacneModel> getAllAttendanceModel() {

		try {
			stmt = conn.prepareStatement("select *from attendance");
			rs = stmt.executeQuery();
			while(rs.next()) {
				AttendacneModel Amodel = new AttendacneModel();
				Amodel.setEmpid(rs.getInt(1));
				Amodel.setDate(rs.getDate(2));
				Amodel.setInTime(rs.getString(3));
				Amodel.setOutTime(rs.getString(4));
				Amodel.setStatus(rs.getString(5));
				
				list.add(Amodel);
			}
			return list.size()>0?list:null;
			
		}catch(Exception ex) {
			System.out.println("Error in getallattendace model repositoryImpl");
			return null;
		}
		
		
	}




	public boolean addAtt(AttendacneModel attendaceModel) {
//		Date d=this.getDate();
		try {
			
			
			System.out.println("====================="+attendaceModel.getDate());
			stmt=conn.prepareStatement("insert into attendance values(?,?,?,?,?)");
			stmt.setInt(1, attendaceModel.getEmpid());
//			stmt.setDate(2, (java.sql.Date) d);
			stmt.setDate(2, attendaceModel.getDate());
			stmt.setString(3, attendaceModel.getInTime());
			stmt.setString(4, attendaceModel.getOutTime());
			stmt.setString(5, attendaceModel.getStatus());
		int val	=stmt.executeUpdate();
			if(val>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}

