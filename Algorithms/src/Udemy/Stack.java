package Udemy;

public class Stack {
	int size,capacity,front,rear;
	int arr[];
	
	Stack(int capacity) {
		this.size = front = 0;
		this.rear = capacity-1;
		this.capacity = capacity;
		this.arr = new int[this.capacity];
	}
	
	boolean isFull(Stack stack) {
		return stack.size == stack.capacity;
	}
	
	boolean isEmpty(Stack stack) {
		return stack.size == 0;
	}
	
	void push(int item) {
		if(isFull(this)) 
			return;
		
		arr[this.front] = item;
		this.rear = (this.rear+1)%this.capacity;
		this.front++;
		size++;
		System.out.println(item+" is pushed "+"front="+this.front+",rear="+this.rear);
	}
	
	int pop() {
		if(isEmpty(this))
			return -1;
		
		int item = arr[this.rear];
		this.rear = (this.rear-1)%this.capacity;
		size--;
		return item;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder("[");
		for(int i=0;i<=this.rear;i++) {
			s.append(this.arr[i]+",");
		}
		s.replace(s.length()-1, s.length(), "]");
		return s.toString();
	}
}
