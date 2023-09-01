package Lesson1;

public class MyFirstGame {
    public static void main(String[] args) {
        int chel = 25;
        int comp = 22;

        if(comp>0 & comp<=100){

            if (chel < comp){
                while (chel < comp){
                    System.out.println("Число " + chel + " меньше того, что загадал компьютер");
                    chel++;
                }
                if (chel == comp){System.out.println("Вы победили!");}
            }else if (chel > comp){
                while (chel > comp){
                    System.out.println("Число " + chel + " больше того, что загадал компьютер");
                    chel--;
                }
                if (chel == comp){System.out.println("Вы победили!");}
            }else {
                System.out.println("Вы победили!");
            }
        } else {
            System.out.println("Загадывать можно только числа в диапазоне от 1 (включительно) до 100 (включительно)");
        }

    }
}



