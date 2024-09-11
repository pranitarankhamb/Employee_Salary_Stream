//package org.emp.repository;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import org.emp.model.Attendance;
//
//public class AttendanceRepositoryCImpl implements AttendanceRepositoryC{
//
//	private Connection connection;
//
//    public void AttendanceRepositoryImpl(Connection connection) {
//        this.connection = connection;
//    }
//
//    @Override
//    public void saveAttendance(Attendance attendance) {
//        try {
//            String sql = "INSERT INTO attendance (empid, Adate, inTime, outTime, status) VALUES (?, ?, ?, ?, ?)";
//            PreparedStatement statement = connection.prepareStatement(sql);
//            statement.setInt(1, attendance.getEmpId());
//            statement.setDate(2, new java.sql.Date(attendance.getAdate().getTime()));
//            statement.setTime(3, attendance.getInTime());
//            statement.setTime(4, attendance.getOutTime());
//            statement.setString(5, attendance.getStatus());
//            statement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//}

//____________________________________________________________________________________________________________________

// AttendanceRepositoryCImpl.java
package org.emp.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.emp.model.Attendance;

public class AttendanceRepositoryCImpl implements AttendanceRepositoryC {
    private Connection connection;

    public AttendanceRepositoryCImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void saveAttendance(Attendance attendance) {
        try {
            String sql = "INSERT INTO attendance (empid, Adate, inTime, outTime, status) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, attendance.getEmpId());
            statement.setDate(2, attendance.getAdate());
            statement.setTime(3, attendance.getInTime());
            statement.setTime(4, attendance.getOutTime());
            statement.setString(5, attendance.getStatus());
            statement.executeUpdate();
            
//            System.out.println(attendance.getEmpId()) ;      
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
