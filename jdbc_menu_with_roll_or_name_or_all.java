import java.io.*;
import java.lang.*;
import java.sql.*;

class eg5
{
	Connection con;
	Statement  stmt;
	ResultSet rs;
	String sql,sql2,sql3,name;
	int roll,ch;

	public eg5()
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

	public void menu()
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

			System.out.println("1.Display All Records..");
			System.out.println("2.Display Records with Roll No..");
			System.out.println("3.Display Records with Name..");

			System.out.println("Enter One Choice ::");
			ch=Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
					sql="select * from Table1";
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
					break;

				case 2:
					System.out.println("Enter Roll No ::");
					roll=Integer.parseInt(br.readLine());

					sql2="select * from Table1 where roll="+roll;
					stmt=con.createStatement();
					rs=stmt.executeQuery(sql2);

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
					break;

				case 3:
					System.out.println("Enter Name ::");
					name=br.readLine();

					sql3="select * from Table1 where name='"+name+"'";
					stmt=con.createStatement();
					rs=stmt.executeQuery(sql3);

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
					break;

				default:
					System.out.println("Invalid Entery");
					break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class jdbc_menu_with_roll_or_name_or_all
{
	public static void main(String args[])
	{
		eg5 x=new eg5();
		x.menu();
	}
}