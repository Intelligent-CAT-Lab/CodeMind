Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
S, T = input().split()

print(T + S)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S, T;
        S = sc.next();
        T = sc.next();
        System.out.println(T + S);
    }
}
```<|endoftext|>
