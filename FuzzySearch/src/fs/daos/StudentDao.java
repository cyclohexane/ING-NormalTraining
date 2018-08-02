package fs.daos;

import java.util.*;

import fs.beans.Student;

import java.sql.*;

public class StudentDao {
	public List<Student> getStudentByKey(String key) {
		List<Student> list = null;
		Connection conn = getDBConnection();
		StringBuffer sql = new StringBuffer("SELECT sno,sname,sex,classname,tel ");
		sql.append("FROM student WHERE sname LIKE '%");
		sql.append(key);
		sql.append("%' OR classname LIKE '%");
		sql.append(key);
		sql.append("%'");
		try {
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			ResultSet rs = ps.executeQuery();
			list = new ArrayList<Student>();
			while (rs.next()) {
				Student s = new Student();
				s.setSno(rs.getString(1));
				s.setSname(rs.getString(2));
				s.setSex(rs.getString(3));
				s.setClassname(rs.getString(4));
				s.setTel(rs.getString(5));
				list.add(s);
			}
			rs.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		closeConnection(conn);
		return list;
	}

	private Connection getDBConnection() {
		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			String url = "jdbc:postgresql://localhost:5432/jspdb";
			conn = DriverManager.getConnection(url, "postgres", "07138616486y");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	private void closeConnection(Connection conn) {
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
