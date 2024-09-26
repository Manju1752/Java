//write java program to find fabonacci series simple short code

public class FibonacciSeries {
public static void main(String[] args) {
int terms = 10;
int a = 0, b = 1;

System.out.print("Fibonacci Series: " + a + ", " + b);

for (int i = 2; i < terms; i++) {
int next = a + b;
System.out.print(", " + next);
a = b;
b = next;
}

System.out.println(); 
}
}
