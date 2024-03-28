Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 8 2

Expected output:
14

```
_input = list(map(int, input().split(" ")))
a = _input[0]
b = _input[1]
x = _input[2]

result = b // x - (a - 1)// x

print(result)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = sc.nextInt();
        }
        int a = input[0];
        int b = input[1];
        int x = input[2];
        int result = b / x - (a - 1) / x;
        System.out.println(result);
    }
}
```<|endoftext|>
