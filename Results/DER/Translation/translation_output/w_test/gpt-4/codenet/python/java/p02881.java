Certainly! Below is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  // Read the input number
        scanner.close();

        int[] ijValues = ij((int) Math.sqrt(n));  // Calculate i, j using the square root of n
        int result = sum(ijValues) - 2;  // Calculate the sum and subtract 2 as per the Python code

        System.out.println(result);  // Print the result
    }

    // Function to find i, j such that i * j == n
    public static int[] ij(int x) {
        for (int i = x; i > 0; i--) {
            if (n / i * i == n) {  // Check if n is divisible by i
                return new int[]{i, n / i};
            }
        }
        return new int[]{0, 0};
    }

    // Function to calculate the sum of an array of integers
    public static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }
        return total;
    }
}

```

When you run this Java program with an input of `10`, it should provide an output of `5`, given the purpose of the original Python code.

Please note that this code snippet assumes that `n` is a positive integer and that a pair `(i, j)` exists such that `i * j == n`. In the original Python code, `n // i` is used to perform integer division. In Java, normal division with `/` between two integers naturally results in integer division, which is why `n / i` suffices.
