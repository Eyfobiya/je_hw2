package task_3;

public class Car {
    public int year;
    public double speed;
    public int weight;
    public String color;

    public Car(){
        this.year = 1898;
        this.speed = 63.149;
        this.weight = 1440;
        this.color = "gray";
    }
    public Car(int year){
        this.year = year;
        this.speed = 163.149;
        this.weight = 1550;
        this.color = "blue";
    }
    public Car(int year, double speed){
        this.year = year;
        this.speed = speed;
        this.weight = 1660;
        this.color = "yellow";
    }
    public Car(int year, double speed, int weight){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = "red";
    }
    public Car(int year, double speed, int weight, String color){
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
