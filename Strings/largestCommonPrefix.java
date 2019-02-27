
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    static int findMinLength(String arr[], int n) 
    { 
        int min = Integer.MAX_VALUE; 
        for (int i = 0; i <= (n - 1); i++)  
        { 
            if (arr[i].length() < min) { 
                min = arr[i].length(); 
            } 
        } 
        return min; 
    } 
  
    static boolean allContainsPrefix(String arr[], int n,  
                         String str, int start, int end) 
    { 
        for (int i = 0; i <= (n - 1); i++) 
        { 
            String arr_i = arr[i]; 
              
            for (int j = start; j <= end; j++) 
                if (arr_i.charAt(j) != str.charAt(j)) 
                    return false; 
        } 
        return true; 
    } 

    static String commonPrefix(String arr[], int n) 
    { 
        int index = findMinLength(arr, n); 
        String prefix = ""; 
  
        int low = 0, high = index; 
        while (low <= high) { 
        
            int mid = low + (high - low) / 2; 
  
            if (allContainsPrefix(arr, n, arr[0], low, 
                                                  mid)) 
            { 
                
                prefix = prefix + arr[0].substring(low, 
                                          mid + 1); 
  
                low = mid + 1; 
            }  
            else 
            { 
                high = mid - 1; 
            } 
        } 
  
        return prefix; 
    } 
  
    
    public static void main(String args[]) 
    { 
        Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		for(int t =0; t<testCases; t++){
		    String string1 = scan.next();
		    String string2 = scan.next();
            String arr[] = new String[2];
            arr[0] = string1;
            arr[1] = string2;
            
            int n = arr.length; 
       
            String ans = commonPrefix(arr, n); 
          
            if (ans.length() > 0) 
                 System.out.println(ans); 
            else 
                System.out.println("-1"); 
        } 
    }
}
