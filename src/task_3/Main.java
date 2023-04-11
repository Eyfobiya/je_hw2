package task_3;

public class Main {
    public static void main(String[] args) {
        Car carDefault = new Car();
        Car carWithOneParams = new Car(2000);
        Car carWithTwoParams = new Car(2001, 111.111);
        Car carWithTreeParams = new Car(2002, 222.222, 1111);
        Car carWithFourParams = new Car(2003, 333.333, 2222, "green");

        System.out.println("year: " + carDefault.year + " speed: " + carDefault.speed + " weight: "
                + carDefault.weight + " color: " + carDefault.color);
        System.out.println("year: " + carWithOneParams.year + " speed: " + carWithOneParams.speed + " weight: "
                + carWithOneParams.weight + " color: " + carWithOneParams.color);
        System.out.println("year: " + carWithTwoParams.year + " speed: " + carWithTwoParams.speed + " weight: "
                + carWithTwoParams.weight + " color: " + carWithTwoParams.color);
        System.out.println("year: " + carWithTreeParams.year + " speed: " + carWithTreeParams.speed + " weight: "
                + carWithTreeParams.weight + " color: " + carWithTreeParams.color);
        System.out.println("year: " + carWithFourParams.year + " speed: " + carWithFourParams.speed + " weight: "
                + carWithFourParams.weight + " color: " + carWithFourParams.color);
    }
}
