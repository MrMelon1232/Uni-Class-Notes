import java.util.Random;

//Iterrative version
public class MyBSTV2 {
	
	public static Node2 insert(Node2 root, int key)
	{
		Node2 current = root;
		Node2 parent = null;
		
		if(root == null)
			return new Node2(key);
		
		//Until we haven't reached a null/empty node
		while(current != null)
		{
			parent = current;
			//if the key is smaller than the current node key
			if(key < current.data)
				current = current.left;
			//if the key is bigger than the current node key
			else
				current = current.right;
		}
		
		if(key < parent.data)
			parent.left = new Node2(key);
		else
			parent.right = new Node2(key);
		
		return root;
	}
	
	public static void outputInOrder(Node2 root)
	{
		if(root == null)
			return;
		outputInOrder(root.left);
		System.out.print(root.data + " ");
		outputInOrder(root.right);
	}
	
	public static void main(String[]str)
	{
		int randomNumber = 0;
		int sizeofTree = 11;
		Node2 root = null;
		Random r =  new Random();
		int arr[] = {15,25,20,22,30,18,10,8,9,12,6};
		
		for(int i = 0; i < sizeofTree; i++)
		{
			randomNumber = r.nextInt((99 - 0) + 1) + 0;
			root = insert(root, arr[i]);
		}
		outputInOrder(root);
	}
}

class Node2
{
	int data;
	Node2 left,right;
	
	Node2(int key)
	{
		data = key;
		right = null;
		left = null;
	}
}