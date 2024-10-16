//write java program which has method get the to accept 2 numbers from user in base class the derive class context method display maximum which display maximum num & method display maximum which display minimum of 2 number inheritance.

import java.util.Scanner;

class NumberInput {
    protected int num1, num2;
    public void get() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        num2 = scanner.nextInt();
    }
}

class NumberDisplay extends NumberInput {

    public void displayMaximum() {
        int max = (num1 > num2) ? num1 : num2;
        System.out.println("Maximum number is: " + max);
    }

    public void displayMinimum() {
        int min = (num1 < num2) ? num1 : num2;
        System.out.println("Minimum number is: " + min);
    }
}
public class Inheritance{
    public static void main(String[] args) {
        NumberDisplay display = new NumberDisplay();
        display.get();             
        display.displayMaximum();   
        display.displayMinimum();   
    }
}

/* output -
Enter first number: 17
Enter second number: 52
Maximum number is: 52
Minimum number is: 17  */