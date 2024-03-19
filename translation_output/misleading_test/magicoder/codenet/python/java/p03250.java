<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 5 2

Expected output:
-2

```
abc = list(map(int, input().split()))
abc.sort()
print(int(str(abc[2]) + str(abc[1])) + abc[0])
```

@@ Response
Here is the Java version of the given Python code:

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
        System.out.println(Integer.parseInt(String.valueOf(abc[2]) + String.valueOf(abc[1])) + abc[0]);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, splits it into an array of strings, converts each string to an integer, sorts the array, and then concatenates the last two elements of the sorted array (which are the largest two numbers) with the first element (which is the smallest number) and prints the result.<｜end▁of▁sentence｜>
