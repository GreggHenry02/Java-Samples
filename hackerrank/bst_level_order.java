import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

	static void levelOrder(Node root){
      //Write your code here
  	    int rank=0; 
        List<Node> current_rank = new ArrayList<Node>();
        List<Node> next_rank = new ArrayList<Node>();
        Node current_node;
        current_rank.add(root);
        int i;
        while (current_rank.size() != 0) {
            for (i=0;i<current_rank.size();i++) {
                current_node=current_rank.get(i);
                if (current_node.left != null) {
                    next_rank.add(current_node.left);
                }
                if (current_node.right != null) {
                    next_rank.add(current_node.right);
                }                        
                System.out.print(current_node.data + " ");
            }
            rank++; 
            current_rank.clear();
            for (i=0;i<next_rank.size();i++) {
                current_rank.add(next_rank.get(i));
            }
            next_rank.clear();            
        }
    }

	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}
