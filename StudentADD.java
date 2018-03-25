package com.MinhLA1.controler;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MinhLA1.model.DBConnector;

/**
 * Servlet implementation class StudentADD
 */
@WebServlet("/StudentADD")
public class StudentADD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentADD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("addname");
		Integer age = Integer.parseInt(request.getParameter("addage"));
		PreparedStatement prst = null;
		int result=0;
			try {	
				Connection connection = DBConnector.getInstance();
				prst = connection.prepareStatement("INSERT INTO student(studentname,age) VALUES(?,?)");
				prst.setString(1, name);
				prst.setInt(2, age);			
				result = prst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} 
			if(result > 0) {
				System.out.println("thanhcong:" + result);
				
			} else {
				System.out.println("that bai: " + result);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
