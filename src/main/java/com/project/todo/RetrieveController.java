package com.project.todo;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.project.connection.DatabaseConnection;

public class RetrieveController {
	
	
	private  ResultSet rs;
	private List<Todo> result = new ArrayList();

	public RetrieveController() {}
	
	public List<Todo> listofproduct() {
		int Pid=0;
			try{
				java.sql.Connection c = DatabaseConnection.connect();
				String sql ="select * from market";
				  java.sql.PreparedStatement pc = c.prepareStatement(sql);
				
					pc.executeQuery ();
  		  	    	 rs = pc.getResultSet();
        
					 while (rs.next()) {
						 

						Todo   prod = new Todo();

						    prod.setPid(rs.getString("Pid")); 	 	 	 
						    prod.setPname(rs.getString("PName"));
						    prod.setPcategory(rs.getString("PCategory"));
						    Blob blob = rs.getBlob("Picture");
							InputStream inputStream = blob.getBinaryStream();
							ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
							byte[] buffer = new byte[4096];
							int bytesRead = -1;
							while ((bytesRead = inputStream.read(buffer)) != -1) {
								outputStream.write(buffer, 0, bytesRead);
							}
							byte[] imageBytes = outputStream.toByteArray();
							String baseimg = Base64.getEncoder().encodeToString(imageBytes);
							inputStream.close();
							outputStream.close();
							prod.setBaseimage(baseimg);
							result.add(Pid, prod);
						    Pid++;
						    System.out.println("ok");
						}
						
						//con.close();
						} catch (Exception e) {
						e.printStackTrace();
						}
			return result ;
	}

}
