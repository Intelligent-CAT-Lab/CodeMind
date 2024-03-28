<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
ChC!eRmms

```
D=int(input())
d={25:'Christmas',24:'Christmas Eve',23:'Christmas Eve Eve',22:'Christmas Eve Eve Eve'}
print(d[D])
```

### Response:
Here is the Java code equivalent to the Python code:

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        HashMap<Integer, String> d = new HashMap<>();
        d.put(25, "Christmas");
        d.put(24, "Christmas Eve");
        d.put(23, "Christmas Eve Eve");
        d.put(22, "Christmas Eve Eve Eve");
        System.out.println(d.get(D));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, and then uses a HashMap to map the integer to a string. The string is then printed out.
<|EOT|>
