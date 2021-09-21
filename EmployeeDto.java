package edu.dto;

import java.io.Serializable;

public class EmployeeDto implements Serializable {
	private int eid;
	private String ename;
	private double salary;
	private String deptno;
	public String toString()
	{
		return eid +"," + ename +","+ salary +"," +deptno;
	}
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

}