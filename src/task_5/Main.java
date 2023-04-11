package task_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // тут необхідно запустити метод areaOfCircle
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius = in.nextFloat();
        MyArea.areaOfCircle(radius);
    }
}
