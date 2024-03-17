Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
0


```
a,b = map(int,input().split())

def round(a, b):
	if a * b < 0:
		return -(-a//b)
	else:
		return a//b

print(round(a, b))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = round(a, b);
        System.out.println(result);
    }

    public static int round(int a, int b) {
        if (a * b < 0) {
            return -Math.abs(a) / b;
        } else {
            return a / b;
        }
    }
}
```<|endoftext|>
