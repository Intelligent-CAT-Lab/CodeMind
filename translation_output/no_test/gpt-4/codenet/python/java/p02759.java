Certainly! Below is the equivalent Java code for your provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        int a = (n + 1) / 2; // When dividing two integers in Java, the result is automatically truncated

        System.out.println(a);
        
        scanner.close();
    }
}
```
This Java program does the following: 
1. It imports the Scanner class for input.
2. It prompts the user for a number and reads an integer from the console.
3. It calculates (n+1)/2 and, since both `n` and `1` are integers, the division result is an integer as well. Java integer arithmetic automatically discards any fractional part.
4. It prints out that truncated result.
5. It closes the Scanner object.
