import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListTester {

	public static void main(String[] args) 
	{
		int randomLocation = 0;
		int randomValues = 0;
		long startTime = 0, endTime = 0;
		Random r = new Random();
		boolean removeAtBeginning = false, removeAtEnd = false, removeAtRandom = false, removeRandomNum = true;
		
		//Change n to test all problem sizes
		int n = 10;
		
		//PART A
		MyArrayList<Integer> myArrayList = new MyArrayList<Integer>(n);
		ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		
		
		//Insert at beginning
		System.out.println("=================TESTING INSERT AT BEGINNING=================\n");
		
		//MyLinkedList
		System.out.println("=================TESTING MyLinkedList=================");
		startTime = System.currentTimeMillis();
		for(int i = 0; i < n; i++)
		{
			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
			myLinkedList.add(0, randomValues);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Start time: " + startTime);
		System.out.println("End time: " + endTime);
		System.out.println("Time elapsed: " + (endTime - startTime));
//		System.out.println(myLinkedList.toString());
		
		//LinkedList
		System.out.println("=================TESTING LinkedList=================");
		startTime = System.currentTimeMillis();
		for(int i  = 0; i < n; i++)
		{
			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
			linkedList.add(0, randomValues);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Start time: " + startTime);
		System.out.println("End time: " + endTime);
		System.out.println("Time elapsed: " + (endTime - startTime));
//		System.out.println(linkedList.toString());
		
		//MyArrayList
		System.out.println("=================TESTING MyArrayList=================");
		startTime = System.currentTimeMillis();
		for(int i = 0; i < n; i++)
		{
			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
			myArrayList.add(0, randomValues);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Start time: " + startTime);
		System.out.println("End time: " + endTime);
		System.out.println("Time elapsed: " + (endTime - startTime));
//		System.out.println(myArrayList.toString());
		
		//ArrayList
		System.out.println("=================TESTING ArrayList=================");
		startTime = System.currentTimeMillis();
		for(int i = 0; i < n; i++)
		{
			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
			arrayList.add(0, randomValues);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Start time: " + startTime);
		System.out.println("End time: " + endTime);
		System.out.println("Time elapsed: " + (endTime - startTime));
//		System.out.println(arrayList.toString());
		
		//Clear lists
		myArrayList.clear();
		arrayList.clear();
		myLinkedList.clear();
		linkedList.clear();
		
		//Insert at end
		System.out.println("=================TESTING INSERT AT END=================\n");
		
		//MyLinkedList
		System.out.println("=================TESTING MyLinkedList=================");
		startTime = System.currentTimeMillis();
		for(int i  = 0; i < n; i++)
		{
			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
			myLinkedList.add(randomValues);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Start time: " + startTime);
		System.out.println("End time: " + endTime);
		System.out.println("Time elapsed: " + (endTime - startTime));
//		System.out.println(myLinkedList.toString());
		
		//LinkedList
		System.out.println("=================TESTING LinkedList=================");
		startTime = System.currentTimeMillis();
		for(int i  = 0; i < n; i++)
		{
			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
			linkedList.add(randomValues);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Start time: " + startTime);
		System.out.println("End time: " + endTime);
		System.out.println("Time elapsed: " + (endTime - startTime));
//		System.out.println(linkedList.toString());
		
		//MyArrayList
		System.out.println("=================TESTING MyArrayList=================");
		startTime = System.currentTimeMillis();
		for(int i = 0; i < n; i++)
		{
			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
			myArrayList.add(randomValues);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Start time: " + startTime);
		System.out.println("End time: " + endTime);
		System.out.println("Time elapsed: " + (endTime - startTime));
//		System.out.println(myArrayList.toString());
		
		//ArrayList
		System.out.println("=================TESTING ArrayList=================");
		startTime = System.currentTimeMillis();
		for(int i = 0; i < n; i++)
		{
			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
			arrayList.add(randomValues);
		}
		endTime = System.currentTimeMillis();
		System.out.println("Start time: " + startTime);
		System.out.println("End time: " + endTime);
		System.out.println("Time elapsed: " + (endTime - startTime));
//		System.out.println(arrayList.toString());
		
//		//Clear lists
//		myArrayList.clear();
//		arrayList.clear();
//		myLinkedList.clear();
//		linkedList.clear();

		
//		//Insert at random
//		System.out.println("=================TESTING INSERT AT RANDOM=================\n");
//		
//		//MyLinkedList
//		System.out.println("=================TESTING MyLinkedList=================");
//		startTime = System.currentTimeMillis();
//		for(int i  = 0; i < n; i++)
//		{
//			randomLocation = r.nextInt((n - 1) + 1) + 0;
//			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
//			myLinkedList.add(randomLocation, randomValues);
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("Start time: " + startTime);
//		System.out.println("End time: " + endTime);
//		System.out.println("Time elapsed: " + (endTime - startTime));
////		System.out.println(myLinkedList.toString());
//		
//		//LinkedList
//		System.out.println("=================TESTING LinkedList=================");
//		startTime = System.currentTimeMillis();
//		for(int i  = 0; i < n; i++)
//		{
//			randomLocation = r.nextInt((n - 1) + 1) + 0;
//			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
//			linkedList.add(randomLocation, randomValues);
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("Start time: " + startTime);
//		System.out.println("End time: " + endTime);
//		System.out.println("Time elapsed: " + (endTime - startTime));
////		System.out.println(linkedList.toString());
//		
//		//MyArrayList
//		System.out.println("=================TESTING MyArrayList=================");
//		startTime = System.currentTimeMillis();
//		for(int i = 0; i < n; i++)
//		{
//			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
//			randomLocation = r.nextInt((n - 1) + 1) + 0;
//			myArrayList.add(randomLocation, randomValues);
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("Start time: " + startTime);
//		System.out.println("End time: " + endTime);
//		System.out.println("Time elapsed: " + (endTime - startTime));
////		System.out.println(myArrayList.toString());
//		
//		//ArrayList
//		System.out.println("=================TESTING ArrayList=================");
//		startTime = System.currentTimeMillis();
//		for(int i = 0; i < n; i++)
//		{
//			randomValues = r.nextInt((2 * n - 0) + 1) + 0;
//			randomLocation = r.nextInt((n - 1) + 1) + 0;
//			arrayList.add(randomLocation, randomValues);
//		}
//		endTime = System.currentTimeMillis();
//		System.out.println("Start time: " + startTime);
//		System.out.println("End time: " + endTime);
//		System.out.println("Time elapsed: " + (endTime - startTime));
////		System.out.println(arrayList.toString());
		
		
		//PART B
		if(removeAtBeginning)
		{
			//Remove at beginning
			System.out.println("=================TESTING REMOVE AT BEGINNING=================\n");
			
			//MyLinkedList
			System.out.println("=================TESTING MyLinkedList=================");
			startTime = System.currentTimeMillis();
			for(int i  = 0; i < n; i++)
			{
				myLinkedList.remove(0);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(myLinkedList.toString());
			
			//LinkedList
			System.out.println("=================TESTING LinkedList=================");
			startTime = System.currentTimeMillis();
			for(int i  = 0; i < n; i++)
			{
				linkedList.remove(0);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(linkedList.toString());
			
			//MyArrayList
			System.out.println("=================TESTING MyArrayList=================");
			startTime = System.currentTimeMillis();
			for(int i = 0; i < n; i++)
			{
				myArrayList.remove(0);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(myArrayList.toString());
			
			//ArrayList
			System.out.println("=================TESTING ArrayList=================");
			startTime = System.currentTimeMillis();
			for(int i = 0; i < n; i++)
			{
				arrayList.remove(0);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(arrayList.toString());
		}
		
		if(removeAtEnd)
		{
			//Remove at end
			System.out.println("=================TESTING REMOVE AT END=================\n");
			
			//MyLinkedList
			System.out.println("=================TESTING MyLinkedList=================");
			startTime = System.currentTimeMillis();
			for(int i  = 0; i < n; i++)
			{
				myLinkedList.remove(myLinkedList.size() - 1);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(myLinkedList.toString());
			
			//LinkedList
			System.out.println("=================TESTING LinkedList=================");
			startTime = System.currentTimeMillis();
			for(int i  = 0; i < n; i++)
			{
				linkedList.remove(linkedList.size() - 1);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(linkedList.toString());
			
			//MyArrayList
			System.out.println("=================TESTING MyArrayList=================");
			startTime = System.currentTimeMillis();
			for(int i = 0; i < n; i++)
			{
				myArrayList.remove(myArrayList.size() - 1);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(myArrayList.toString());
			
			//ArrayList
			System.out.println("=================TESTING ArrayList=================");
			startTime = System.currentTimeMillis();
			for(int i = 0; i < n; i++)
			{
				arrayList.remove(arrayList.size() - 1);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(arrayList.toString());
		}
		
		if(removeAtRandom)
		{
			//Remove at random
			System.out.println("=================TESTING REMOVE AT RANDOM=================\n");
			
			//MyLinkedList
			System.out.println("=================TESTING MyLinkedList=================");
			startTime = System.currentTimeMillis();
			for(int i = n - 1; i >= 0; i--)
			{
				randomLocation = r.nextInt((i - 0) + 1) + 0;
				myLinkedList.remove(myLinkedList.size() - 1);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(myLinkedList.toString());
			
			//LinkedList
			System.out.println("=================TESTING LinkedList=================");
			startTime = System.currentTimeMillis();
			for(int i = n - 1; i >= 0; i--)
			{
				randomLocation = r.nextInt((i - 0) + 1) + 0;
				linkedList.remove(linkedList.size() - 1);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(linkedList.toString());
			
			//MyArrayList
			System.out.println("=================TESTING MyArrayList=================");
			startTime = System.currentTimeMillis();
			for(int i = n - 1; i >= 0; i--)
			{
				randomLocation = r.nextInt((i - 0) + 1) + 0;
				myArrayList.remove(randomLocation);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(myArrayList.toString());
			
			//ArrayList
			System.out.println("=================TESTING ArrayList=================");
			startTime = System.currentTimeMillis();
			for(int i = n - 1; i >= 0; i--)
			{
				randomLocation = r.nextInt((i - 0) + 1) + 0;
				arrayList.remove(randomLocation);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(arrayList.toString());
		}
		
		//Part C
		
		if(removeRandomNum)
		{
			//Remove at random
			System.out.println("=================TESTING REMOVE RANDOM NUMBERS=================\n");
			
//			//MyLinkedList
//			System.out.println("=================TESTING MyLinkedList=================");
//			startTime = System.currentTimeMillis();
//			while(myLinkedList.size() != 0)
//			{
//				randomValues = r.nextInt((2 * n - 0) + 1) + 0;
//				myLinkedList.remove((Object) randomValues);
//			}
//			endTime = System.currentTimeMillis();
//			System.out.println("Start time: " + startTime);
//			System.out.println("End time: " + endTime);
//			System.out.println("Time elapsed: " + (endTime - startTime));
//			System.out.println(myLinkedList.toString());
			
			//LinkedList
			System.out.println("=================TESTING LinkedList=================");
			startTime = System.currentTimeMillis();
			while(linkedList.size() != 0)
			{
				randomValues = r.nextInt((2 * n - 0) + 1) + 0;
				linkedList.remove((Object) randomValues);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(linkedList.toString());
			
			//MyArrayList
			System.out.println("=================TESTING MyArrayList=================");
			startTime = System.currentTimeMillis();
			while(myArrayList.size() != 0)
			{
				randomValues = r.nextInt((2 * n - 0) + 1) + 0;
				myArrayList.remove((Object) randomValues);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(myArrayList.toString());
			
			//ArrayList
			System.out.println("=================TESTING ArrayList=================");
			startTime = System.currentTimeMillis();
			while(arrayList.size() != 0)
			{
				randomValues = r.nextInt((2 * n - 0) + 1) + 0;
				arrayList.remove((Object) randomValues);
			}
			endTime = System.currentTimeMillis();
			System.out.println("Start time: " + startTime);
			System.out.println("End time: " + endTime);
			System.out.println("Time elapsed: " + (endTime - startTime));
			System.out.println(arrayList.toString());
		}
	}

}
