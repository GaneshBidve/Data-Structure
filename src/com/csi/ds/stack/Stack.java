package com.csi.ds.stack;

public class Stack {
	int arr[] = null;
	int capacity = 6;
	
	public Stack() {
		this.arr=new int[capacity];
	}

	private void push(int i) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {

		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		System.out.println(s);
	}

}
