package Trees;

public class CountLeafnode {
	public static void main(String args[]) {
		BTNode root = new BTNode(4);
		root.left = new BTNode(2);
		root.right = new BTNode(5);
		root.left.left = new BTNode(1);
		root.left.right = new BTNode(3);
		int n = countLeaf(root);
		System.out.println("no of leaf node \n"+n);
	}

	public static int countLeaf(BTNode p) {
		if (p == null) {
			return 0;
		}
		if (p.left == null && p.right == null) 
		{
			System.out.println(p.data);
			return 1;
		}
		return countLeaf(p.left) + countLeaf(p.right);
	}
}
