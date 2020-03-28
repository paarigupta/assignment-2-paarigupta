package Problem_1;

import Problem_1.Binary_Search_Tree;
import Problem_4.Myqueue;
import java.util.Scanner;

public class Mymain_1
{
	public static void main(String args[])
	{
		Binary_Search_Tree obj1 = new Binary_Search_Tree();
		
		obj1.setroot();
		System.out.println("root set : "+ obj1.getroot().getdata());
		
		for(int i=0 ; i<5 ; i++)
		{
			obj1.insert(obj1.getroot());
		}
		
		//printing left children
		obj1.getqueue().queueprint(obj1.getqueue());
		
		//Nodes not having left children
		System.out.println(obj1.gettotalinsertion() - obj1.getqueue().getsize(obj1.getqueue()));
	}
}
