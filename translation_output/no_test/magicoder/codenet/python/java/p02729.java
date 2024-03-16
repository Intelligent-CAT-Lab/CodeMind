<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
n,m = map(int,input().split())

even = n * (n-1) // 2
odd = m * (m-1) // 2

print(even + odd)
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        long even = (long) n * (n-1) / 2;
        long odd = (long) m * (m-1) / 2;

        System.out.println(even + odd);
    }
}
```

In Java, we use the `Scanner` class to read input from the user. The `split(" ")` method is used to split the input string into an array of strings, where each string is a word in the input. The `Integer.parseInt(input[i])` method is used to convert each string in the array to an integer.

The `//` operator in Java is used for integer division, which is equivalent to the `//` operator in Python. However, Java requires explicit casting to `long` for integer division to work correctly with large numbers.

The `System.out.println()` method is used to print the result to the console.<｜end▁of▁sentence｜>
