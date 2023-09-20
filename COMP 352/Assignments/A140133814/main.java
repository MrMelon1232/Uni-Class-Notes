import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class main {
	
	static int currentYear = 2021;
	
	//Sorter helper function
	public static void mergeSort(String[] pName, Date[] pDOB, String [] lowerName, String [] higherName, Date[] lowerDOB, Date[] higherDOB, int left, int right)
	{
		int i = 0, j = 0, k = 0;
		
		while(i < left && j < right)
		{
			//Check if lower and higher are both seniors
			if((2021 - lowerDOB[i].getYear()) >= 65 && (2021 - higherDOB[j].getYear()) >= 65)
			{
				if(lowerDOB[i].getYear() <= higherDOB[j].getYear())
				{
					pName[k] = lowerName[i];
					pDOB[k] = lowerDOB[i];
					i++;
				}
				else
				{
					pName[k] = higherName[j];
					pDOB[k] = higherDOB[j];
					j++;
				}
				k++;
			}
			//Check if lower is senior
			else if ((currentYear - lowerDOB[i].getYear()) >= 65)
			{
				pName[k] = lowerName[i];
				pDOB[k] = lowerDOB[i];
				i++;
				k++;
			}
			//Check if higher is senior
			else if ((currentYear - higherDOB[j].getYear()) >= 65)
			{
				pName[k] = higherName[j];
				pDOB[k] = higherDOB[j];
				j++;
				k++;
			}
			//Not seniors
			else
			{
				if(lowerDOB[i].getYear() > higherDOB[j].getYear())
				{
					pName[k] = lowerName[i];
					pDOB[k] = lowerDOB[i];
					i++;
				}
				else
				{
					pName[k] = higherName[j];
					pDOB[k] = higherDOB[j];
					j++;
				}
				k++;
			}
		}
		
		while(i < left)
		{
			pName[k] = lowerName[i];
			pDOB[k] = lowerDOB[i];
			i++;
			k++;
		}
		
		while(j < right)
		{
			pName[k] = higherName[j];
			pDOB[k] = higherDOB[j];
			j++;
			k++;
		}
	}
	
	/* pseudo code:                        
	 * function: rearrangeParticipants(pName, pDOB, num_participants)
	 * 	Input: array of Strings pName, array of dates pDOB and number of participants
	 * 	Output: The total number of senior participants
	 * 	i <- 0
	 * 	left <- num_participants / 2
	 *  right <- num_participants - left
	 * 	num_senior_participants <- 0
	 * 
	 * 	if num_participants < 2 then
	 * 		return num_senior_participants;
	 * 	lowerName <- String[left]
	 *  higherName <- String[right]
	 *  lowerDOB <- Date[left]
	 *  higherDOB <- Date[right]
	 *  
	 *  for i <- 0 to left do
	 *  	lowerName[i] <- pName[i]
	 *  	lowerDOB[i] <- pDOB[i]
	 * 	
	 * 	for i <- 0 to right do
	 * 		higherName[i] <- pName[i + left]
	 * 		higherDOB[i] <- pDOB[i + left]
	 * 
	 * 	rearrangeParticipants(lowerName, lowerDOB, left)
	 *	rearrangeParticipants(higherName, higherDOB, right)
	 *  mergeSort(pName, pDOB, lowerName, higherName, lowerDOB, higherDOB, left, right)
	 *  
	 *  for i <- 0 to pDOB.length do
	 *  	if (currentYear - pDOB[i].getYear()) >= 65 then
	 * 			num_senior_participants++
	 */
	
	//rearrangeParticipants function
	public static int rearrangeParticipants(String[] pName, Date[] pDOB, int num_participants)
	{
		int i = 0;
		int left = num_participants / 2, right = num_participants - left;
		int num_senior_participants = 0;
		
		//Base Case
		if (num_participants < 2)
			return num_senior_participants;
		
		//Declare instances of lower and higher half of arrays
		String[] lowerName = new String[left], higherName = new String[right];
		Date[] lowerDOB = new Date[left], higherDOB = new Date[right];
		
		//Store data to lower half arrays
		for(i = 0; i < left; i++)
		{
			lowerName[i] = pName[i];
			lowerDOB[i] = pDOB[i];
		}

		//Store data to higher half arrays
		for(i = 0; i < right; i++)
		{
			higherName[i] = pName[i + left];
			higherDOB[i] = pDOB[i + left];
		}
		
		//Recursion calls ; sorts first and second half
		rearrangeParticipants(lowerName, lowerDOB, left);
		rearrangeParticipants(higherName, higherDOB, right);
		
		//Sorting
		mergeSort(pName, pDOB, lowerName, higherName, lowerDOB, higherDOB, left, right);
		
		for(i = 0; i < pDOB.length; i++)
		{
			if((currentYear - pDOB[i].getYear()) >= 65)
				num_senior_participants++;
		}
		return num_senior_participants;
	}
	
	/* pseudo code
	 * function displaySeniorsIncreasingOrder(pName, pDOB, num_senior_participants)
	 * 	Input: array of Strings pName, array of dates pDOB and number of senior participants
	 * 	print name and DOB at index num_senior_participants - 1
	 *  if num_senior_participants != 1
	 * 		displaySeniorsIncreasingOrder(pName, pDOB, num_senior_participants - 1)
	 */
	
	//displaySeniorsIncreasingOrder function
	public static void displaySeniorsIncreasingOrder(String [] pName, Date[] pDOB, int num_senior_participants)
	{	
		System.out.println("Name: " + pName[num_senior_participants - 1] + " and DOB: " + pDOB[num_senior_participants - 1].getDate() + "-" + pDOB[num_senior_participants - 1].getMonth() + "-" + pDOB[num_senior_participants - 1].getYear());
		if(num_senior_participants != 1)
			displaySeniorsIncreasingOrder(pName, pDOB, num_senior_participants - 1);
	}
	
	/* pseudo code
	 * function displayNonSeniorsInreasingOrder(pName, pDOB, num_non_senior_participants, num_participants)
	 * 	Input: array of Strings pName, array of dates pDOB, the number of non senior participants and the total number of participants
	 * 	print name and DOB at index num_non_senior_participants
	 * 	if num_non_senior_participants != num_participants - 1
	 * 		displayNonSeniorsInreasingOrder(pName, pDOB, num_non_senior_participants + 1, num_participants)
	 */
	
	//displayNonSeniorsInreasingOrder function
	public static void displayNonSeniorsInreasingOrder(String [] pName, Date[] pDOB, int num_non_senior_participants, int num_participants)
	{
		System.out.println("Name: " + pName[num_non_senior_participants] + " and DOB: " +  pDOB[num_non_senior_participants].getDate() + "-" + pDOB[num_non_senior_participants].getMonth() + "-" + pDOB[num_non_senior_participants].getYear());
		if(num_non_senior_participants != num_participants - 1)
			displayNonSeniorsInreasingOrder(pName, pDOB, num_non_senior_participants + 1, num_participants);
	}
	
	/* pseudo code
	 * function: displayIncreasingOrder(pName, pDOB, num_senior_participants, num_participants)
	 * 	Input: array of Strings pName, array of dates pDOB, the number of senior participants and the total number of participants
	 * 	for i <- num_senior_participants to num_participants do
	 * 		print name and DOB at index i
	 * 	for i <- num_senior_participants - 1 to 0 do
	 * 		print name and DOB at index i
	 */
	
	
	//displayIncreasingOrder function
	public static void displayIncreasingOrder(String [] pName, Date[] pDOB, int num_senior_participants, int num_participants)
	{
		//Printout non senior participants in increasing order of age
		for(int i = num_senior_participants; i < num_participants; i++)
			System.out.println("Name1 " + pName[i] + " and DOB: " + pDOB[i].getDate() + "-" + pDOB[i].getMonth() + "-" + pDOB[i].getYear());
		//Printout senior participants in increasing order of age
		for(int i = num_senior_participants - 1; i >= 0; i--)
			System.out.println("Name2 " + pName[i] + " and DOB: " + pDOB[i].getDate() + "-" + pDOB[i].getMonth() + "-" + pDOB[i].getYear());
	}
	
	public static void main(String[] args) 
	{
		Date[] testDOB = {
				new Date(),
				new Date(),
				new Date(),
				new Date()
		};
		String[] testName = new String[4];
		testDOB[0].setDate(1);
		testDOB[0].setMonth(1);
		testDOB[0].setYear(2010);
		testDOB[1].setDate(24);
		testDOB[1].setMonth(2);
		testDOB[1].setYear(2009);
		testDOB[2].setDate(11);
		testDOB[2].setMonth(2);		
		testDOB[2].setYear(1995);
		testDOB[3].setDate(29);
		testDOB[3].setMonth(6);
		testDOB[3].setYear(1950);
		
		testName[0] = "Linda";
		testName[1] = "Sam";
		testName[2] = "Roger";
		testName[3] = "Alfred";
		
		System.out.println("rearrangeParticipants function");
		int ok = rearrangeParticipants(testName, testDOB, 4);
		System.out.println(ok);
		System.out.println("INDEX 0: " + testDOB[0].getYear() + "\nINDEX 1: " + testDOB[1].getYear() + "\nINDEX 2: " + testDOB[2].getYear() + "\nINDEX 3: " + testDOB[3].getYear());
		System.out.println("displaySeniorsIncreasingOrder function");
		displaySeniorsIncreasingOrder(testName, testDOB, 2);
		System.out.println("displayNonSeniorsInreasingOrder function");
		displayNonSeniorsInreasingOrder(testName, testDOB, 2, 4);
		System.out.println("displayIncreasingOrder function");
		displayIncreasingOrder(testName, testDOB, 2, 4);
				
	}
	
	/* Time complexity for:
	 *  rearrangeParticipants: O(n log(n))
	 * 	displaySeniorsIncreasingOrder: O(2^n)
	 *  displayNonSeniorsInreasingOrder: O(2^n)		 	
	 *  displayIncreasingOrder: O(2^n)
	 *  
	 *  
	 * b) The method used for sorting recursively is the merge sort method. This algorithm is linear since its time complexity
	 *    is always the same for all 3 cases meaning worst, average and best (it is nlog(n)) due to it always dividing the array into two halves, taking linear time to merge them.  
	 *	  My algorithm does not use tail recursion as its last step is not the recursive call. 
	 *	  A tail-recursive method can most likely be designed for this problem	  
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
