Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,x = map(int, input().split())
print('YES' if a<=x and a+b>=x else 'NO')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        if (a <= x && a + b >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```<|endoftext|>
