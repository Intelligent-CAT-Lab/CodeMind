Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int w = Integer.parseInt(input[1]);
        int a = Integer.parseInt(input[2]);
        int b = Integer.parseInt(input[3]);

        for (int i = 0; i < h; i++) {
            if (i < b) {
                for (int j = 0; j < w; j++) {
                    if (j < a) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
            } else {
                for (int j = 0; j < w; j++) {
                    if (j < a) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
            }
            System.out.println();
        }
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the user, then prints a pattern based on these integers. The pattern is a grid of 0s and 1s, where the number of 0s and 1s in each row is determined by the input integers.
