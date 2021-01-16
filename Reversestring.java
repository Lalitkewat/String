package exercise;

/**
 * @author Lalit
 *
 ** Write a program to reverse String of a given name.
 */
public class Reversestring {public static void main(String[] args) {
	
	String name = "lalit";
	String rev="";
	
	for(int j=name.length();j>0;--j)
	{
	rev=rev+(name.charAt(j-1)); 
	}System.out.println("reverse name="+rev);
}
 }
 	    
		  
		      

	


 