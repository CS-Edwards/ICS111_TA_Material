import java.util.Random;

public class Car {
  String team;
  String driver;
  double gas;
  double topspeed;
  double averagespeed;
  Tire tire;
  
public void setDriver(String drivername) {
    driver = drivername;
  }

public String getDriverName() {
      return driver ;
  }
  
public void setTeam(String teamname) {
    team = teamname;
  }

public String getTeamName() {
      return  team;
  }
  
public void setGas(double gasIn) {
  gas = gasIn;
}

public double getGas() {
    return gas ;
}

public void setTopSpeed(double topIn) {
  topspeed = topIn;
}

public double getTopSpeed() {
    return topspeed ;
}

public void setAvgSpeed(double avgIn) {
  averagespeed = avgIn;
}

public double getAvgSpeed() {
    return averagespeed ;
}

public boolean setTire(int tiretype) {
  
  switch(tiretype) {
    case 1: tire = Tire.SOFT; return true;
    case 2: tire = Tire.MEDIUM; return true;
    case 3: tire = Tire.HARD; return true;
    default: return false;    
  
  }
  }

//public void setTopSpeed() {
  // TODO Auto-generated method stub
  
  
//}

public void printCar() {
  System.out.printf("Driver:\t %s \n",driver);
  System.out.printf("Team:\t %s \n",team);
  //System.out.printf("Tire:\t %s \n",tire);
  System.out.printf("Gas:\t %.2f gallons \n",gas);
  System.out.printf("Avg Speed:\t %.2f mph\n",averagespeed);
  
}

/**
*Calculates laptime car using random double between avg speed 
*and top speed.
*
*Returns lap speed
*
*/

public double calcLapSpeed() {
  Random r = new Random();
  double lapspeed = r.nextDouble(getAvgSpeed(),getTopSpeed());
  return lapspeed;
}


}
