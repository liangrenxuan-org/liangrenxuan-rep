package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.City;

public class CityDao {
	
	public List<City> getCityList(){
		List<City> cityList = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?userUnicode=true&amp;characterEncoding=utf-8", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from city");
			cityList = new ArrayList<City>();
			while(rs.next()) {
				City city = new City();
				city.setId(rs.getInt(1));
				city.setPid(rs.getInt(2));
				city.setName(rs.getString(3));
				city.setOpen(rs.getByte(4));
				cityList.add(city);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cityList;
	}

}
