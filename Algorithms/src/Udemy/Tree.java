package Udemy;

import java.util.ArrayList;
import java.util.List;

public class Tree {
	TreeNode root;
	
	Tree(){
		root = null;
	}
	
	@Override
	public String toString() {
		String s = "";
		if(this!=null) {
			System.out.println("Root is "+this.root.data);
			s = "Root is "+this.root.data;
			this.root.children.forEach(action->System.out.println(action.data));
		}
		return s;
	}
	
	void bfs() {
		List<TreeNode> arr = new ArrayList<>();
		arr.add(this.root);
		System.out.println("BFS ->");
		while(arr.size()>0) {
			TreeNode node = arr.get(0);
			arr.remove(0);
			node.children.forEach(action->arr.add(action));
			System.out.print(node.data+"-");
		}
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		TreeNode node = new TreeNode(100);
		node.add(55);
		node.add(66);
		tree.root = node;
		tree.toString();
		tree.bfs();
	}
}
