Here is the Python code translated into Java. Since Java requires a class and a main method to run, I've encapsulated the logic accordingly. Additionally, the LCM and GCD methods are declared static so that they can be called from the main method without needing an instance of the class.

```java
import java.util.Scanner;

public class Solution {

    // Method to calculate the Greatest Common Divisor (GCD)
    public static int GCD(int a, int b) {
        while (a % b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }

    // Method to calculate the Least Common Multiple (LCM)
    public static int LCM(int a, int b) {
        return (a / GCD(a, b)) * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // The â character seems to be incorrect, assuming it should be a space character
        String[] tokens = scanner.nextLine().split(" ");
        
        // Parse input tokens into integers
        int x = Integer.parseInt(tokens[0]);
        int y = Integer.parseInt(tokens[1]);
        int a = Integer.parseInt(tokens[2]);
        int b = Integer.parseInt(tokens[3]);
        
        // Calculate the LCM of x and y
        int lcm = LCM(x, y);
        
        // Print the count of multiples of LCM between a and b (inclusive)
        System.out.println(b / lcm - (a - 1) / lcm);
        
        scanner.close();
    }
}
```

Please make sure that your Java environment is using a version that supports the `/` operator for integer division resulting in an integer value. If you copy and paste this code, ensure that the input delimiter (assumed to be a space in `scanner.nextLine().split(" ")`) matches the actual delimiter used in your input data.

For the provided test input `1 1 1 1000000000`, the expected output of `1000000000` will be given when running this Java program.
