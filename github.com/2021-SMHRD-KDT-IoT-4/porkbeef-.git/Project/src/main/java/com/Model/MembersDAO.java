package com.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MembersDAO {

	Connection conn = null;
	PreparedStatement psmt = null;
	int rtn = 0 ;
	MembersDTO dto = null;
	ResultSet rs = null;
	ArrayList<MembersDTO> list = null;
	
	
	public void conn() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			String db_url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "jjin"; 
			String db_pw = "1234";
			
			conn = DriverManager.getConnection(db_url, db_id, db_pw);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void close() {
		
		
			try {
				if(rs != null) {
					rs.close();
				}
				if(psmt != null) {
				psmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public int join(MembersDTO dto) {
		
		conn();
		
		String sql = "insert into web_member values(?,?)";
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			
			rtn = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return rtn;
		
	}
	
	
	public MembersDTO login(MembersDTO dto) {
		conn();
		
		String sql = "select * from web_member where id=? and pw=?";
		
		try {
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			
			rs = psmt.executeQuery();
		
			if(rs.next()) {
				
				String id = rs.getString(1); 
				String pw = rs.getString(2);
				
				
				dto = new MembersDTO(id, pw);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return dto;
	}
	
	
	public int update(MembersDTO dto) {
		conn();
		
				String sql = "update MEMBERS set idseq=?, id=?, pw=?";
				
				try {
					psmt = conn.prepareStatement(sql);
					psmt.setInt(1, dto.getIdseq());
					psmt.setString(2, dto.getId());
					psmt.setString(3, dto.getPw());
					
					rtn = psmt.executeUpdate();
					
				} catch (SQLException e) {
					e.printStackTrace();
				} finally {
					close();
				}
		
				return rtn;
	}
	
	public ArrayList<MembersDTO> select() {
		
		list = new ArrayList<MembersDTO>();
		conn();
		
			String sql = "select * from MEMBERS";
			
			try {
				psmt = conn.prepareStatement(sql);
				rs = psmt.executeQuery();
				
				while(rs.next()) {
					int idseq = rs.getInt(1);
					String member_id = rs.getString(2);
					String member_pw = rs.getString(3); 
					
					
					dto =  new MembersDTO(member_id, member_pw,idseq);
					list.add(dto);
					
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				close();
			}
			
			return list;
	}
	
	public boolean idcheck(String id) {
		
		conn();
		
		boolean check = true;
		
		try {
			String sql = "select * from MEMBERS where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				check=false;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return check;
		
	}
	
	
}
