<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
-21

```
import math
k=int(input())
print(math.ceil(k/2)*(k//2))
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        System.out.println(Math.ceil(k/2)*(k/2));
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.ceil()` method to round up the result of the division to the nearest integer. The `Math.ceil()` method returns the smallest (closest to negative infinity) double value that is greater than or equal to the argument, so it rounds up the result of the division to the nearest integer. The `Math.ceil()` method is then multiplied by the result of the division to get the final result.

The `Math.ceil()` method is used instead of the `Math.round()` method because the `Math.round()` method rounds to the nearest integer, which may not always be the desired result. For example, if `k` is 3, then `k/2` is 1.5, which rounds to 2 using `Math.round()`, but `Math.ceil()` rounds it up to 2.

The `Math.ceil()` method is also used instead of the `Math.floor()` method because the `Math.floor()` method rounds down to the nearest integer, which may not always be the desired result. For example, if `k` is 3, then `k/2` is 1.5, which rounds down to 1 using `Math.floor()`, but `Math.ceil()` rounds it up to 2.

The `Math.ceil()` method is used instead of the `Math.round()` method because it is more precise and accurate, and it is also more efficient. The `Math.ceil()` method is a built-in method in Java, which means that it is already implemented and optimized, and it is also more readable and easier to understand than the `Math.round()` method.

The `Math.ceil()` method is also used instead of the `Math.round()` method because it is more consistent with the behavior of other mathematical operations in Java. For example, the `Math.ceil()` method is used in the `Math.pow()` method to round up the result of the power operation to the nearest integer, and it is also used in the `Math.sqrt()` method to round up the result of the square root operation to the nearest integer.

In summary, the `Math.ceil()` method is used instead of the `Math.round()` method because it is more precise and accurate, and it is also more efficient and consistent with the behavior of other mathematical operations in Java.</s>
