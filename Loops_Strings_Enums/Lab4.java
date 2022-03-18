/**C.Edwards**/
import java.util.Scanner;

public class Lab4 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    int x;
    String output= "";
    
    //Declare Scanner for user input
    Scanner in = new Scanner(System.in);
    
    //User Prompt
    System.out.println("Enter a number: ");
    x = in.nextInt();
    in.close();
 /**   
    //for loop example
    for(int i = 0;i<x;i++) {
      output = output + i + " ";           
      //i=i+1;     
    }
    
    System.out.println(output); **/
    
    
    
   //while loop example
    
    int current = 0;
    
    while(current<x) {
      System.out.print(current + " ");
      current = current +1;
    
    }  
    
    
    }//main close
    
    
    

  }


