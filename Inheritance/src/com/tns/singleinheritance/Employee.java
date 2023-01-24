package com.tns.singleinheritance;
import java.io.Serializable;

@Entity
@Table(name="emp_store")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="emp_type",discriminatorType.STRING)
@DiscriminatorValue("EMP")

public class Employee implements Serializable
{
private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(stratedy=GenerationType.AUTO)
private int employeeId;
private String name;
private double salary;
public int getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(int employeeId) {
	this.employeeId=employeeId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary=salary;
}
}
