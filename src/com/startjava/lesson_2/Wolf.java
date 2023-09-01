package Lesson2;

public class Wolf {
//    пол, кличка, вес, возраст, окрас
//    идти, сидеть, бежать, выть, охотиться

    private String male;
    private String name;
    private int weight;
    private int age;
    private String color;

    public String getMale() {
        return male;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>8){
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void go (){
        System.out.println("Идти");
    }
    public void sit (){
        System.out.println("Сидеть");
    }

    public void run (){
        System.out.println("Бежать");
    }

    public void talk (){
        System.out.println("Выть");
    }

    public void hunt (){
        System.out.println("Охотиться");
    }
}
