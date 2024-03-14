Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s, c = map(int, input().split())

print(s + ((c-s*2)//4)) if s * 2 <= c else print(c//2)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        
        if (s * 2 <= c) {
            result = s + ((c-s*2)//4);
        } else {
            result = c/2;
        }
        
        System.out.println(result);
    }
}
```<|endoftext|>
