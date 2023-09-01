package Lesson2;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger("The Shanghai Shield", "Mark-5", "USA", 70.9f, 2.1f, 8,9);

        jaeger1.setHeight(80.4f);


        System.out.println(jaeger1.getHeight());
        System.out.println(jaeger2);

    }
}
