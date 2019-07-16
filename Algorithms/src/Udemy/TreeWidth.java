package Udemy;

import java.util.ArrayList;
import java.util.List;

public class TreeWidth {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		n1.add(2);
		n1.children.get(0).add(5);
		n1.children.get(0).add(10);
		n1.children.get(0).add(15);
	

		List<Integer> intLi = findWidth(n1);
		System.out.println(intLi.toString());
	}
	
	static List<Integer> findWidth(TreeNode node){
		List<Integer> counterList = new ArrayList<Integer>();
		List<TreeNode> nodeList = new ArrayList<TreeNode>();
		int counter = 1;
		nodeList.add(node);
		nodeList.add(new TreeNode(Integer.MAX_VALUE));
		while(nodeList.size()>1) {
			TreeNode tn = nodeList.get(0);
			nodeList.remove(0);
			tn.children.stream().forEach(action->{
				nodeList.add(action);
				System.out.println("Childrens of "+tn.data+" are"+action.data);
			});
			if(nodeList.get(0).data == Integer.MAX_VALUE) {
				counterList.add(counter);
				counter = 1;
				nodeList.add(nodeList.size(), nodeList.get(0));
				nodeList.remove(0);
			}else {
				counter++;
			}
		}
		return counterList;

	}

}
