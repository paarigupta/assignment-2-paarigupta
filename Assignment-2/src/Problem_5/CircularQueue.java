package Problem_5;

import Problem_5.Node;

public class CircularQueue 
{
	private Node front , temp , end;
	
	public CircularQueue()
	{
		front=null;
		temp=null;
		end=null;
	}
	
	public void setfront(Node front)
	{
		this.front=front;
	}
	public Node getfront()
	{
		return front;
	}
	
	public void settemp(Node temp)
	{
		this.temp=temp;
	}
	public Node gettemp()
	{
		return temp;
	}
	
	public void enqueue(Node newnode)
	{
		if(front == null)
		{
			temp=front=newnode;
			return;
		}
		if(temp.getnext() == null)
		{
			temp.setnext(newnode);
			newnode.setnext(temp);
			end=newnode;
			return;
		}
		newnode.setnext(temp.getnext());
		temp.setnext(newnode);
	}
	
	public void printqueue()
	{
		temp=front;
		try
		{
			do {
				System.out.println(temp.gets().toString());
				temp=temp.getnext();
			}
			while(temp != front && temp != null);
		}
		catch(NullPointerException ignore) 
		{
		}
	}
	
	public void remove(String name)
	{
		temp = front;
		if(temp.gets().getname().contentEquals(name) && temp.gets().getbacklog()==0)
		{
			temp = front = front.getnext();
		}
		while(!temp.getnext().gets().getname().contentEquals(name))
		{
			temp=temp.getnext();
			if(temp==front)
				return;
		}
		if(temp.gets().getbacklog() == 0)
		{
			temp.setnext(temp.getnext().getnext());
		}
	}
	
	public void process(String name)
	{
		temp=front;
		if(temp.gets().getname().equals(name))
		{
			System.out.println(temp.gets().toString());
			System.out.println(temp.gets().getbacklog()-temp.gets().getapperingcount());
		}
		while(!temp.gets().getname().contentEquals(name))
		{
			temp=temp.getnext();
			if(temp==front)
				return;
		}
		System.out.println(temp.gets().toString());
		System.out.println(temp.gets().getbacklog()-temp.gets().getapperingcount());
	}
}
