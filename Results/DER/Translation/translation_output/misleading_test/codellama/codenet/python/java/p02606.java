<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 10 2

Expected output:
82

```
L, R, d = map(int, input().split())
ans = 0
for i in range(L, R+1):
  if i%d == 0:
    ans += 1
print(ans)
```
[/INST]
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        int d = sc.nextInt();
        int ans = 0;
        for (int i = L; i <= R; i++) {
            if (i % d == 0) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `for` loop to iterate over the range of numbers from `L` to `R` and count the number of multiples of `d`. The `if` statement checks if the current number is a multiple of `d`, and if it is, it increments the `ans` variable. Finally, the `System.out.println()` method is used to print the result.</s>
