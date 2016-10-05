package org.spring.batch.samples;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employee")
public class Report {
	/**
	 * EmpId
	 */
	private String empId;
	/**
	 * EmpName
	 */
	private String empName;
	/**
	 * EmpDesignation
	 */
	private String desgination;
	/**
	 * EmpProject
	 */
	private String project;

	/**
	 * Get EmpId.
	 */
	@XmlAttribute(name="empId")
	public String getEmpId() {
		return empId;
	}

	/**
	 * Set EmpId.
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}

	/**
	 * Get EmpName.
	 */
	@XmlElement(name="name")
	public String getEmpName() {
		return empName;
	}

	/**
	 * Set EmpName.
	 */
	public void setEmpName(String empname) {
		this.empName = empname;
	}

	/**
	 * Get EmpDesignation.
	 */
	@XmlElement(name="designation")
	public String getDesgination() {
		return desgination;
	}

	/**
	 * Set EmpDesignation.
	 */
	public void setDesgination(String desgination) {
		this.desgination = desgination;
	}

	/**
	 * Get EmpProject.
	 */
	@XmlElement(name="project")
	public String getProject() {
		return project;
	}

	/**
	 * Set EmpProject.
	 */
	public void setProject(String project) {
		this.project = project;
	}

	@Override
	public String toString(){
		return "Report [empid= " + empId + ", empName= " + empName
				+ ", empDesignation= " + desgination + ", empProject= " + project;
	}
}
