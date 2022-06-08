package treeDS;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTree {
	
	public static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data=data;
			this.left=null;
			this.right=null;
		}
	}
	public static class createTree
	{
		static int index=-1;
		Node buildtree(int[] nodes)
		{
			index++;
			if(nodes[index]==-1)
			{
				return null;
			}
			Node node =new Node(nodes[index]);
			node.left = buildtree(nodes);
			node.right = buildtree(nodes);
			return node;
		}		
	}
	public static void preorder(Node node)
	{
		if(node==null)
		{
			return ;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	
	private static boolean checkidentical(Node root1, Node root2) {
		if(root1==null && root2==null)
		{
			return true;
		}
		if(root1==null || root2==null)
		{
			return false;
		}
		if(root1.data==root2.data)
				return checkidentical(root1.right,root2.right) && checkidentical(root1.left,root2.left);
		return false;
	}
	
	public static boolean compareNodes(Node root1,Node root2)
	{
		if(root2==null)
		{
			return true;
		}
		if(root1==null)
		{
			return false;
		}
		if(root1.data==root2.data)
		{
			if(checkidentical(root1,root2))
			{
				return true;
			}
		}
		if(compareNodes(root1.left,root2) || compareNodes(root1.right, root2))
			{
				return true;
			}
		return false;
		
	}
	
	static int NumberOfElements(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		return NumberOfElements(node.left)+NumberOfElements(node.right)+1;
	}
	static int hight(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		return Math.max(hight(root.left),hight(root.right))+1;
	}
	public static class TreeInfo {
		int height;
		int diameter;
		public TreeInfo(int height, int diameter) {
			this.height = height;
			this.diameter = diameter;
		}
		
	}
	static TreeInfo Diameter(Node root)
	{
		if(root==null)
		{
			return new TreeInfo(0,0);
		}
		TreeInfo left=Diameter(root.left);
		TreeInfo right=Diameter(root.right);
		int height=Math.max(left.height, right.height)+1;
		
		TreeInfo dia1=Diameter(root.left);
		TreeInfo dia2=Diameter(root.right);
		int dia3=dia1.height+dia2.height+1;
		int mydia=Math.max(Math.max(dia1.diameter, dia2.diameter),dia3);
		return new TreeInfo(height,mydia);
	}
	
	static void ElementsInLevels(Node root,Queue q,int sum)
	{
		
		if( q.peek()==null && !q.isEmpty())
		{
			q.poll();
			if(q.size()>0)
			{
				q.add(null);
				System.out.println("");
				ElementsInLevels((Node)q.peek(),q,sum);	
			}
			else
			{
				System.out.println("\nSum of elements : "+sum);
			}
			
			
		}
		else if(q.peek()!=null)
		{
			System.out.print(root.data+" ");
			sum=sum+root.data;
			if(root.left!=null)
			{
				q.add(root.left);	
			}
			if(root.right!=null)
			{
				q.add(root.right);	
			}
			q.poll();
			ElementsInLevels((Node)q.peek(),q,sum);	
		}
		
	}
	
	public static void main(String[] args) {
		int[] nodes= {1,2,3,5,-1,-1,-1,4,6,-1,-1,7,-1,-1,8,9,10,12,-1,-1,-1,11,-1,-1,-1};
		int[] nodes2= {3,6,-1,-1,7,-1,9,-1,-1};
//		int[] nodes2= {-1,-1};
		createTree node1=new createTree();
		Node root1=node1.buildtree(nodes);
		preorder(root1);
		System.out.println("\n_____________________\n");
		createTree.index=-1;
		createTree node2=new createTree();
		Node root2=node2.buildtree(nodes2);
//		System.out.println(root.data +" ");
		preorder(root2);
		System.out.println(compareNodes(root1,root2));
		System.out.println("height of tree : "+hight(root1));
		System.out.println("Diameter of tree : "+Diameter(root1).diameter);
		Queue<Node> q= new LinkedList<>();
		q.add(null);
		q.add(root1);
		int sum=0;
		ElementsInLevels(q.peek(),q,sum);
		
		
	}

}
//2206003893/01 