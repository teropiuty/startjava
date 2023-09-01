package Lesson2;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setAge(12);
        int age = wolf.getAge();
        wolf.setMale("Man");
        String male = wolf.getMale();
        wolf.setWeight(80);
        int weight = wolf.getWeight();
        wolf.setName("Barri");
        String name = wolf.getName();
        wolf.setColor("Gold");
        String color = wolf.getColor();


        System.out.println("Возраст - " + age + ". Пол - " + male + ". Вес - " + weight + ". Имя - " + name + ". Расцветка - " + color);
        System.out.println(" ");

        wolf.go();
        wolf.run();
        wolf.sit();
        wolf.hunt();
        wolf.talk();
    }
}
