import java.util.Random;

//Recursive version
public class MyBSTV1 {
	
	//Count global variable
	static int count = 0;
	
	//Insert method
	public static Node1 insert(Node1 root, int key)
	{
		if(root == null)
			return new Node1(key);
		
		//if the key is smaller than the current root node key
		if(key < root.data)
			root.left = insert(root.left, key);
		//if the key is bigger than the current root node key
		else
			root.right = insert(root.right, key);
		return root;
	}
	
	//Output in order method
	public static void outputInOrder(Node1 root)
	{
		if(root == null)
			return;
		outputInOrder(root.left);
		System.out.print(root.data + " ");
		outputInOrder(root.right);
	}
	
	//Functiont to check if data is in range
	public static boolean inRange(Node1 root, int min, int max)
	{
		return root.data >= min && root.data <= max;
	}
	
	//Get subtree count method
	public static boolean getsubtreeCount(Node1 root, int min, int max)
	{
		if(root == null)
			return true;
		
		boolean left = getsubtreeCount(root.left, min, max);
		boolean right = getsubtreeCount(root.right, min, max);
		
		//if node is in range and its children nodes are in range
		if(right && left && inRange(root, min, max))
		{
			System.out.print("\n" + root.data + " is a subtree");
			++count;
			return true;
		}
		
		return false;
	}
	
	//remove outside range method
	public static Node1 removeOutsideRange(Node1 root, int min, int max)
	{
		if(root == null)
			return null;
		
		root.left = removeOutsideRange(root.left, min, max);
        root.right = removeOutsideRange(root.right, min, max);
        
        //if the root data < min | remove root and return right subtree as a new root since left side will be all smaller than current node
        if(root.data < min)
        {
        	Node1 rightChild = root.right;
        	root = null;
        	return rightChild;
        }
        
        //if the root data > max | remove root and return left subtree as a new root since right side will be all bigger than current node
        if(root.data > max)
        {
        	Node1 leftChild = root.left;
        	root = null;
        	return leftChild;
        }
        
        return root;
	}
	
	//Main
	public static void main(String[]str)
	{
		int randomNumber = 0;
		int sizeofTree = 11;
		Node1 root = null;
		Random r =  new Random();
		int arr1[] = {15,25,20,22,30,18,10,8,9,12,6};
		int arr2[] = {18,23,12,28,15,9,33,25,13,11,21};
		int arr3[] = {22,48,19,4,13,78,83,59,29,17,66};

		
		for(int i = 0; i < sizeofTree; i++)
		{
			randomNumber = r.nextInt((99 - 0) + 1) + 0;
			root = insert(root, arr3[i]);
		}
		outputInOrder(root);
		getsubtreeCount(root, 8, 23);
		System.out.println("\nThe total number of subtrees is " + count);
		
		root = removeOutsideRange(root, 5, 40);
		System.out.println("The key within the valid range are: ");
		outputInOrder(root);
	}
}

class Node1
{
	int data;
	Node1 left,right;
	
	Node1(int key)
	{
		data = key;
		right = null;
		left = null;
	}
}

