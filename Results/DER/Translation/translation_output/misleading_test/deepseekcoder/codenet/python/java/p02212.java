<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 3 4

Expected output:
90

```
l = sorted(list(map(int, input().split())))

print(abs((l[0] + l[3]) - (l[1] + l[2])))

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] l = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            l[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(l);
        System.out.println(Math.abs((l[0] + l[l.length - 1]) - (l[1] + l[l.length - 2])));
    }
}
```

This Java code does the same thing as the Python code. It reads the input, converts it to integers, sorts the array, and then calculates the absolute difference between the sums of the first and last two numbers and the second and second-to-last numbers in the sorted array. The result is printed to the console.
<|EOT|>
