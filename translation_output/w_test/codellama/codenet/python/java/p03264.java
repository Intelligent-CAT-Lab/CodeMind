<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
2


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

The `Math.ceil()` method is used instead of the `Math.round()` method because the `Math.round()` method rounds to the nearest integer, which may not always be the desired result. For example, if `k` is an odd number, then `k/2` will be a fraction, and `Math.round()` will round it to the nearest integer, which may not be the desired result. The `Math.ceil()` method, on the other hand, rounds up to the nearest integer, which is the desired result in this case.

The `Math.ceil()` method is also used instead of the `Math.floor()` method because the `Math.floor()` method rounds down to the nearest integer, which may not always be the desired result. For example, if `k` is an even number, then `k/2` will be an integer, and `Math.floor()` will round it down to the nearest integer, which may not be the desired result. The `Math.ceil()` method, on the other hand, rounds up to the nearest integer, which is the desired result in this case.

The `Math.ceil()` method is used instead of the `Math.round()` method because it is more efficient and more accurate. The `Math.round()` method uses a different algorithm to round numbers, which may not always produce the desired result. The `Math.ceil()` method, on the other hand, uses a simple algorithm that rounds up to the nearest integer, which is the desired result in this case.

The `Math.ceil()` method is also used instead of the `Math.floor()` method because it is more intuitive and easier to understand. The `Math.floor()` method rounds down to the nearest integer, which may not always be the desired result. The `Math.ceil()` method, on the other hand, rounds up to the nearest integer, which is the desired result in this case.

In summary, the `Math.ceil()` method is used in this code because it is more efficient, more accurate, and more intuitive than the `Math.round()` and `Math.floor()` methods. It rounds up to the nearest integer, which is the desired result in this case.</s>
