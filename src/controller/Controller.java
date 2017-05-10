package controller;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import model.*;

public class Controller 
{
	private Queue<Customer> customers;
	private Stack<String> strings;
	
	
	public Controller()
	{
		customers = new LinkedList<Customer>();
		strings = new Stack<String>();
	}
	
	public void start()
	{
		Customer one = new Customer("A");
		Customer two = new Customer("B");
		Customer three = new Customer("C");
		customers.add(one);
		customers.add(two);
		customers.add(three);
		customers.remove();
		
		System.out.println(customers.peek());
		
		String stringVariable = "String";
		String variableString = "Strings";
		
		strings.push(stringVariable);
		strings.push(variableString);
		
		strings.pop();
		
		System.out.println(strings.peek());
	}
}
