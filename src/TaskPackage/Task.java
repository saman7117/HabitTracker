package TaskPackage;

public class Task {
    public String name;
    public double start_time,finish_time;
    public double getDuration(){
        double v =  finish_time-start_time;
        return v;
    }
}
