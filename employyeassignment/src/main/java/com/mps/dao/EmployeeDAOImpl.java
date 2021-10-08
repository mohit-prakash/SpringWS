package com.mps.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mps.bo.EmployeeBO;

public class EmployeeDAOImpl implements IEmployeeDAO {
	private DataSource ds;
	private static final String INSERT_QUERY="INSERT INTO EMPLOYEE1 VALUES(EMP_ENO_SEQ.NEXTVAL,?,?,?,?,?)";
	public EmployeeDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}
	@Override
	public int insert(EmployeeBO bo) throws Exception
	{
		Connection conn=null;
		PreparedStatement ps=null;
		int count=0;
		try
		{
			conn=ds.getConnection();
			ps=conn.prepareStatement(INSERT_QUERY);
			ps.setString(1,bo.getEname());
			ps.setString(2, bo.getEadd());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			count=ps.executeUpdate();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
			throw se;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			throw e;
		}
		finally
		{
			try {
				conn.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				ps.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return count;
	}
}
