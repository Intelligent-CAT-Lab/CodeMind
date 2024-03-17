<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
9


```
x = int(input())
ans = 1
for b in range(x):
    for p in range(2, x):
        if b**p <= x:
            ans = max(ans, b**p)
        else:
            break
print(ans)
```
[/INST]
```java
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;
        for (int b = 2; b <= x; b++) {
            for (int p = 2; p <= x; p++) {
                if (Math.pow(b, p) <= x) {
                    ans = Math.max(ans, (int) Math.pow(b, p));
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
```
This code uses a nested for loop to iterate over the values of `b` and `p`, and checks if `b**p` is less than or equal to `x`. If it is, it updates the value of `ans` to the maximum of `ans` and `b**p`. If `b**p` is greater than `x`, it breaks out of the inner loop and continues with the next value of `b`. Finally, it prints the value of `ans`.

Note that this code uses the `Math.pow()` method to calculate the power of `b` to the power of `p`, and the `Math.max()` method to find the maximum of two values. It also uses the `Scanner` class to read input from the user.</s>
