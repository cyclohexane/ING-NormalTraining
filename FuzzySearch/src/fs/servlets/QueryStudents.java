package fs.servlets;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fs.beans.Student;
import fs.daos.StudentDao;

@WebServlet("/QS")
public class QueryStudents extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public QueryStudents() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		String key = request.getParameter("key");
		StudentDao sdao = new StudentDao();
		List<Student> slist = sdao.getStudentByKey(key);
		request.getSession().setAttribute("slist", slist);
		response.sendRedirect("FuzzySearch.jsp");
		return;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
