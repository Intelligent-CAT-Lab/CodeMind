Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 5

Expected output:
-21

```
D, L = map(int,input().split())
ans = int(D/L) + (D-L*int(D/L))
print(ans)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt();
        int L = sc.nextInt();
        int ans = (int) Math.ceil((double) D / L) * L - D;
        System.out.println(ans);
    }
}
```

Explanation:

In Java, we can use the Scanner class to read input from the user. We can then use the `nextInt()` method to read integers from the input.

We can then use the formula `(int) Math.ceil((double) D / L) * L - D` to calculate the answer. This formula calculates the minimum number of times we can add `L` to `D` to get a multiple of `L`. We then subtract `D` from this value to get the final answer.

We use the `Math.ceil()` method to round up the result of the division to the nearest integer. This ensures that we don't miss any extra `L` units that we need to add to `D` to get a multiple of `L`.<|endoftext|>
