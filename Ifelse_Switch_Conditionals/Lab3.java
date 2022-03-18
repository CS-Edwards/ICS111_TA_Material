/**C.Edwards**/
public class Lab3 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    //Modulo Example
    int m; //modulo variable
    int n = 101;
    
    m=n%2; 
    
    System.out.printf("Division:  101/2 is %d \n", 101/2);
    System.out.printf("Modulo (Remainder):  %d \n", m);
    
    //Switch Statement Example (G4G)
    
    int month = 2;
    String monthString = null;
    
    switch(month) {
      
      case 1: monthString = "January";
              break;
      case 2: monthString = "February";
              break;
      case 3: monthString = "March";
              break;
      case 4: monthString = "April";
              break;
    }
    
    System.out.printf("\n\n Month is %s", monthString);
    
  }

}
