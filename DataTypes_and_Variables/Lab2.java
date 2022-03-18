/**C.Edwards**/
import java.lang.Math;
import java.util.Scanner;
import javax.swing.JOptionPane; //commented out

public class Lab2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // declare pi (double)
    double pi;

    // declare circumference
    double circ;
    // int circ; // run to GE

    // sets pi variable as Math.PI value from java.lang.Math
    pi = Math.PI;

    // Scanner Object
    Scanner in = new Scanner(System.in);

    // User Prompt
    System.out.print("Enter radius: ");
    // declare entry as user entry variable, set the value to user entered data -- GE 4.5
    //int radius = in.nextInt();
    //in.close();

    // Dialog Box Input
    String input = JOptionPane.showInputDialog("Enter radius: ");
    double radius = Double.parseDouble(input);

    // calculate circ (2*pi*r)
    circ = 2 * pi * radius;

    //System.out.println("A circle with radius " + radius + " has a circumference " + circ);
    
    //JOptionPane.showMessageDialog(null, "A circle with radius " + radius + " has a circumference " + circ);
    String str = String.format("%.3f",pi);
    //JOptionPane.showMessageDialog(null, str);
    
    

    // Formatting Example
     System.out.println("pi is: " + pi);
     System.out.printf("pi is: %.3f", pi);

  }

}
