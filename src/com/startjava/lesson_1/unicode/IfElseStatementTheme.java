public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("Перевод псевдокода на язык Java");
        System.out.println("");

        String man = "man";
        String woman = "woman";

        if(!(man == woman)){
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }

        int age = 20;

        if (age>18){
            System.out.println("Это совершеннолетний");
        } else {
            System.out.println("Это несовершеннолетний");
        }

        double rost = 1.7;

        if (rost>1.8){
            System.out.println("Высокий");
        } else {
            System.out.println("Низкий");
        }

        String name = "Irina";
        char firstNameChar = name.charAt(0);
        if (firstNameChar == 'M'){
            System.out.println("Имя - Maria");
        } else if (firstNameChar == 'I'){
            System.out.println("Имя - Irina");
        } else {
            System.out.println("Нейзвестное имя");
        }

        System.out.println("");
        System.out.println("Поиск большего числа");
        System.out.println("");

        int num1 = 293487;
        int num2 = 686809;
        if (num1 > num2){
            System.out.println("Число " + num1 + " больше");
        } else {
            System.out.println("Число " + num2 + " больше");
        }

        System.out.println("");
        System.out.println("Проверка числа");
        System.out.println("");

        int num3 = 321;
        if (num3%2 == 0){
            if(num3 > 0){
                System.out.println("Число " + num3 + " является положительным и четным");
            } else {
                System.out.println("Число " + num3 + " является отрицательным и четным");
            }
        } else {
            if(num3 > 0){
                System.out.println("Число " + num3 + " является положительным и нечетным");
            } else {
                System.out.println("Число " + num3 + " является отрицательным и нечетным");
            }
        }

        System.out.println("");
        System.out.println("Поиск одинаковых цифр в числах");
        System.out.println("");

        int num4 = 414;
        int num5 = 524;

        String num6 = Integer.toString(num4);
        String num7 = Integer.toString(num5);

        if(num6.charAt(0) == num7.charAt(0)){

            System.out.println(num4 + " " + num5);
            System.out.println(num6.charAt(0));
            System.out.println("Разряд сотых " + 3);

        } else if (num6.charAt(1) == num7.charAt(1)){

            System.out.println(num4 + " " + num5);
            System.out.println(num6.charAt(1));
            System.out.println("Разряд десятых " + 2);

        } else if (num6.charAt(2) == num7.charAt(2)){

            System.out.println(num4 + " " + num5);
            System.out.println(num6.charAt(2));
            System.out.println("Разряд едениц " + 1);

        }

//        System.out.println("");
//        System.out.println("Определение символа по его коду НЕ РЕШИЛ");
//        System.out.println("");
//
//
//        char cod1 = '\u0057';
//        System.out.println(cod1);
//
//        char i1 = 'a';
//        char i2 = 'A';
//        char i3 = '0';
//        if (i1<='z')
//        {
//            if (i1==cod1){
//                System.out.println("Символ" + i1 + "является большой буквой");
//
//            }else {i1++;}
//
//        } else if (i2<='Z'){
//             if (i2==cod1){
//                System.out.println("Символ" + i2 + "является большой буквой");
//
//            }else {i2++;}
//
//        } else if (i3<='9'){
//            if (i3==cod1){
//                System.out.println("Символ" + i3 + "является большой буквой");
//
//            }else {i3++;}
//        } else {
//            System.out.println(" НЕ РЕШИЛ Символ не является не буквой, не цифрой");
//        }



        System.out.println("");
        System.out.println("Подсчет суммы вклада и начисленных банком %");
        System.out.println("");


        double sum = 301000;
        System.out.println("Cумма вклада - " + sum + " руб.");
        if (sum<100000){
            double pros1 = sum;
            pros1 = (pros1 * (1.05/365))*365;
            System.out.println("Cумма начисленного % - " + (pros1 - sum)  + " руб.");
            System.out.println("Итоговуя сумму с % - " + (pros1)  + " руб.");
        } else if (100000<sum && sum<300000){
            double pros2 = sum;
            pros2 = (pros2 * (1.07/365))*365;
            System.out.println("Cумма начисленного % - " + (pros2 - sum)  + " руб.");
            System.out.println("Итоговуя сумму с % - " + (pros2)  + " руб.");
        }else if (sum>300000){
            double pros3 = sum;
            pros3 = (pros3 * (1.1/365))*365;
            System.out.println("Cумма начисленного % - " + (pros3 - sum)  + " руб.");
            System.out.println("Итоговуя сумму с % - " + (pros3)  + " руб.");
        }

        System.out.println("");
        System.out.println("Определение оценки по предметам");
        System.out.println("");

        int ratingStory = 59;
        int ratingProg = 92;

        int bad = 2;
        int noBad = 3;
        int good = 4;
        int veryGood = 5;

        int gradeStory = 0;
        int gradeProg = 0;


        if (ratingStory <= 60){
            System.out.println("Оценка по истории - " + bad);
            gradeStory = bad;
        } else if (ratingStory > 60){
            System.out.println("Оценка по истории - " + noBad);
            gradeStory = noBad;
        } else if (ratingStory > 73){
            System.out.println("Оценка по истории - " + good);
            gradeStory = good;
        } else if (ratingStory > 91){
            System.out.println("Оценка по истории - " + veryGood);
            gradeStory = veryGood;
        }

        if (ratingProg <= 60){
            System.out.println("Оценка по программировании - " + bad);
            gradeProg = bad;
        } else if (ratingProg < 60){
            System.out.println("Оценка по программировании - " + noBad);
            gradeProg = noBad;
        } else if (ratingProg < 73){
            System.out.println("Оценка по программировании - " + good);
            gradeProg = good;
        } else if (ratingProg > 91){
            System.out.println("Оценка по программировании - " + veryGood);
            gradeProg = veryGood;
        }

        System.out.println(gradeStory);
        System.out.println(gradeProg);

        System.out.println("Средний балл оценок по предметам - " + ((double)((gradeStory + gradeProg)/2)));
        System.out.println("Средний % по предметам - " + ((double)((ratingStory + ratingProg)/2)));

        System.out.println("");
        System.out.println("Расчет годовой прибыли");
        System.out.println("");

        int sale = 13000;
        int rent = 5000;
        int primeCost = 9000;

        int profit =  (sale - rent - primeCost)*12;
        System.out.println("Прибыль за год: " + profit);

    }
}