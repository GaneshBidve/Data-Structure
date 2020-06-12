package com.csi.ds.queue;

public class Queue {

	int capacity = 5;
	int arr[] = null;

	Queue() {
		this.arr = new int[capacity];
	}

	Queue(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
	}

	public static void main(String[] args) {

		Queue q = new Queue();

	}
}
