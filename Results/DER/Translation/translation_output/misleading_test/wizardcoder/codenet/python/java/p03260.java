Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
5Yes

```
a, b = map(int, input().split())
print("Yes" if a % 2!= 0 and b % 2!= 0 else "No")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.println(a % 2!= 0 && b % 2!= 0? "Yes" : "No");
    }
}
```<|endoftext|>
