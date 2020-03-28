package Problem_5;

import java.util.Scanner;

import Problem_5.CircularQueue;
import Problem_5.Node;
import Problem_5.Student;

public class Mymain_5 {

	public static void main(String[] args) 
	{
		CircularQueue obj = new CircularQueue();
		Node node;
		
		for(int i=0 ; i<5 ; i++)
		{
			node = new Node(new Student());
			obj.enqueue(node);
		}
		obj.printqueue();
		
		obj.remove(new Scanner(System.in).next());
		obj.printqueue();
		obj.process(new Scanner(System.in).next());

	}

}
