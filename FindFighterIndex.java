package finalProject;

import java.util.Scanner;

public class FindFighterIndex {
	// Max Crutchfield
		// red id: 822330295
		// 05/14/20
	
	 int binarySearch(int arr[], int l, int r, int x) 
	    { 
	        if (r >= l) { 
	            int mid = l + (r - l) / 2; 
	  
	            // If the element is present directly in the middle
	            if (arr[mid] == x) 
	                return mid; 
	  
	            
	            if (arr[mid] > x) 
	                return binarySearch(arr, l, mid - 1, x); 
	  
	            
	            return binarySearch(arr, mid + 1, r, x); 
	        } 
	  
	        
	        return -1; 
	    } 
	  
	     
	    public static void result() 
	    { 
	    	Scanner scan = new Scanner(System.in);
	        FindFighterIndex ob = new FindFighterIndex();         
	        int arr[] = { 1, 2, 3}; 
	        System.out.println("Select which fighter you chose to see which index they are at");
	        System.out.println("[1 (Demon Hunter), 2 (Barbarian), 3 (Wizard)");
	        int n = arr.length; 	        
	        int x = scan.nextInt(); 
	        int result = ob.binarySearch(arr, 0, n - 1, x); 
	        if (result == -1) 
	            System.out.println("Element not present"); 
	        else
	            System.out.println("Element found at index " + result); 
	    } 
	} 