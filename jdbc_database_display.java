import java.lang.*;
import java.sql.*;

class eg3
{
	Connection con;
	Statement stmt;
	String sql;
	ResultSet rs;


	public eg3()
	{
		try
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con=DriverManager.getConnection("jdbc:ucanaccess://Database41.accdb");
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

			sql="select * from Table1 ";
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);

			if(rs.next())
			{
				System.out.println("ROLL \t NAME \t MARKS");

				do
				{
					System.out.println(rs.getInt("roll")+"\t"+rs.getString("name")+"\t"+rs.getInt("marks"));
				}while(rs.next());
			}
			else
			{
				System.out.println("Data Not Found..");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class jdbc_database_display
{
	public static void main(String args[])
	{
		eg3 x=new eg3();
		x.display();
	}
}