package Problem_3;

import Problem_5.Student;
public class Node 
{
	private Student s;
	private Node next;
	
	public Node()
	{
		s=new Student();
		next=null;
	}
	
	public void sets(Student s)
	{
		this.s = s;
	}
	public Student gets()
	{
		return s;
	}
	
	public void setnext(Node next)
	{
		this.next = next;
	}
	public Node getnext()
	{
		return next;
	}
}
