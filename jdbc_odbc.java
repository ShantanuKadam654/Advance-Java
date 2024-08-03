import java.lang.*;
import java.sql.*;

class eg1
{
	Connection con;
	String sql;
	Statement stmt;
	ResultSet rs;

	public eg1()
	{
		try
		{
			Class.forName("sun.jdbc.odbc.jdbcodbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:table_dsn");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void display()
	{
		try
		{
			sql="select * from table_name ";
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);

			if(rs.next())
			{
				System.out.println("ROLL_NO  \t NAME \t MARKS");

				do
				{
					System.out.println(rs.getInt("roll") +"\t"+ rs.getString("name") +"\t"+ rs.getInt("marks"));

				}while(rs.next());
			}
			else
			{
				System.out.println("Data not found..");
			}
		}
		catch(Exception e)
		{
			System.out.println("ERROR :"+e);
		}
	}
}

public class jdbc_odbc
{
	public static void main(String args[])
	{
		eg1 x=new eg1();
		x.display();
	}
}