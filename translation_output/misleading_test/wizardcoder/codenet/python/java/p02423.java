Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8

Expected output:
1000
11111111111111111111111111110111
10000
100
17

```
n = int(input())
mask = (1<<32)-1
print('{:032b}'.format(n))
print('{:032b}'.format(~n & mask))
print('{:032b}'.format((n<<1)& mask))
print('{:032b}'.format((n>>1)& mask))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = (1<<32)-1;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(Integer.toBinaryString(~n & mask));
        System.out.println(Integer.toBinaryString((n<<1)& mask));
        System.out.println(Integer.toBinaryString((n>>1)& mask));
    }
}
```<|endoftext|>
