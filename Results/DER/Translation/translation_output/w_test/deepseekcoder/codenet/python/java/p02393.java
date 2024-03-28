<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 8 1

Expected output:
1 3 8


```
s =list(map(int,input().split()))
s1 = sorted(s)
print(str(s1[0])+" "+str(s1[1])+" "+str(s1[2]))


```

### Response:
```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] s = new int[3];
        s[0] = scanner.nextInt();
        s[1] = scanner.nextInt();
        s[2] = scanner.nextInt();
        Arrays.sort(s);
        System.out.println(s[0] + " " + s[1] + " " + s[2]);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, sorts them in ascending order, and then prints them out.
<|EOT|>
