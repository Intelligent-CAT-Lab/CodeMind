Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
r,b,w,g = map(int,input().split())
print(r+b+w+g)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int b = sc.nextInt();
        int w = sc.nextInt();
        int g = sc.nextInt();
        System.out.println(r+b+w+g);
    }
}
```<|endoftext|>
