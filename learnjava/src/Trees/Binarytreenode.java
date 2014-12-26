package Trees;



public class Binarytreenode {
	public Binarytreenode left;
    public Binarytreenode right;
    public int data;

    public Binarytreenode(int data)
    {
        this.data=data;
    }
    
//    public void byLevel(Binarytreenode root){
//        Queue<Binarytreenode> q  = new LinkedList<Binarytreenode>();
//        q.add(root);
//        while(!q.isEmpty())
//        {
//            Binarytreenode temp = q.poll();
//            System.out.print(temp.data);
//            
//            if(root.left!= null){
//            	 q.add(root.left);
//            }
//           
//            if(root.right!= null){
//           	 q.add(root.right);
//            }
//        }
//        
// 
//   }
   
    //Traversal
    public void preorderTraverseTree(Binarytreenode root) {
     
    	       if (root != null) 
    	       {
     
                System.out.print(root.data);
     
    	            preorderTraverseTree(root.left);
    	            preorderTraverseTree(root.right);
    	       }
    }
    public void postorderTraverseTree(Binarytreenode root) {
        
	       if (root != null) 
	       {

         

	            postorderTraverseTree(root.left);
	            postorderTraverseTree(root.right);
	            System.out.print(root.data);
	       }
}
       
	public static void main(String ar[])
    {
    	
		Binarytreenode root = new Binarytreenode(3);
        Binarytreenode n1 = new Binarytreenode(1);
        Binarytreenode n2 = new Binarytreenode(4);
        Binarytreenode n3 = new Binarytreenode(2);
        Binarytreenode n4 = new Binarytreenode(5);

        root.left = n1;
        root.right = n2;
        root.right.left = n3;
        root.right.right = n4;
       root.preorderTraverseTree(root);
       System.out.println("\n");
       root.postorderTraverseTree(root);
       System.out.println("\n");
       //root.byLevel(root);
    }

}
