package binaryTree;

import java.util.Scanner;


public class BinaryTreeUse {
 public static final Scanner s =new Scanner(System.in);

	public static void printBinaryTree(BinaryTreeNode<Integer> root) {
     //TODO take of base case
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		printBinaryTree(root.left);
		printBinaryTree(root.right);

	/*	
		System.out.println(root.data);
		if(root.left!=null) {
		printBinaryTree(root.left);}
		if(root.right!=null) {
		printBinaryTree(root.right);}  */
	}
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
	     //TODO take of base case
			if(root==null) {
				return;
			}
			System.out.print(root.data+":");
			if(root.left!=null) {
				System.out.print("L"+ root.left.data+", ");
			}
			if(root.right!=null) {
				System.out.print("R"+ root.right.data+" ");
			}
			System.out.println();
			
			printTreeDetailed(root.left);
			printTreeDetailed(root.right);
	}
	public static BinaryTreeNode<Integer> takeInput(){
		System.out.println("Enter root data");
		int rootData=s.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer> (rootData);
		BinaryTreeNode<Integer> leftChild=takeInput();
		BinaryTreeNode<Integer> rightChild=takeInput();
		root.left=leftChild;
		root.right=rightChild;
		return root;
	}
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root data");
		}else {
			if(isLeft) {
				System.out.println("Enter the left child of : "+parentData);
			}else {
				System.out.println("Enter the right child of : "+parentData);

			}
		}
	
	  int rootData=s.nextInt();
	  if(rootData==-1) {
		  return null;
	  }
	  BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
	  BinaryTreeNode<Integer> leftChild=takeInputBetter(false,rootData,true);
	  BinaryTreeNode<Integer> rightChild=takeInputBetter(false,rootData,false);
	  root.left=leftChild;
	  root.right=rightChild;
		
		return root;
		
	}
	public static int numberOfNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftChildNodes=numberOfNodes(root.left);
		int rightChildNodes=numberOfNodes(root.right);
		return 1+leftChildNodes+rightChildNodes;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<>(2);
//
//		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<>(3);
//
//		root.left = rootLeft;
//		root.right = rootRight;
//
//		BinaryTreeNode<Integer> rootLeftRight = new BinaryTreeNode<>(4);
//		BinaryTreeNode<Integer> rootRightLeft = new BinaryTreeNode<>(5);
//
//		rootLeft.right = rootLeftRight;
//		rootRight.left = rootRightLeft;
		
		BinaryTreeNode<Integer> root=takeInputBetter(true,0,true);
		printTreeDetailed(root);
		System.out.println("number of nodes "+numberOfNodes(root));
		s.close();

	}

}
