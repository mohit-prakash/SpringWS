package com.mps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mps.bo.StudentBO;

public class StudentDAOImpl implements IStudentDAO {

	private static final String INSERT_QUERY="INSERT INTO FS_LAYERED_STUDENT VALUES (FS_SNO_SEQ.NEXTVAL,?,?,?,?,?)";
	private DataSource ds;
	public StudentDAOImpl(DataSource ds)
	{
		this.ds=ds;
	}
	@Override
public int insert(StudentBO bo) throws Exception
{
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try 
		{
			con=ds.getConnection();
			ps=con.prepareStatement(INSERT_QUERY);
			ps.setString(1,bo.getSname());
			ps.setString(2, bo.getSadd());
			ps.setString(5,bo.getResult());
			ps.setInt(3, bo.getTotal());
			ps.setFloat(4,bo.getAvg());
			result = ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally
		{
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
}
}
