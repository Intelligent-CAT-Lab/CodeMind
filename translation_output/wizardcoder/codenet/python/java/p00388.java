Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
h, a, b = map(int, input().split())
print([(h%(a+c)==0) for c in range(b-a+1)].count(True))

```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int count = 0;
        for (int c = a; c <= b; c++) {
            if (h % (a + c) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```<|endoftext|>
