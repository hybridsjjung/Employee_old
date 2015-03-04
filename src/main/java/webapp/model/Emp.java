package webapp.model;

import java.util.Date;

public class Emp {
	Integer empno;
	String ename;
	String job;
	Integer mgr;
	Date hiredate;
	Float sal;
	Float comm;
	Dept deptno; // Emp : Dept = N : 1 관계 (외래키)
	
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Float getSal() {
		return sal;
	}
	public void setSal(Float sal) {
		this.sal = sal;
	}
	public Float getComm() {
		return comm;
	}
	public void setComm(Float comm) {
		this.comm = comm;
	}
	public Dept getDeptno() {
		return deptno;
	}
	public void setDeptno(Dept deptno) {
		this.deptno = deptno;
	}
	
}
