Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

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

This Java code does the same thing as the Python code. It reads four integers from the user, then it prints a pattern based on these integers. The pattern is a grid of 0s and 1s, where the number of 0s and 1s in each row is determined by the input integers. The number of 0s is equal to the input integer `a`, and the number of 1s is equal to the input integer `w - a`. The number of rows in the grid is equal to the input integer `h`. The number of columns in the grid is equal to the input integer `w`. The pattern is printed row by row, with each row printed on a new line.
