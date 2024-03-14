Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
X = int(input())
if X >= 30:
    print("Yes")
else:
    print("No")
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X >= 30) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```<|endoftext|>
