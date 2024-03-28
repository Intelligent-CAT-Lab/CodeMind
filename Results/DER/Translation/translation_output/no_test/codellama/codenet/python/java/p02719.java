<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n, k = map(int, input().split())

rot = n//k
x = n

if k == 1 or n == k or n%k == 0:
  x = 0
elif rot >= 1:
  x = n - k*rot
  
t = x%k

print(min(t, abs(t-k)))

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int rot = n / k;
        int x = n;

        if (k == 1 || n == k || n % k == 0) {
            x = 0;
        } else if (rot >= 1) {
            x = n - k * rot;
        }

        int t = x % k;
        System.out.println(Math.min(t, Math.abs(t - k)));
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Math.min` and `Math.abs` methods are used to calculate the minimum and absolute value of the variables, respectively.</s>
