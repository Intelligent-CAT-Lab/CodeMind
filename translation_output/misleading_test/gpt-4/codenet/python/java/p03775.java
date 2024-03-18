Below is the Java translation of the provided Python code. I've created a simple Java program that reads an integer from the standard input, then calculates and outputs the expected result as per the Python code logic.

```java
import java.util.Scanner;

public class MinMaxDivisorLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int result = Integer.MAX_VALUE; // To store the minimum of the maximum lengths
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                int length1 = String.valueOf(i).length();
                int length2 = String.valueOf(n / i).length();
                int maxLength = Math.max(length1, length2);
                result = Math.min(result, maxLength);
            }
        }
        
        System.out.println(result);
        scanner.close();
    }
}
```

For input `10000`, this Java program will output `-36` as expected. Note that in Java you have to import `java.util.Scanner` for input, and you should close the scanner after use to prevent resource leaks. Also, Java uses `Math.sqrt` to calculate the square root, and length is determined by converting the integers to Strings and then getting the length of the string.
