package Udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TreeNode {
	int data;
	List<TreeNode> children;
	
	TreeNode(int data){
		this.data = data;
		this.children = new ArrayList<>();
	}
	
	void add(int data){
		TreeNode node = new TreeNode(data);
		this.children.add(node);
		
	}
	
	void remove(int data) {
		this.children = this.children.stream().filter(predicate-> predicate.data != data).collect(Collectors.toList());
	}
}
