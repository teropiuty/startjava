package Lesson2;


public class Calculator {

    private int num1;
    private int num2;
    private String znak;

    private String yes = "yes";

    public String getYes() {
        return yes;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getZnak() {
        return znak;
    }

    public void setZnak(String znak) {
        this.znak = znak;
    }

    public void calc (){

        switch (znak){
            case "+" :
                System.out.println(num1 + num2);
                break;
            case "-" :
                System.out.println(num1 - num2);
                break;
            case "*" :
                System.out.println(num1 * num2);
                break;
            case "/" :
                System.out.println(num1 / num2);
                break;
            case "^" :
                int result = 1;
                for (int i = 0; i < num2; i++){
                    result = result * num1;
                }
                System.out.println(result);
                break;
            case "%" :
                System.out.println(num1 % num2);
                break;
        }



//        if (znak == "+"){
//            System.out.println(num1 + num2);
//        } else if (znak == "-"){
//            System.out.println(num1 - num2);
//        } else if (znak == "*"){
//            System.out.println(num1 * num2);
//        } else if (znak == "/"){
//            System.out.println(num1 / num2);
//        } else if (znak == "^"){
//            int result = 1;
//            for (int i = 1; i < num2; i++){
//                result = result * num1;
//            }
//            System.out.println(result);
//        } else if (znak == "%"){
//            System.out.println(num1 % num2);
//        }
    }

}
