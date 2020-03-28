package Problem_4;

import Problem_1.Node;

public class MyqueueNode 
{
	private Node node;
	private MyqueueNode  next;
	
	public MyqueueNode ()
	{
		node = new Node();
		next = null;
	}
	
	public MyqueueNode(Node treenode)
	{
		node=treenode;
		next=null;
	}
	
	public void setnode(Node node)
	{
		this.node=node;
	}
	public Node getnode()
	{
		return node;
	}
	
	public void setnext(MyqueueNode next)
	{
		this.next = next;
	}
	
	public MyqueueNode getnext()
	{
		return next;
	}
}
