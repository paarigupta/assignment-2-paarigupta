package Problem_3;

import Problem_3.Node;
public class MyPriorityQueue
{
	private Node temp , front , end;
	
	//inserting new student into queue and priority is set by roll no.
	public void enqueue(Node newnode)
	{
		if(front == null || newnode.gets().getrollno() < front.gets().getrollno())
		{
			newnode.setnext(front);
			front = newnode;
		}
		else
		{
			temp = front;
			while(temp.getnext() != null && temp.getnext().gets().getrollno() < newnode.gets().getrollno()) 
			{
				temp = temp.getnext();
			}
			newnode.setnext(temp.getnext());
			temp.setnext(newnode);
		}
	}
	
	public void dequeue()
	{
		if(front == null)
		{
			System.out.println("No entry");
			return;
		}
		do
		{
			System.out.print(front.gets().getname() + ":");
			System.out.println(front.gets().getrollno());
			front = front.getnext();
		}
		
		while(front != null);
	}
}
