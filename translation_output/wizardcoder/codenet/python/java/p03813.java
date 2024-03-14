Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a = int(input())
print('ABC' if a<1200 else 'ARC')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        scanner.close();
        System.out.println(a<1200? "ABC" : "ARC");
    }
}
```<|endoftext|>
