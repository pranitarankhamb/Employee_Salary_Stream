//package org.emp.model;
//
//import java.sql.Date;
//import java.sql.Time;
//
//public class Attendance {
//	private int empId;
//    public int getEmpId() {
//		return empId;
//	}
//	public void setEmpId(int empId) {
//		this.empId = empId;
//	}
//	public Date getAdate() {
//		return Adate;
//	}
//	public void setAdate(Date adate) {
//		Adate = adate;
//	}
//	public Time getInTime() {
//		return inTime;
//	}
//	public void setInTime(Time inTime) {
//		this.inTime = inTime;
//	}
//	public Time getOutTime() {
//		return outTime;
//	}
//	public void setOutTime(Time outTime) {
//		this.outTime = outTime;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	private Date Adate;
//    private Time inTime;
//    private Time outTime;
//    private String status;
//}


// Attendance.java
package org.emp.model;

import java.sql.Date;
import java.sql.Time;

public class Attendance {
    private int empId;
    private Date adate;
    private Time inTime;
    private Time outTime;
    private String status;

    public Attendance(int empId, Date adate, Time inTime, Time outTime, String status) {
        this.empId = empId;
        this.adate = adate;
        this.inTime = inTime;
        this.outTime = outTime;
        this.status = status;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Date getAdate() {
        return adate;
    }

    public void setAdate(Date adate) {
        this.adate = adate;
    }

    public Time getInTime() {
        return inTime;
    }

    public void setInTime(Time inTime) {
        this.inTime = inTime;
    }

    public Time getOutTime() {
        return outTime;
    }

    public void setOutTime(Time outTime) {
        this.outTime = outTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}