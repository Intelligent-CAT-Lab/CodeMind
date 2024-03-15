Here's the equivalent Java code for the provided Python code. The Java code takes three space-separated integers as input from the user, adds them together, and then prints the result.

```java
import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reading input and splitting it by spaces
        String[] input = scanner.nextLine().split(" ");
        
        // Parsing input to integers
        int p = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        
        // Calculating the sum
        int sum = p + m + c;
        
        // Printing the sum
        System.out.println(sum);
        
        scanner.close();
    }
}
```

Make sure to handle exceptions and errors as required. The above code assumes valid input, just as the Python code you provided does.
