import java.io.*; 
import java.util.*; 
import java.lang.*; 
  
public class ReverseWords { 

static String reverseWords(String str) 
{ 
    int i = str.length() - 1; 
    int start, end = i + 1; 
    String result = ""; 
      
    while(i >= 0) 
    { 
        if(str.charAt(i) == ' ') 
        { 
            start = i + 1; 
            while(start != end) 
                result += str.charAt(start++); 
              
            result += ' '; 
              
            end = i; 
        } 
        i--; 
    } 
      
    start = 0; 
    while(start != end) 
        result += str.charAt(start++); 
      
    return result; 
} 
  
// Main Function to run program 
public static void main(String[] args) {  

    System.out.println("Please enter the string: ");
    Scanner str = new Scanner(System.in);
    String str1 = str.nextLine(); 
      
    System.out.print(reverseWords(str1));
    } 
}