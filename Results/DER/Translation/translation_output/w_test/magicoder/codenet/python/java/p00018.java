<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 6 9 7 5

Expected output:
9 7 6 5 3


```
for a in reversed(sorted(map(int,raw_input().split()))):print a,
```

@@ Response
Here is the Java equivalent of the Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Integer[] numbers = new Integer[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
```

This Java code reads the input from the user, splits it into an array of strings, converts each string to an integer, sorts the array in descending order, and then prints the sorted array.<｜end▁of▁sentence｜>
