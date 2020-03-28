package Problem_4;

import Problem_1.Node;

public class Myqueue 
{
	private MyqueueNode  front , end , temp;
	private int size;
	
	public Myqueue()
	{
		front=null;
		end=null;
		temp=null;
		size=0;
	}
	
	public void setsize(int size)
	{
		this.size=size;
	}
	
	public int getsize(Myqueue queue)
	{
		size=0;
		while(queue.front!=null)
		{
			++size;
			queue.setfront(queue.front.getnext());
		}
		queue.setfront(queue.gettemp());
		return size;
	}
	
	public void setfront(MyqueueNode front)
	{
		this.front = front;
	}
	
	public MyqueueNode getfront()
	{
		return front;
	}
	
	public void setend(MyqueueNode end)
	{
		this.end=end;
	}
	public MyqueueNode getend()
	{
		return end;
	}
	
	public void settemp(MyqueueNode temp)
	{
		this.temp=temp;
	}
	public MyqueueNode gettemp()
	{
		return temp;
	}
	
	public void queueprint(Myqueue queue)
	{
		while(queue.temp != null)
		{
			System.out.print(queue.temp.getnode().getdata()+",");
			queue.temp=queue.temp.getnext();
		}
		System.out.println("\b");
		queue.temp=queue.front;
	}
	
	public void enqueue(MyqueueNode node)
	{
		if(front == null)
		{
			temp= front=end=node;
		}
		else
		{
			while(temp.getnext() != null)
			{
				temp = temp.getnext();
			}
			end=node;
			temp.setnext(node);
			temp=front;		
		}
	}
	
	
	public int getsuccessor(int data)
	{
		temp = front;
		try {
		while(temp.getnode().getdata() != data && temp != null)
		{
			temp = temp.getnext();
		}
			assert temp != null;
			return temp.getnext().getnode().getdata();
		}
		catch(NullPointerException ignore)
		{
			System.out.println("No preorder successor found");
			return -1;
		}
	}

}
