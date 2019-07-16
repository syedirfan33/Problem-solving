package Udemy;

public class UniversalTree {

	static int counter = 0;

	public static void main(String[] args) {
		BinaryTreeNode node = new BinaryTreeNode(50);
		node.insert(75);
		node.insert(10);
		node.insert(20);
		node.insert(30);
		node.insert(85);
		node.insert(40);
		numberOfUniversalNodes(node.left);
		numberOfUniversalNodes(node.right);

		System.out.println(counter);
	}

	static void numberOfUniversalNodes(BinaryTreeNode root) {
		
	}
}


//        50
//    75      85
// 10   20   30  40 