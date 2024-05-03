Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] l = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
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

This Java code does the same thing as your Python code. It reads a line of input, splits it into words, converts each word to an integer, and stores them in an array. It then sorts the array and calculates the product of the first two odd numbers. If there are no odd numbers, it sets the product to 0. Finally, it prints the product.
