Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] xList = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            xList[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < xList.length; i++) {
            if (xList[i] == 0) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and stores them in an array. It then iterates over the array and prints the index of the first occurrence of 0.
