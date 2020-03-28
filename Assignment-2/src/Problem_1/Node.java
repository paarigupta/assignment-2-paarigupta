package Problem_1;

import java.util.*;
import java.util.InputMismatchException;

public class Node 
{
	private Node left;
	private Node right;
	private int data;
	
	
	public Node()
	{
		System.out.print("Enter integer value: ");
		try {
		data = new Scanner(System.in).nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.print("Invalid input. ");
			e.getMessage();
			System.exit(-1);
		}
		left=right=null;
		
	}
	
	public void setleft(Node left)
	{
		this.left=left;
	}
	
	public Node getleft()
	{
		return left;
	}
	
	public void setright(Node right)
	{
		this.right=right;
	}
	
	public Node getright()
	{
		return right;
	}
	
	public void setdata(int data)
	{
		this.data=data;
	}
	
	public int getdata()
	{
		return data;
	}
	
}
