Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
rng gorilla apple

Expected output:
YES


```
a, b, c = input().split()

if a[-1] == b[0] and b[-1] == c[0]:
    print('YES')
else:
    print('NO')


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        String a = arr[0];
        String b = arr[1];
        String c = arr[2];

        if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```<|endoftext|>
