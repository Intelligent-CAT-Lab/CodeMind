<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 3 4

Expected output:
0


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
        int[] l = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(l);
        System.out.println(Math.abs((l[0] + l[l.length - 1]) - (l[1] + l[2])));
    }
}
```

This Java code reads the input from the user, splits it into an array of integers, sorts the array, and then calculates the absolute difference between the sum of the first and last elements and the sum of the second and third elements. The result is printed to the console.
<|EOT|>
