package Lesson1;

public class CalculatorNew {

    double num1 = 0;
    double num2 = 0;


    public double numPlus (double num1, double num2){

        this.num1 = num1;
        this.num2 = num2;
        double numPlus = num1 + num2;
        return numPlus;

    }

    public double numMinus (double num1, double num2){

        this.num1 = num1;
        this.num2 = num2;
        double numMinus = num1 - num2;
        return numMinus;

    }

    public double numMultiply (double num1, double num2){

        this.num1 = num1;
        this.num2 = num2;
        double numMultiply = num1*num2;
        return numMultiply;

    }

    public double numDivide (double num1, double num2){

        this.num1 = num1;
        this.num2 = num2;

        if (num2 == 0){
            System.out.println("На ноль делить нельзя!");
            return 0;

        } else{
            double numDivide = num1/num2;
            return numDivide;
        }

    }

    public double numModul (double num1, double num2){

        this.num1 = num1;
        this.num2 = num2;
        double numModul = num1%num2;
        return numModul;

    }


    public double numStep (double num1, double num2){

        this.num1 = num1;
        this.num2 = num2;

        double result = 1;
        for (double i = 1; i <= num2; i++){

            result = result*num1;

        }
        return result;
    }

    public static void main(String[] args) {
        CalculatorNew cn = new CalculatorNew();
        double result1 = cn.numStep(2,5);
        System.out.println(result1);
    }

}
