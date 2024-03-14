Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A, B, C = map(int, input().split())

get = A - B

i = C - get

if i < 0:
    i = 0
     
print(i)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int get = A - B;
        int i = C - get;

        if (i < 0) {
            i = 0;
        }

        System.out.println(i);
    }
}
```<|endoftext|>
