package com.maranatha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.maranatha.beans.Marca;

@Repository("marcaQualifier")
public class DAOMarcaImpl implements DAOMarca{

	@Autowired
	private DataSource dataSource;
	
	
	public void registar(Marca marca) throws Exception {
		
		String sql = "INSERT INTO marca(id,nombre) values(?,?)";
		Connection con = null;
		
		try{
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,marca.getId());
			ps.setString(2, marca.getNombre());
			ps.executeUpdate();
			ps.close();
		}catch(Exception e){
			
		}
	}



}
