import java.io.*;
import java.lang.*;
import java.sql.*;

class roll_dis
{
	Connection con;
	CallableStatement cstmt;
	ResultSet rs;
	int rn;

	public roll_dis()
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

			cstmt=con.prepareCall("select * from Table1 where roll=?");    //prepare using callable

			System.out.println("Enter Roll :");
			rn=Integer.parseInt(br.readLine());

			cstmt.setInt(1,rn);

			rs=cstmt.executeQuery();

			if(rs.next())
			{
				System.out.println("Roll \t Name \t Marks");

				do
				{
					System.out.println(rs.getInt("roll")+"\t"+rs.getString("name")+"\t"+rs.getInt("marks"));
				}while(rs.next());
			}
			else
			{
				System.out.println("data not found");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


class jdbc_callable_display_roll
{
	public static void main(String args[])
	{
		roll_dis r=new roll_dis();
	}
}