
public class Track {
  String trackname;
  String location;
  Circuit circtype;
  double lapdist;
  Weather weathercondition;
  String image;

public void setTrackName(String tracknameIn) {
    trackname = tracknameIn;
 }

public String getTrackName() {
   return trackname;  
 }

public void setImage(String pathIn) {
   image = pathIn;
}

public String getImage() {
  return image;  
}

public void setLapDist(double lap) {
  lapdist = lap;
}

public double getLapDist() {
 return lapdist;  
}

public void printTrack() {
  System.out.println("\n *************************** \n");
  System.out.printf("Circuit:\t %s \n", trackname);
  System.out.printf("Lap Dist:\t %f \n", lapdist);
  System.out.println("\n *************************** \n");
  
  
}


}