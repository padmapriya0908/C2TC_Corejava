package com.tns.dao;
import com.tns.entities.Student;

public interface StudentDao 
{
	public abstract Student getStudentById(int id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	}
	
	