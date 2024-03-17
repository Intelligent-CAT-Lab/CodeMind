Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
0


```
n = int(input())
print(len(bin(n)) - 2 if n else 0)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n == 0? 0 : Integer.bitCount(n));
    }
}
```

Explanation:

In Java, we can use the `Scanner` class to read input from the user. We can then use the `nextInt()` method to read an integer input from the user.

We can then use the `bitCount()` method of the `Integer` class to count the number of set bits in the binary representation of the input integer. This method returns the number of bits that are set to 1 in the binary representation of the input integer.

If the input integer is 0, we return 0 as there are no set bits in the binary representation of 0. Otherwise, we return the result of `bitCount()` method.<|endoftext|>
