// write java program to find out Quotient and reminder of two numbers.


public class QuotientRemainder {
public static void main(String[] args) {
int dividend = 10; 
int divisor = 3;          
if (divisor == 0) {
System.out.println("Error: Division by zero is not allowed.");
} else {
            
int quotient = dividend / divisor;
int remainder = dividend % divisor;

System.out.println("Dividend: " + dividend);
System.out.println("Divisor: " + divisor);
System.out.println("Quotient: " + quotient);
System.out.println("Remainder: " + remainder);
}
}
}