package Trees;

import java.util.LinkedList;

public class LevelOrderQue {

	public static void main(String[] args) {
		BTNode root = new BTNode(4);
		root.left = new BTNode(2);
		root.right = new BTNode(5);
		
		root.left.right = new BTNode(3);
		root.left.left = new BTNode(1);
		levelOrderTraversal(root);
	}

	public static void levelOrderTraversal(BTNode root) {
			if (root == null) {
			System.out.println("tree is empty");
			return;
		}
		LinkedList<BTNode> que = new LinkedList<BTNode>();
		que.push(root);
		while (!que.isEmpty()) {
			root = que.removeFirst();
			System.out.print(root.data + " ");
			if (root.left != null) {
				que.add(root.left);
			}
			if (root.right != null) {
				que.add(root.right);
			}

		}
	}
}
