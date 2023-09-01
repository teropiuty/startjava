package Lesson2;


import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

//        boolean next = true;
        String answer = "Да";

        while (answer.equals("Да")){
            Scanner scanner = new Scanner(System.in);
            Scanner scanner1 = new Scanner(System.in);
            Calculator calculator = new Calculator();

            System.out.print("Введите первое число: ");
            int num1 = scanner.nextInt();
            calculator.setNum1(num1);

            System.out.print("Введите знак математической операции: ");
            String znak = scanner1.nextLine();
            calculator.setZnak(znak);

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();
            calculator.setNum2(num2);
            calculator.calc();




            do {
                System.out.print("Хотите продолжить вычисления? [Да/Нет]: ");
                answer = scanner.next();
            } while (!answer.equals("Да") && !answer.equals("Да"));


//            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
//            String otvet = scanner1.nextLine();
//            String otvet1 = calculator.getYes();
//
//            if (otvet == otvet1){
//                next = true;
//            }

        }





















    }
}
