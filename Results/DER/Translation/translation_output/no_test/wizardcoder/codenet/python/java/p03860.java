Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A,x,C=input().split()
print("A"+x[0]+"C")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A, x, C;
        A = sc.next();
        x = sc.next();
        C = sc.next();
        System.out.println(A + x.charAt(0) + C);
    }
}
```<|endoftext|>
