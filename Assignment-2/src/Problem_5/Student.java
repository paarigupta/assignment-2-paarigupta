package Problem_5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student
{
	private String name;
	private int rollno , backlog,apperingcount;
	private Scanner sc;
	
	public Student()
	{
		sc=new Scanner(System.in);
		System.out.print("Name : ");
		this.name = sc.next();
		System.out.print("Rollno. : ");
		this.rollno = sc.nextInt();
		System.out.print("Backlog count : ");
		this.backlog = sc.nextInt();
		System.out.print("Appering count : ");
		this.apperingcount = sc.nextInt();
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	
	public void setrollno(int rollno)
	{
		this.rollno=rollno;
	}
	public int getrollno()
	{
		return rollno;
	}
	
	public String toString()
	{
		return "name='" + name + '\'' + ", rollno=" +rollno + ", backlog=" + backlog + ", apperingcount+" +apperingcount;
	}
	
	public void setbacklog(int backlog)
	{
		this.backlog=backlog;
	}
	public int getbacklog()
	{
		return backlog;
	}
	
	public void setapperingcount(int apperingcount)
	{
		this.apperingcount=apperingcount;
	}
	public int getapperingcount()
	{
		return apperingcount;
	}
}
