package Problem_1;

import Problem_1.Node;
import Problem_4.Myqueue;
import Problem_4.MyqueueNode;

public class Binary_Search_Tree 
{
	private Node newnode , root , temp;
	private Myqueue queue;
	private int totalinsertion;
	
	public  Binary_Search_Tree()
	{
		temp=null;
		root=null;
		totalinsertion=0;
		queue = new Myqueue();
	}
	
	public void setroot()
	{
		newnode = new Node();
		if(root==null)
		{
			root=newnode;
			temp=root;
			newnode=null;
		}
	}
	
	public Node getroot()
	{
		return root;
	}
	
	public void setnewnode(Node newnode)
	{
		this.newnode=newnode;
	}
	
	public Node getnewnode()
	{
		return newnode;
	}
	
	public int gettotalinsertion()
	{
		return totalinsertion;
	}
	public void settotalinsertion(int totalinsertion)
	{
		this.totalinsertion=totalinsertion;
	}
	public void setroot(Node root)
	{
		this.root = root;
	}
	
	public void settemp(Node temp)
	{
		this.temp=temp;
	}
	
	public Node gettemp()
	{
		return temp;
	}
	
	public void setNewnode (Node newnode)
	{
		this.newnode=newnode;
	}
	public Node getNewnode()
	{
		return newnode;
	}
	
	public void setqueue(Myqueue queue)
	{
		this.queue=queue;
	}
	public Myqueue getqueue()
	{
		return queue;
	}
	
	public void insert(Node temproot)
	{
		if(newnode==null)
		{
			newnode=new Node();
			++totalinsertion;
		}
		
		try
		{
			if(newnode.getdata() <= temproot.getdata())
			{
				System.out.println("Left traversal.....");
				if(temproot.getleft() == null)
				{
					temproot.setleft(newnode);
					System.out.println("Left Node inserted");
					queue.enqueue(new MyqueueNode(newnode));
					newnode=null;
					return;
				}
				else
				{
					System.out.println("Left is not empty");
					insert(temproot.getleft());
				}
			}
		}
		catch(NullPointerException ignore){}
		
		try
		{
			if(newnode.getdata() > temproot.getdata())
			{
				System.out.println("Right traversal.....");
				if(temproot.getright() == null)
				{
					temproot.setright(newnode);
					System.out.println("Right Node inserted");
					newnode=null;
					return;
				}
				else
				{
					System.out.println("Right is not empty");
					insert(temproot.getright());
				}
			}
		}
		catch(NullPointerException ignore){}
	}
		
		public void preorder(Node node)
		{
			if(node == null)
			{
				return;
			}
			preorder(node.getleft());
			preorder(node.getright());
			
		}
		
		public void postorder(Node node)
		{
			if(node == null)
			{
				return;
			}
			postorder(node.getleft());
			postorder(node.getright());		
		}	
	}
