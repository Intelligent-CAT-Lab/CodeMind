<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
L, R = map(int,(input().split()))
print(L*R)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int L = Integer.parseInt(input[0]);
        int R = Integer.parseInt(input[1]);
        System.out.println(L * R);
    }
}
```
<|EOT|>
