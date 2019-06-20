package t1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Pattern;

public class array {

//	public static void main(String[] args) {
//		
//	Integer[] arr=new Integer[5];
//	arr[0]=18;
//	arr[1]=15;
//	arr[2]=12;
//	arr[3]=13;
//	arr[4]=19;
//	System.out.println(Arrays.toString(arr));
//	Arrays.sort(arr);
//	System.out.println(Arrays.toString(arr));
//	Arrays.sort(arr, Collections.reverseOrder());
//	System.out.println(Arrays.toString(arr));
//	
//
//	
//	}
	
	

	
	
//	public static void main(String[] args) {
//	      String str = "the sky is blue";
//	      Pattern p = Pattern.compile(" ");
//	      System.out.println("The original string is: " + str);
//	      String[] temp = p.split(str);
//	      String rev = "";
//	      for (int i = 0; i < temp.length; i++) {
//	         if (i == temp.length - 1)
//	            rev = temp[i] + rev;
//	         else
//	            rev = " " + temp[i] + rev;
//	      }
//	      System.out.println("The reversed string is: " + rev);
	
	
//	public static void main(String[] args) {
//		String rev="";
//		String str= "my name is sahil bansal hello";
//		System.out.println(str);
//	//	Pattern p=Pattern.compile(" ");
//	//	String[] s1 = p.split(str);
//		String[]s1=str.split(" ");
//		for (int i = 0; i < s1.length; i++) {
//
//				rev=s1[i]+" "+rev;	  
//		}
//		
//		System.out.println("The reversed string is: " + rev);
//	}
//	 static boolean areAnagram(String [] str1, String[] str2) 
//	    { 
//	        // Get lenghts of both strings 
//	        int n1 = str1.length; 
//	        int n2 = str2.length; 
//	  
//	        // If length of both strings is not same, 
//	        // then they cannot be anagram 
//	        if (n1 != n2) 
//	            return false; 
//	  
//	        // Sort both strings 
//	        Arrays.sort(str1); 
//	        Arrays.sort(str2); 
//	  
//	        // Compare sorted strings 
//	        for (int i = 0; i < n1; i++) 
//	            if (str1[i] != str2[i]) 
//	                return false; 
//	  
//	        return true; 
//	    } 
//	  
//	    /* Driver program to test to print printDups*/
//	    public static void main(String args[]) 
//	    { 
//	        String str1[] = { "sam", "is", "a", "good" }; 
//	        String str2[] = { "sam", "is", "a", "good" }; 
//	        if (areAnagram(str1, str2)) 
//	            System.out.println("The two strings are"
//	                               + " anagram of each other"); 
//	        else
//	            System.out.println("The two strings are not"
//	                               + " anagram of each other"); 
//	    } 

//	public static boolean anagram(String[]s1,String[]s2) {
//		int x=s1.length;
//		int y=s2.length;
//		if(x!= y) 
//			return false;
//		
//		Arrays.sort(s1);
//		Arrays.sort(s2);
//		
//		for(int i =0 ;i<s1.length;i++) {
//			if(s1[i]!=s2[i])
//				return false;
//		}
//			return true;
//						
//		}
//public static void main(String[] args) {
//	String s1[]= {"sam","ram","sahil","ajay"};
//	String s2[]= {"ram","sahil","ajay","sam"};
//	if (anagram(s1,s2)){
//		 System.out.println("The two strings are"
//                 + " anagram of each other"); }
//else
//System.out.println("The two strings are not"
//                 + " anagram of each other");
//	}
	
//	    public static void main(String[] args)
//	    {
//	       Map<Integer, String> testMap = new LinkedHashMap<Integer, String>();
//	        testMap.put(10, "a");
//	        testMap.put(20, "b");
//	        testMap.put(30, "c");
//	        testMap.put(40, "d");
//	        testMap.put(41, "d");
//	  
////	        Iterator<Entry<Integer, String>> a = testMap.entrySet().iterator();
////	        System.out.println(a.next());
////	        System.out.println(a.next());
////	        System.out.println(a.next());
////	        System.out.println(a.next());
////	        System.out.println(a.next());
////	        
//	        for (Entry<Integer, String> entry : testMap.entrySet()) {
//	            Integer key=entry.getKey();
//	            String value=entry.getValue();
//	            System.out.println(key);
//	            System.out.println(value);
//	            
//	        }
//
//    }
	
//	public static void main(String[] args) {
//		String str="aaaaaaaabbbbbbcccc";
//		char[] ch = str.toCharArray();
//		Set<Character>sa=new HashSet<Character>();
//		for(Character c:ch) {
//			sa.add(c);
//		}
//		
//		StringBuilder sb=new StringBuilder();
//		for(Character c1:sa){
//		sb.append(c1);
//		
//	}
//		System.out.println(sb.toString());
//}

		

//         System.out.println("Prime numbers between 1 and " + limit);
//
//         //loop through the numbers one by one
//         for(int i=1; i < 100; i++){
//
//        	 int count=1;
//
//                 //check to see if the number is prime
//                 for(int j=2; j < i ; j++){
//
//                         if(i % j == 0){
//                        	 count=0;
//                                 break;
//                         }
//                 }
//                 // print the number
//                 if(count==1)
//                         System.out.print(i + " ");
//			
//		}
	
	
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num=scan.nextInt();
//		int count=1;
//		for(int i=2;i<num;i++) {
//			if(num%i==0) {
//				count=0;
//			}
//		}
//			if(count==1) {
//				System.out.println("number is prime");
//				
//			}
//			else {
//				System.out.println("number is not prime");
//			}
//		}
	
	
	
//	public static void main(String[] args) {
//		
//	
//	String str="aaaaaannnbbbdddss";
//	for(char c='a';c<='z';c++) {
//		int count=0;
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//		
//		if(c==ch) {
//		count++;	
//		}
//		
//	}
//	
//	
//	if(count>0) {
//		System.out.println(c+""+count);
//	}	
//	}
	
	
}


		
	

	
	
	


	
	
	





			
			
	
	
