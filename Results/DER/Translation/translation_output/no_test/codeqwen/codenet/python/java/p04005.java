Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] l = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            l[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l[i] % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l[0] * l[1];
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into individual numbers, converts them to integers, sorts them, and then checks if the first three numbers are even. If they are, it sets the answer to 0 and breaks out of the loop. If they are not, it sets the answer to the product of the first two numbers. Finally, it prints the answer.
