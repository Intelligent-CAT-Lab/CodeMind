Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2

Expected output:
13

```
n,k=map(int,input().split())
print(k*(k-1)**(n-1))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result = k * (k - 1) * (k - 2) *... * (k - n + 1);
        System.out.println(result);
    }
}
```

Explanation:

In Java, we can use the Scanner class to read input from the user. We can then use the `nextInt()` method to read integers from the input.

We can then use a loop to calculate the result. We can initialize a variable `result` to `k` and then multiply it by the product of all the integers from `k-n+1` to `k-1`. We can use the `Math.pow()` method to calculate the power of a number.

Finally, we can print the result using the `System.out.println()` method.<|endoftext|>
