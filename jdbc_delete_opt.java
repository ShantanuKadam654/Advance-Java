import java.io.*;
import java.lang.*;
import java.sql.*;

class del
{
	Connection con;
	Statement stmt;
	ResultSet rs;
	int ch,roll,i;
	String name,sql;

	public del()
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

	public void delete()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("1.Delete with roll");
			System.out.println("2.Delete with name");

			System.out.println("Enter One Option :");
			ch=Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
					System.out.print("Enter Roll No :");
					roll=Integer.parseInt(br.readLine());

					sql="delete * from Table1 where roll="+roll;
					stmt=con.createStatement();
					i=stmt.executeUpdate(sql);

					if(i>0)
					{
						System.out.println("rec deleted");
					}
					else
					{
						System.out.println("not deleted");
					}

					sql="select * from Table1 ";
					stmt=con.createStatement();
					rs=stmt.executeQuery(sql);

					if(rs.next())
					{
						System.out.println("ROll \t NAME \t MARKS");

						do
						{
							System.out.println(rs.getInt("roll")+"\t"+rs.getString("name")+"\t"+rs.getInt("marks"));
						}while(rs.next());
					}
					else
					{
						System.out.println("data not found");
					}
					break;

				case 2:
					System.out.print("Enter Name :");
					name=br.readLine();

					sql="delete * from Table1 where name='"+name+"'";
					stmt=con.createStatement();
					i=stmt.executeUpdate(sql);

					if(i>0)
					{
						System.out.println("rec deleted");
					}
					else
					{
						System.out.println("not deleted");
					}

					sql="select * from Table1 ";
					stmt=con.createStatement();
					rs=stmt.executeQuery(sql);

					if(rs.next())
					{
						System.out.println("ROll \t NAME \t MARKS");

						do
						{
							System.out.println(rs.getInt("roll")+"\t"+rs.getString("name")+"\t"+rs.getInt("marks"));
						}while(rs.next());
					}
					else
					{
						System.out.println("data not found");
					}
					System.out.println("case2");
					break;

				default:
					break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class jdbc_delete_opt
{
	public static void main(String args[])
	{
		del d=new del();
		d.delete();
	}
}