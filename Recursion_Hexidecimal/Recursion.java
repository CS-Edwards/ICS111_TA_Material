/**C.Edwards**/
public class Factorial {
  
  public static int Fact(int n) {
    if(n==1) {
      return 1;
    }
    else {
      return n*Fact(n-1);
    }
  }
  
  public static String intToString(int val) {
    String higherDigits ="";
    //678/10 -> 67.8 -->67  678%10 -->8
    //67/10 --> 6.7 --> 6 67%10 -->7
    //6
          
    if(val >= 10) {
      higherDigits = intToString(val/10); 
    }
    
    return higherDigits + (val%10); //
       
  }
  

  public static void main(String[] args) {
    // TODO Auto-generated method stub     
      int num = 5;
      System.out.printf("\n Factorial of %d: is %d \n", num, Fact(num));
      
      System.out.println(intToString(678));
  }

}
