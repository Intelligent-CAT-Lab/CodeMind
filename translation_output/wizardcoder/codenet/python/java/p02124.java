Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
print("ai1333" + "3" * int(int(input()) / 100))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n / 100;
        System.out.println("ai1333" + "3" * count);
    }
}
```<|endoftext|>
