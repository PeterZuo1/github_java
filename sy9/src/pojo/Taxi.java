package pojo;

public class Taxi extends Traffic implements Total {
    public double total(double distance){
        if(distance<3)
            return 9;
        else
            return 9+(distance-3)*1.5;
    }
    public double drive_distance(double distance){
        return distance;
    }

}
