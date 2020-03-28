package Problem_2;

import Problem_1.Node;
import Problem_4.Myqueue;
import Problem_4.MyqueueNode;

public class Methods
{
	private Myqueue pre ,post;
	
	public Methods()
	{
		pre = new Myqueue();
		post = new Myqueue();
	}
	
	public void setpre(Myqueue pre)
	{
		this.pre = pre;
	}
	
	public Myqueue getpre()
	{
		return pre;
	}
	
	public void setpost(Myqueue post)
	{
		this.post = post;
	}
	
	public Myqueue getpost()
	{
		return post;
	}
	
	public void verify_A(Node root)
	{
		preorder(root);
		System.out.println("First element of preorder traversal:  "+ pre.getfront().getnode().getdata());
		postorder(root);
		System.out.println("Last element of postorder traversal:  "+ post.getend().getnode().getdata());
	}
		
		//Both the traversal will give same element at the mid position for odd number of nodes.
		public boolean verify_B(Node root)
		{
			pre.queueprint(pre);
			post.queueprint(post);
			int size = pre.getsize(pre);
			
			int ctr = 0;
			int predata =0;
			int postdata=0;
			
			if(size % 2 == 1) 
			{
				while (ctr < size/2 && pre.gettemp()!=null)
				{
					pre.settemp(pre.gettemp().getnext());
					ctr++;
				}
				ctr=0;
				try
				{
					assert pre.gettemp() != null;
					predata = pre.gettemp().getnode().getdata();
				}
				catch(NullPointerException ignore)
				{
					
				}
				
				while(ctr < size/2 && post.gettemp()!=null)
				{
					post.settemp(post.gettemp().getnext());
					ctr++;
				}
				try
				{
					assert post.gettemp() != null;
					postdata = post.gettemp().getnode().getdata();
				}
				catch(NullPointerException ignore)
				{
					
				}
				System.out.println(predata + "pre data");
				System.out.println(postdata + "post data");
				return predata == postdata;
			}
			else
			{
				System.out.println("Number of elements in tree are even.");
				return false;
			}
		}
		
		//Preorder
		public void preorder(Node node)
		{
			if(node == null)
			{
				return;
			}
			
			pre.enqueue(new MyqueueNode(node));
			preorder(node.getleft());
			preorder(node.getright());
		}
		
		public void postorder(Node node)
		{
			if(node == null)
			{
				return;
			}
			
			post.enqueue(new MyqueueNode(node));
			postorder(node.getleft());
			postorder(node.getright());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
