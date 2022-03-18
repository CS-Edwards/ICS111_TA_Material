import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.lang.Math;
import java.util.Random;
import java.util.random.*;


/** Expansion Idea: User can select pre-assembled driver/car etc or 
 * create their own.
 * @author Candace Edwards
 *
 */

public class RaceDay {
      //race stats table
  public static void grandPrix() {
    //grandprix
    //two car race simulation; winner has lowest overall race time
    //78 laps array 
    //parameters
    
  }
  
  public static double getLapTime(Car carIn, Track trackIn) {
    double dist = trackIn.getLapDist();
    double speed= carIn.calcLapSpeed();
    
    System.out.printf("\nDriver: %s\t Lap Distance: %f \t Lap speed: %f \n",carIn.getDriverName(), dist,speed);
    return (dist/speed)*3600; //conversion from hours to seconds
    
    
  }
  
  public static Track setTrack1() {
    Track s = new Track();
    s.setTrackName("Marina Bay");
    s.setLapDist(3.1460023);
    return s;
    }

  
  public static Car setCar1(String driver) {
    Car newcar = new Car();
    Random r = new Random();
    newcar.setDriver(driver);
    newcar.setTeam("Mercedes");
    newcar.setGas(30); //if gas runs out; disqualified
    newcar.setAvgSpeed(r.nextDouble(185.0));//2006  top speed 185
    newcar.setTopSpeed(185.0);
    
    return newcar;
    
    
      }
  
  

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    try
    {
      // the line that reads the image file
      BufferedImage image = ImageIO.read(new File("C:\\Users\\Candace Edwards\\Desktop\\JavProjectImages\\marina.png"));

      ImageIcon icon = new ImageIcon(image);
      JFrame frame = new JFrame();
      frame.setLayout(new FlowLayout());
      frame.setSize(300, 400);
      JLabel lbl = new JLabel();
      JButton button = new JButton("Start Race");
      button.setBounds(50, 150, 25,10);
      lbl.setIcon(icon);
      frame.add(lbl);
      frame.add(button); //button does not do anything yet
      frame.setVisible(false);//set to true to display
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
    catch (IOException e)
    {
      // log the exception
      // re-throw if desired
    }
    
    
    
    Track t1 = setTrack1();
    Car car1 = setCar1("Alex");
    Car car2 = setCar1("Candace");
    
    t1.printTrack();
    car1.printCar();
    car2.printCar();
    
    //lap time
    System.out.println("\n *************************** \n");
    System.out.printf("\n Car 1 lap time: \t %f \n",getLapTime(car1,t1));     //Car 1 lap time
    System.out.printf("\n Car 2 lap time: \t %f \n",getLapTime(car2,t1));     //Car 2 lap time
    System.out.println("\n *************************** \n");

    
    //during race lap speed is set between avg speed and top speed
    
    car1.setGas(19.0);
    System.out.println(car1.getGas());
    
    //grandprix
    //two car race simulation; winner has lowest overall race time
    //78 laps array 
    //parameters
    
    
  }

}
