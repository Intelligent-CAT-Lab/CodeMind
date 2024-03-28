<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
print(1000-n%1000 if n%1000!=0 else 0)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 1000 != 0) {
            System.out.println(1000 - n % 1000);
        } else {
            System.out.println(0);
        }
    }
}
```
<|EOT|>
