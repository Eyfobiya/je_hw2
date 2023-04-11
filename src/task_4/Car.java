package task_4;

public class Car {
    public int year;
    public double speed;
    public int weight;
    public String color;

    public Car(){
        this(1898, 63.149, 1440, "gray");
    }
    public Car(int year){
        this(year, 163.149, 1550,"black");
    }
    public Car(int year, double speed){
        this(2020, speed, 1660, "yellow");
    }
    public Car(int year, double speed, int weight){
        this(year, 22.122, weight, "pink");
    }
    public Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
