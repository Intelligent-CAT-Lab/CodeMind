<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
abc = list(map(int, input().split()))
abc.sort()
print(abc[0] + abc[1])
```

@@ Response
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] abc = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            abc[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(abc);
        System.out.println(abc[0] + abc[1]);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, sorts the array, and then prints the sum of the first two elements.<｜end▁of▁sentence｜>
