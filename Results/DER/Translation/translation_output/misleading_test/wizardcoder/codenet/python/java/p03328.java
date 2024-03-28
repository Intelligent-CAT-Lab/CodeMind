Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 13

Expected output:
101

```
a, b = map(int, input().split())

tower_dis = b - a
b_height = tower_dis * (tower_dis + 1) // 2
ans = b_height - b

print(ans)
```

### Response:
```java
import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int tower_dis = b - a;
        int b_height = tower_dis * (tower_dis + 1) / 2;
        int ans = b_height - n;

        System.out.println(ans);
    }
}
```<|endoftext|>
