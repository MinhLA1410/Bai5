package com.MinhLA1.controler;

import java.io.IOException;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MinhLA1.bean.Student;
import com.MinhLA1.model.DBConnector;

/**
 * Servlet implementation class StudentList
 */
@WebServlet("/StudentList")
public class StudentList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StudentList() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ArrayList<Student> students = new ArrayList<>();
		try {
			Connection connection = DBConnector.getInstance();
			Statement sttm = connection.createStatement();
			String sql;
			sql = "SELECT StudentID, StudentName, Age FROM student";
			ResultSet rs = sttm.executeQuery(sql);
			while (rs.next()) {
				// Retrieve by column name
				int studentid = rs.getInt("StudentID");
				
				String studentname = rs.getString("StudentName");
				int age = rs.getInt("Age");
				Student student = new Student(studentid, studentname, age);
				students.add(student);
			}
		} catch (SQLException e) {
			System.out.println("LOI: " + e.getMessage());
		} catch (Exception ex) {
			System.err.println("Exception: " + ex.getMessage());
		}
		request.setAttribute("students", students);
		RequestDispatcher dispatcher = request.getRequestDispatcher("listStudent.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}