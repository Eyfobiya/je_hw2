package task_5;
//створити проект, пакет. Створити клас MyArea, в ньому оголосити константу PI = 3.14 та статичний метод areaOfCircle,
// який повинен приймати радіус та використовуючи PI порахувати площу кола. Створити клас Main, де запустити цей метод.

public class MyArea {
    private static final float PI = 3.14f;
    static void areaOfCircle(float radius){
        // використовуючи PI порахувати площу кола
        float area;
        area = MyArea.PI * radius * radius;
        System.out.println("Area of a circle: " + area);
    }
}
