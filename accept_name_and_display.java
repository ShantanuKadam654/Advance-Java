import java.io.*;
import java.lang.*;
import java.sql.*;

class eg4
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	String sql,name;

	public eg4()
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
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Name ::");
			name=br.readLine();

			sql="select * from Table1 where name='"+name+"'";
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
				System.out.println("data not found..");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class accept_name_and_display
{
	public static void main(String args[])
	{
		eg4 x=new eg4();
		x.display();
	}
}