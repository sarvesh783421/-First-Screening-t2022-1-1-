

import java.util.Scanner;

class Calculator {
    static double a, b;
    void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number :- ");
        a = input.nextInt();
        System.out.println("Enter second number :- ");
        b = input.nextInt();
    }
    double add() {
        return a + b;
    }
    double subtract() {
        return a - b;
    }
    double multiply() {
        return a * b;
    }
    double divide() {
        return a / b;
    }

}
public class Problem1 {
    public static void main(String[] args) {
        int input;
        double result;
        Calculator operation = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter what you want to perform :- \n1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
        input = sc.nextInt();
            switch (input){
                case 1:
                    operation.input();
                    result = operation.add();
                    System.out.printf("%f + %f = %f", Calculator.a, Calculator.b, result);
                    break;
                case 2:
                    operation.input();
                    result = operation.subtract();
                    System.out.printf("%f - %f = %f", Calculator.a, Calculator.b, result);
                    break;
                case 3:
                    operation.input();
                    result = operation.multiply();
                    System.out.printf("%f * %f = %f", Calculator.a, Calculator.b, result);
                    break;
                case 4:
                    operation.input();
                    result = operation.divide();
                    System.out.printf("%f / %f = %f", Calculator.a, Calculator.b, result);
                    break;
                default:
                    System.out.println("Enter a valid input!!!!");
                    break;
            }
        }
    }

