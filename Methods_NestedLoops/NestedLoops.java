/**C.Edwards**/


public class NestedLoops {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    for(int i=0;i<10;i++) {//outer loop
      
      for(int j =0; j<5; j++) { //inner loop
        System.out.printf("%d ",j);
         //System.out.print(". ");
        }
      
      //System.out.println(); // new line  [outer loop]
      System.out.printf("[%d] \n",i);
    }

  }

}
