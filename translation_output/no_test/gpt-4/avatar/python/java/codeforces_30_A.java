Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ▁ ");
        int[] M = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();

        int a = M[0];
        int b = M[1];
        int n = M[2];

        if (a != 0) {
            if (b % a != 0) {
                System.out.println("No ▁ solution");
            } else {
                b = b / a;
                int x = 0;
                int y = -2000;
                if (b >= 0) {
                    while (y < b) {
                        y = (int) Math.pow(x, n);
                        x = x + 1;
                    }
                    if (y > b) {
                        System.out.println("No ▁ solution");
                    } else {
                        System.out.println(x - 1);
                    }
                } else {
                    if (n % 2 == 0) {
                        System.out.println("No ▁ solution");
                    } else {
                        x = -1;
                        y = 2000;
                        while (y > b) {
                            y = (int) Math.pow(x, n);
                            x = x - 1;
                        }
                        if (y < b) {
                            System.out.println("No ▁ solution");
                        } else {
                            System.out.println(x + 1);
                        }
                    }
                }
            }
        } else {
            if (b == 0) {
                System.out.println(5);
            } else {
                System.out.println("No ▁ solution");
            }
        }
    }
}
```

Please note that in Java, the scanner is used to read input from the user. In this case, the `Scanner` reads the entire line as a string and then it is split into an array of strings using the " ▁ " delimiter, similar to `split(' ▁ ')` in Python. Then we use a stream to map each part to an integer and collect it into an array. Integer division automatically floors the result, so no need for an explicit floor operation during `b/a`. I've also replaced the `pow` function from Python with `Math.pow` and cast the result to `int` to mimic the integer behavior of the power operation in Python.
