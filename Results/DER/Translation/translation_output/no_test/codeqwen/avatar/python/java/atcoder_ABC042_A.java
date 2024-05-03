Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] ABC = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ABC[i] = Integer.parseInt(numbers[i]);
        }
        int countFive = 0;
        int sum = 0;
        for (int num : ABC) {
            if (num == 5) {
                countFive++;
            }
            sum += num;
        }
        if (countFive == 2) {
            System.out.println(sum == 17 ? "YES" : "NO");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, and stores the integers in an array. It then counts the number of times the number 5 appears in the array and calculates the sum of all the numbers. If the number of 5s is exactly 2 and the sum is 17, it prints "YES"; otherwise, it prints "NO".
