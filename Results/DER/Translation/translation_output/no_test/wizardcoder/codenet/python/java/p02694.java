Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
x = int(input())

y = 100
ans = 0
while y < x:
    ans += 1
    y = math.floor(y*1.01)

print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int y = 100;
        int ans = 0;
        while (y < x) {
            ans++;
            y = (int) Math.floor(y * 1.01);
        }

        System.out.println(ans);
    }
}
```<|endoftext|>
