Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
8
3

```
print reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2
for i in range(1, int(raw_input())+1): print i+1
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        result += 2;

        System.out.println(result);

        for (int i = 1; i <= n; i++) {
            System.out.println(i+1);
        }
    }
}
```<|endoftext|>
