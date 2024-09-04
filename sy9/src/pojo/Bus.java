package pojo;

public class Bus extends Traffic implements Total{
    public double total(double distance){
        return 2;
    }
    public double drive_distance(double distance){
        return distance;
    }
}
