/**C.Edwards**/
import java.util.Scanner;

public class EnumExample {
  
  enum Wheels3{
    WALKING,
    DRIVING,
    BIKING    
  }
  
  
  
  public static void main(String[] args) {
    // TODO Auto-generated method stub
       
       
    //Wheels wheel= Wheels.BIKING;
    
    Wheels wheel = null;
    
    //User input Example
    
    Scanner in = new Scanner(System.in);
    System.out.println("Enter 1 for Walk, 2 for Driving or 3 for Biking: ");
    int input = in.nextInt();
    in.close();// close scanner
    
    switch(input) {
      case 1: wheel = Wheels.WALKING;break; //set wheel enum to driving
      case 2: wheel = Wheels.DRIVING;break; //set wheel enum to driving
      case 3: wheel = Wheels.BIKING;break; //set wheel enum to driving
      default:
          System.out.println("Invalid Selection");
      
    }
    
    
    
    switch(wheel) {
    
      case WALKING : System.out.println ("I am taking a walk"); break;
      case DRIVING : System.out.println ("I am taking a drive"); break;
      case BIKING : System.out.println ("I am taking a ride"); break;
      }
    
    
      
    
     }
      
  
      

  }


