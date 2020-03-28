package Problem_5;

import Problem_5.Student;

public class Node 
{
	private Student s;
	private Node next;
	
	public Node(Student s)
	{
		this.s=s;
		next=null;
	}
	
	public void sets(Student s)
	{
		this.s=s;
	}
	public Student gets()
	{
		return s;
	}
	
	public void setnext(Node next)
	{
		this.next=next;
	}
	public Node getnext()
	{
		return next;
	}
}
