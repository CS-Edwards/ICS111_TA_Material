/**C.Edwards**/
import java.util.Scanner;

public class Method {
  
  /*Adds two integers and returns the value of the sum 
   * @param int  first integer to be added
   * @param int  second integer to be added
   * @return int sum of two parameters
   */
  
private static void add(int x, int y) {
   System.out.println(x+y);
   //return x+y;    
  }
  
//  public int add(int x, int y) {
//    int a = x;
//    int b = y;
//    int c = a+b;
    
    //Scanner in = new Scanner(System.in);
    //System.out.println("Enter Number: ");
    //in.nextInt();
    //in.close();
    
 //  return c;
 //   //return x+y;    
 // }
  

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //call the function
    //int c = add(3,4);
    //System.out.println(add(3,4));
    
    
    //class method example
    //Method m = new Method();
    //int z = m.add(1, 2);
    
    //STATIC METHOD
    add(10,25);
    
    
    
    //System.out.println(z);
    //m.add(3, 4);
    
    
    
    // static method example
    //**NOTE**static methods are methods in Java that can be called without creating an 
    //object of that class
    //add(2,3);
    
    

  }

}
