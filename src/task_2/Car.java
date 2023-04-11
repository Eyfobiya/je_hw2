package task_2;

public class Car {
    private int year;
    private String color;

    public Car(){
        this.year = 1977;
        this.color = "blue";
    }

    public Car(int year){
        this.year = year;
        this.color = "green";
    }
    public Car(int year, String color){
        this.year = year;
        this.color = color;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
