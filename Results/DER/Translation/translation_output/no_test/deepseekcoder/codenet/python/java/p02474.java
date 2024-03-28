<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a=raw_input().split()
print(int(a[0])*int(a[1]))


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        System.out.println(Integer.parseInt(a[0]) * Integer.parseInt(a[1]));
    }
}
```
<|EOT|>
