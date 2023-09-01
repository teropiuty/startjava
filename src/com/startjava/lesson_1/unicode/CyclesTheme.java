package Lesson1;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        System.out.println("");

        int part1 = -10;
        int partChet = 0;
        int partNeChet = 0;
            do {
                if (part1 % 2 == 0){
                    partChet = partChet + part1;
                } else {
                    partNeChet = partNeChet + part1;
                }
                part1++;
            }while (part1 < 21);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + partChet + ", а нечетных = " + partNeChet);

        System.out.println("");
        System.out.println("2. Вывод чисел в порядке убывания");
        System.out.println("");


        int minusOne = -1;
        int five = 5;
        int ten = 10;

        for (int i = -1; i<=10; i++){

            if (i == minusOne){
                System.out.println(minusOne);
            }
            if (i == five){
                System.out.println(five);
            }
            if (i == ten){
                System.out.println(ten);
            }


            if (minusOne >= five && minusOne >= ten && five >= ten){
                System.out.println(minusOne + " " + five + " " + ten);
            } else if (minusOne >= five && minusOne >= ten && ten >= five){
                    System.out.println(minusOne + " " + ten + " " + five);
            }


            if (five >= minusOne && five >= ten && minusOne >= ten){
                System.out.println(five + " " + minusOne + " " + ten);
            } else if (five >= minusOne && five >= ten && ten >= minusOne){
                System.out.println(five + " " + ten + " " + minusOne);
            }

            if (ten >= minusOne && ten >= five && minusOne >= five){
                System.out.println(ten + " " + minusOne + " " + five);
            } else if (ten >= minusOne && ten >= five && five >= minusOne){
                System.out.println(ten + " " + five + " " + minusOne);
            }

        }

        System.out.println("");
        System.out.println("3. Вывод реверсивного числа и суммы его цифр");
        System.out.println("");

        int num = 1234;
        int sumNum = 0;
        while (num != 0){
            sumNum += num % 10;
//          Если имелось ввиду исходную цифру  System.out.println(num % 10);
            System.out.println(num - (num % 10));
            num /= 10;
        }
        System.out.println(sumNum);

        System.out.println("");
        System.out.println("4. Вывод чисел в несколько строк");
        System.out.println("");



        for (int i = 1; i<21; i++){

            if (!(i%2 == 0)){
                for (int j = 0; j<5; j++){
                    System.out.print(i + " ");
                }
                System.out.println("");
            }

        }

        System.out.println("");
        System.out.println("5. Проверка количества двоек числа на четность/нечетность");
        System.out.println("");

        int numDva = 3242592;
        int sumNumDva = 0;
        int sumNumDva1 = 0;
        while (numDva != 0){
            if (numDva % 10 == 2){
                sumNumDva1++;
            }
            sumNumDva += numDva % 10;
            numDva /= 10;
        }
        if (sumNumDva1 % 2 == 0){
            System.out.println("В 3242592 четное количество двоек - " + sumNumDva1);
        } else {
            System.out.println("В 3242592 нечетное количество двоек - " + sumNumDva1);
        }


        System.out.println("");
        System.out.println("6. Отображение геометрических фигур (НЕ ВСЕ РЕШИЛ)");
        System.out.println("");

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("");

//        int rectangle = 5;
//        for (int i = 0; i < rectangle; i++){
//            for (int j = i; j < rectangle; j++){
//                System.out.print("+");
//            }
//            System.out.println("  *"+i);
//        }

        int rectangle = 5;
        int trey = 0;
        while (trey < rectangle){
            int trey2 = trey;
            while (trey2 < rectangle){
                System.out.print("#");
                trey2++;
            }
            System.out.println("");
            trey++;
        }

        System.out.println("");

        for (int i = 3; i > 0; i--){
            for (int j = 3; j > (i-1); j--){
                System.out.print("+");
                for (int k = 2; k > (j-1); k--){
                    System.out.print("+");
                }
            }

           System.out.println("  *"+i);
        }

        System.out.println("");
        System.out.println("7. Отображение ASCII-символов");
        System.out.println("");

        char decimal = 0;

//        for (int i = 0; i <= 255; i++){
//            decimal = (char)i;
//            System.out.print(decimal);
//        }
        for (int i = 0; i <= 255; i++){
            decimal = (char)i;

            System.out.print(decimal);
            int nol = 0;
            char decimal2 = (char)i;
            if (decimal2 == '0'){
                break;
            }
        }

        System.out.println("");
        System.out.println("8. Проверка, является ли число палиндромом");
        System.out.println("");

        int num12 = 1234321;
        int rev = 0;
        int i = 0;
        int originalNum = num12;

        while(num12 != 0){
            rev = num12 % 10;
            i = i*10 + rev;
            num12 = num12 / 10;
        }

        if(originalNum == i)
            System.out.println("Число является полиндромом");
        else
            System.out.println("Число не является полиндромом");

        System.out.println("");
        System.out.println("9. Проверка, является ли число счастливым");
        System.out.println("");


        System.out.println("Какая то муйня, а не задание");

        System.out.println("");
        System.out.println("10. Отображение таблицы умножения Пифагора(НЕ РЕШИЛ))");
        System.out.println("");


        for (int kl = 1; kl < 10; kl++){
            for (int j = 1; j < 10; j++){
                System.out.print(j*kl + " ");
            }
            System.out.println();
        }



    }
}
