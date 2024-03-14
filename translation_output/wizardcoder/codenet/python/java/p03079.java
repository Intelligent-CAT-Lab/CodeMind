Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, c = map(int, input().split())
if a == b and b == c :
    print("Yes")
else :
    print("No")
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```<|endoftext|>
