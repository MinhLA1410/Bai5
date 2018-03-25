package com.MinhLA1.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.MinhLA1.bean.Student;
import com.MinhLA1.model.DBConnector;

public class StudentDAO {
	public List<Student> getListStudent (){
		try {
			ArrayList<Student> students = new ArrayList<>();
			Connection connection = DBConnector.getInstance();
			Statement sttm = connection.createStatement();
			String sql;
			sql = "SELECT StudentID, StudentName, Age FROM student";
			ResultSet rs = sttm.executeQuery(sql);
			while (rs.next()) {
				int studentid = rs.getInt("StudentID");
				String studentname = rs.getString("StudentName");
				int age = rs.getInt("Age");
				Student student = new Student(studentid, studentname, age);
				students.add(student);
			}
		} finally {
			DbH
		} 
	};
	public int insert(Student Student) {
		
		return 0;
	}
	
	public void delete(int studentID) {
		
	}
	public void update(Student Student) {
		
	}
	
}
