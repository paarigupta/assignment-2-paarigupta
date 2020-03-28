package Problem_2;

import Problem_1.Binary_Search_Tree;
import Problem_4.Myqueue;

public class Mymain_2 {

	public static void main(String[] args) 
	{
		Binary_Search_Tree obj1 = new Binary_Search_Tree();
		Methods mthds = new Methods();
		Myqueue pre = new Myqueue();
		Myqueue post = new Myqueue();
		int ctr=0;
		
		
		obj1.setroot();
		System.out.println("Root set successfully : "+ obj1.getroot().getdata());
		
		for(int i=0 ; i<5 ; i++)
		{
			obj1.insert(obj1.getroot());
		}
		
		mthds.setpre(pre);
		mthds.setpost(post);
		mthds.preorder(obj1.getroot());
		mthds.postorder(obj1.getroot());
		pre.queueprint(pre);
		post.queueprint(post);
		
		System.out.println("Verification of statment root element occurs first in pre-order and last in post-order");
		System.out.println(pre.getfront().getnode().getdata() == post.getend().getnode().getdata());
		
		//Verification of statement "Both the traversal will give same element at the mid position for odd numbers of node
		while(pre.gettemp() != null && ctr< pre.getsize(pre) / 2)
		{
			++ctr;
			pre.settemp(pre.gettemp().getnext());
		}
		assert pre.gettemp() != null;
		System.out.println(pre.gettemp().getnode().getdata());
		ctr=0;
		while(pre.gettemp() != null && ctr<pre.getsize(pre) / 2)
		{
			++ctr;
			post.settemp(post.gettemp().getnext());
		}
		System.out.println(post.gettemp().getnode().getdata());	
	}
}
