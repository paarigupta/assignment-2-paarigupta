package Problem_3;

import Problem_3.MyPriorityQueue;
import Problem_3.Node;

public class Mymain_3 {

	public static void main(String[] args)
	{
		MyPriorityQueue m = new MyPriorityQueue();
		for(int i=0 ; i< 4 ; i++)
		{
			Node newnode = new Node();
			m.enqueue(newnode);
		}
		m.dequeue();
	}
}
