package task_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car(1988);
        Car car2 = new Car(1988, "yellow");

        System.out.println("Year: " + car.getYear() + " Color: " + car.getColor());
        System.out.println("Year: " + car1.getYear() + " Color: " + car1.getColor());
        System.out.println("Year: " + car2.getYear() + " Color: " + car2.getColor());
    }
}
