public class VariablesTheme {   
    
    public static void main(String[] args) {
        
    System.out.println("Вывод характеристик компьютера");
        System.out.println("");
        byte core = 16;
        short ram = 16;
        int versionCore = 5600;
        long operations = 2000000000l;
        float cpu = 3.9f;
        double operatingSystemAssembly = 22621.1;
        char ch1 = 'A';
        char ch2 = 'M';
        char ch3 = 'D';
        boolean amd = true;

        System.out.println("Количество ядер - " + core);
        System.out.println("Оперативная память - " + ram + " ГБ");
        System.out.println("Версия ядра - " + versionCore);
        System.out.println("Операций в секунду - " + operations);
        System.out.println("Частота ядра - " + cpu);
        System.out.println("Сборка операционной сиситемы - " + operatingSystemAssembly);
        System.out.print("Тип процессора - ");
        System.out.print(ch1);
        System.out.print(ch2);
        System.out.print(ch3 + "?");
        System.out.println(" - " + amd);

        System.out.println("");
        System.out.println("Расчет стоимости товара со скидкой");
        System.out.println("");

        int penPrice = 100;
        int bookPrice = 200;
        System.out.println("Общая стоимость товаров (без скидки) - " + (penPrice + bookPrice) + " рублей.");
        System.out.println("Сумма скидки - " + ((penPrice*11/100) + (bookPrice*11/100)) + " рубля.");
        System.out.println("Общая стоимость товаров со скидкой - " + ((penPrice + bookPrice) - ((penPrice*11/100) + (bookPrice*11/100))) + " рубля.");

        System.out.println("");
        System.out.println("Вывод слова JAVA");
        System.out.println("");

        System.out.println("   J    a  v     v  a      ");
        System.out.println("   J   a a  v   v  a a      ");
        System.out.println("J  J  aaaaa  V V  aaaaa    ");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("");
        System.out.println("Вывод min и max значений целых числовых типов");
        System.out.println("");

        byte b1 = 127;
        short s1 = 32767;
        int i1 = 2147483647;
        long l1 = 9223372036854775807l;

        System.out.println(b1);
        System.out.println(++b1);
        System.out.println(--b1);
        System.out.println("");
        System.out.println(s1);
        System.out.println(++s1);
        System.out.println(--s1);
        System.out.println("");
        System.out.println(i1);
        System.out.println(++i1);
        System.out.println(--i1);
        System.out.println("");
        System.out.println(l1);
        System.out.println(++l1);
        System.out.println(--l1);

        System.out.println("");
        System.out.println("Перестановка значений переменных");
        System.out.println("");

        int in1;
        in1 = 2;
        int in2;
        in2 = 5;
        int in3;

        System.out.println("Способ 1.1 - Перестановка с помощью третьей переменной. (до перестановки)" + "Теперь значение in1 = " + in1 + ", а значение in2 = " + in2);

        in3 = in2;
        in2 = in1;
        in1 = in3;

        System.out.println("Способ 1.2 - Перестановка с помощью третьей переменной. (после перестановки) " + "Теперь значение in1 = " + in1 + ", а значение in2 = " + in2);

        System.out.println("Способ 2.1 - Перестановка с помощью арифметических операций. " + "Все вернулось на место in1 = " + in1 + ", а значение in2 = " + in2);

        in1 = in1*2/5;
        in2 = in2*5/2;

        System.out.println("Способ 2.2 - Перестановка с помощью арифметических операций. " + "Все вернулось на место in1 = " + in1 + ", а значение in2 = " + in2);

        System.out.println("Способ 3.1 - Перестановка с помощью побитовой операции. (до перестановки) " + "in1 = " + Integer.toBinaryString(in1) +
                ", in2 = " + Integer.toBinaryString(in2) );
        System.out.println("Способ 3.2 - Перестановка с помощью побитовой операции. (после перестановки) " + "in1 = " + Integer.toBinaryString(in1^5^2) +
                ", in2 = " + Integer.toBinaryString(in2^2^5) );

        System.out.println("");
        System.out.println("Вывод символов и их кодов");
        System.out.println("");

        char zn1 = 36;
        char zn2 = 42;
        char zn3 = 64;
        char zn4 = 124;
        char zn5 = 126;

        System.out.println("Символ с кодом 36 это - " + zn1);
        System.out.println("Символ с кодом 42 это - " + zn2);
        System.out.println("Символ с кодом 64 это - " + zn3);
        System.out.println("Символ с кодом 124 это - " + zn4);
        System.out.println("Символ с кодом 126 это - " + zn5);

        System.out.println("");
        System.out.println("Вывод в консоль ASCII-арт Дюка");
        System.out.println("");

        char zn11 = '/';
        char zn22 = '\\';
        char zn33 = '_';
        char zn44 = '(';
        char zn55 = ')';

        System.out.println("    " + zn11 + zn22 + "        ");
        System.out.println("   " + zn11 + "  " +  zn22 + "      ");
        System.out.println("  " + zn11 + zn33 + zn44 + " " + zn55 + zn22 + "   ");
        System.out.println(" " + zn11 + "      " +  zn22 + "  ");
        System.out.println(zn11 + "" + zn33 + "" + zn33 + "" + zn33 + "" + zn33 + zn11 + zn22 + zn33 + "" + zn33 + zn22 + " ");

        System.out.println("");
        System.out.println("Вывод количества сотен, десятков и единиц числа");
        System.out.println("");

        double vivod = 123;
        double vivodSto = vivod/1.23;
        double vivodDvatsat = vivod/6.15;
        double vivodTri = vivod%120;

        System.out.println("Число N содержит:");
        System.out.println("  сотен - " + vivodSto/100);
        System.out.println("  десятков - " + vivodDvatsat/10);
        System.out.println("  единиц - " + vivodTri);
        System.out.println("Сумма его цифр = " + vivod);
        System.out.println("Произведение = " + vivodSto*vivodDvatsat*vivodTri);

        System.out.println("");
        System.out.println("Вывод времени");
        System.out.println("");

        int sek = 86399;
        int ostatokSek = sek%60;
        int minut = (sek/60)%60;
        int chasov = (sek/60)/60;
        System.out.println(chasov+":"+minut+":"+ostatokSek);
    
    }

}
    
