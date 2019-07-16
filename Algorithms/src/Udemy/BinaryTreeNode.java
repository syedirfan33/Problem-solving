package Udemy;

public class BinaryTreeNode {
	
	int data;
	BinaryTreeNode left,right;
	
	BinaryTreeNode(int data){
		this.data = data;
	}
	
	void insert(int value) {
		if(value <= data) {
			if(left==null) {
				left = new BinaryTreeNode(value);
			}else {
				left.insert(value);
			}
		}else {
			if(right==null) {
				right = new BinaryTreeNode(value);
			}else {
				right.insert(value);
			}
		}
	}

	boolean contains(int value) {
		if(value == data) {
			return true;
		}else if(value < data) {
			if(left ==null) {
				return false;
			}else {
				return left.contains(value);
			}
		}else {
			if(right==null) {
				return false;
			}else {
				return right.contains(value);
			}
		}
	}
	
	void printInOrder() {
		if(left !=null) {
			left.printInOrder();
		}
		System.out.print(data+" ");
		if(right!=null) {
			right.printInOrder();
		}
	}
	void printInPreOrder() {
		System.out.print(data+" ");
		if(left !=null) {
			left.printInOrder();
		}
		if(right!=null) {
			right.printInOrder();
		}
	}
	
	void printInPostOrder() {
		if(left !=null) {
			left.printInOrder();
		}
		if(right!=null) {
			right.printInOrder();
		}
		System.out.print(data+" ");

	}
	
	boolean validate(BinaryTreeNode node, Integer min, Integer max) {
		if(min!=null && node.data < min) {
			return false;
		}
		
		if(max!=null && node.data > max) {
			return false;
		}
		
		if(node.left!=null && !validate(node.left, min, node.data)) {
			return false;
		}
		
		if(node.right!=null && !validate(node.right, node.data, max)) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		BinaryTreeNode node = new BinaryTreeNode(50);
		node.insert(75);
		node.insert(25);
		node.insert(15);
		node.insert(30);
		node.insert(85);
		node.printInOrder();
		System.out.println();
		node.printInPreOrder();
		System.out.println();
		node.printInPostOrder();
		System.out.println(node.contains(6));
	}

}

//        50
//    75      85
//  
