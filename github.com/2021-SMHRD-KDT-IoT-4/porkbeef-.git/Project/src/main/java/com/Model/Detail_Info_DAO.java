package com.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Detail_Info_DAO {
	
	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	int rtn = 0;
	String name = null;
	Detail_Info_DTO dto=null;
	
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
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
		public Detail_Info_DTO Get_Detail_Info(Detail_Info_DTO dto) {
		
		conn();

		try {
			String sql = "select * from Detail_Info where = ?"; // where 조건 필요시 추가하기

			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, dto.getNumbering());
			rs = psmt.executeQuery();

			if (rs.next()) {
				int numbering = rs.getInt(1);
				int salinity = rs.getInt(2);
				int indoor_temp = rs.getInt(3);
				int water_temp = rs.getInt(4);
				int wire_temp = rs.getInt(5);
				int water_high = rs.getInt(6);
				int daily_prod = rs.getInt(7);
				String harvest = rs.getString(8);
				int place_size = rs.getInt(9);
				String automode = rs.getString(10);
				
				this.dto = new Detail_Info_DTO(numbering, salinity,indoor_temp,water_temp,
						wire_temp,water_high,daily_prod,harvest,place_size,automode);
			}

		} catch (SQLException e) {

			System.out.println(e.toString());
		} finally {
			close();
		}

		return this.dto;
	}
		
		public int Update_Detail_Info(Detail_Info_DTO dto) {
			
			conn();

			String sql = "update detail_info set numbering=?, salinity=?, indoor_temp=?, water_temp =?,"
					+ "wire_temp =?,water_high =?,daily_prod =?,harvest =?,place_size =?,automode =? where = ?";

			try {
				psmt = conn.prepareStatement(sql);

				psmt.setInt(1, dto.getNumbering());
				psmt.setInt(2, dto.getSalinity());
				psmt.setInt(3, dto.getIndoor_temp());
				psmt.setInt(4, dto.getWater_temp());
				psmt.setInt(5, dto.getWire_temp());
				psmt.setInt(6, dto.getWater_high());
				psmt.setInt(7, dto.getDaily_prod());
				psmt.setString(8, dto.getHarvest());
				psmt.setInt(9, dto.getPlace_size());
				psmt.setString(10, dto.getAutomode());
				psmt.setInt(11, dto.getNumbering());

				rtn = psmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(e.toString());
			} finally {

				close();
			}
			return rtn;
		}
	
	
	

}
