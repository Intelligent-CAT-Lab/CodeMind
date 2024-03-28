Here is the equivalent Java code for the Python code you've provided:

```java
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int[] a = new int[100];
        int[] b = new int[inputs.length];

        for (int i = 0; i < inputs.length; i++) {
            b[i] = Integer.parseInt(inputs[i]);
            a[b[i] - 1]++;
        }

        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }

        System.out.println(c == 3 ? "yes" : "no");
        scanner.close();
    }
}
```

This Java code does the following:

- Uses a `Scanner` to read a line from standard input and split it by spaces into a string array.
- Initializes an array `a` of size 100 to count the occurrences, and an array `b` that holds the input numbers.
- Parses each input string into an integer and increments the corresponding index in the `a` array to count the frequency of each number.
- Traverses the `a` array to calculate the number of times a set of four identical numbers appear.
- Prints "yes" if there are exactly three sets of four identical numbers, otherwise prints "no".
