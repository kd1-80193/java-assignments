package com.sunbeam;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class UserDao implements AutoCloseable {
	Connection con;

	public UserDao() throws SQLException {
		con = DbUtil.getConnection();
	}

	@Override
	public void close() throws Exception {
		if (con != null) {
			con.close();
		}

	}

	public int insertUser(User user) throws SQLException, ParseException {
		String sql = "INSERT INTO users VALUES(default,?,?,?,?,?,false,'voter')";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, user.getFname());
			stmt.setString(2, user.getLname());
			stmt.setString(3, user.getEmail());
			stmt.setString(4, user.getPasswd());

			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date uDate = sdf.parse(user.getDob());
			java.sql.Date sDate = new java.sql.Date(uDate.getTime());

			stmt.setDate(5, sDate);
			int cnt = stmt.executeUpdate();
			return cnt;

		}
	}

	public int updateUser(User user) throws SQLException {
		String sql = "UPDATE users set first_name=? ,last_name=?, password=? where id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setString(1, user.getFname());
			stmt.setString(2, user.getLname());
			stmt.setString(3, user.getPasswd());
			stmt.setInt(4, user.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	public int deleteUser(User user) throws SQLException {
		String sql = "DELETE FROM users WHERE id=?";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, user.getId());
			int cnt = stmt.executeUpdate();
			return cnt;
		}
	}

	public List<User> displayAll() throws SQLException {
		List<User> list = new ArrayList<>();
		String sql = "SELECT * FROM users";
		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String passwd = rs.getString("password");
					String dob = rs.getString("dob");
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");

					User user = new User(id, fname, lname, email, passwd, dob, status, role);
					list.add(user);

				}
				return list;
			}
		}
	}

	public List<User> findById(User user) throws SQLException {
		List<User> list = new ArrayList<>();
		String sql = "SELECT * FROM users WHERE id=?";

		try (PreparedStatement stmt = con.prepareStatement(sql)) {
			stmt.setInt(1, user.getId());
			try (ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					int id = rs.getInt("id");
					String fname = rs.getString("first_name");
					String lname = rs.getString("last_name");
					String email = rs.getString("email");
					String passwd = rs.getString("password");
					String dob = rs.getString("dob");
					boolean status = rs.getBoolean("status");
					String role = rs.getString("role");

					User user1 = new User(id, fname, lname, email, passwd, dob, status, role);
					list.add(user1);

				}
				return list;

			}
		}
	}
}