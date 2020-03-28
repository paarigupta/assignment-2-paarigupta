package Problem_4;

import Problem_1.Binary_Search_Tree;
import Problem_2.Methods;
import Problem_4.Myqueue;
import java.util.Scanner;

public class Mymain_4 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		Methods mthds = new Methods();
		Binary_Search_Tree m = new Binary_Search_Tree();
		Myqueue q = new Myqueue();
		mthds.setpre(q);
		
		m.getroot();
		
		for(int i =0 ; i< 5 ; i++)
		{
			m.insert(m.getroot());
		}
		
		mthds.preorder(m.getroot());
		q.queueprint(q);
		System.out.print("Enter value of which you want to finnd preorder succe3ssor: ");
		System.out.println(q.getsuccessor(sc.nextInt()));
	}
}
