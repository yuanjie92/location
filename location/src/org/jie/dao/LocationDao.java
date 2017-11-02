package org.jie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.jie.model.Location;
import org.jie.util.DBUtils;


public class LocationDao {
	
	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	public Location queryById(Integer id){
		Location location = null;
		conn = DBUtils.getConn();
		String sql = "select * form location where id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs == null){
				return null;
			}
			if(rs.next()){
				location = new Location();
				location.setName(rs.getString("name"));
				location.setCode(rs.getString("code"));
				location.setSuperCode(rs.getString("superCode"));
				location.setArea(rs.getBoolean("area"));
				location.setCity(rs.getBoolean("city"));
				location.setProvince(rs.getBoolean("province"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.close(conn, ps, rs);
		}
		
		return location;
	}
}
