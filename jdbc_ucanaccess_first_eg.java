import java.lang.*;
import java.sql.*;

class eg_2
{
	Connection con;
	String sql;
	Statement stmt;
	ResultSet rs;

	public eg_2()
	{
		try
		{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			con=DriverManager.getConnection("jdbc:ucanaccess://Database41.accdb");
		}
		catch(Exception e)
		{
			System.out.println("ERROR :"+e);
		}
	}

	public void display()
	{
		try
		{
			sql="select * from Table1";
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);

			if(rs.next())
			{
				System.out.println("ROLL \t NAME \t MARKS");

				do
				{
					System.out.println(rs.getInt("roll") +"\t"+ rs.getString("name") +"\t"+ rs.getInt("marks"));

				}while(rs.next());
			}
			else
			{
				System.out.println("DATA NOT FOUND..");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class jdbc_ucanaccess_first_eg
{
	public static void main(String args[])
	{
		eg_2 x=new eg_2();
		x.display();
	}
}