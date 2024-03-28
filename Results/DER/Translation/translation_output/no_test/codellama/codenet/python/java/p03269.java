<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

l = int(input())

d = max([d for d in range(30) if 2**d <= l])
n = d+1
m = 2*d
ans = []
for i in range(1, n):
    ans.append((i, i+1, 0))
    ans.append((i, i+1, 2**(i-1)))

while l > 2**d:
    for i in range(n-1, 0, -1):
        if l-2**(i-1) > 2**d-1:
            ans.append((i, n, l-2**(i-1)))
            m += 1
            l -= 2**(i-1)
            break

print(n, m)
for a in ans:
    print(*a)

Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int d = 0;
        int n = 0;
        int m = 0;
        int[] ans = new int[l];

        for (int i = 0; i < l; i++) {
            if (2 * d <= l) {
                d++;
            }
            n = d + 1;
            m = 2 * d;
            ans[i] = (i, i + 1, 0);
            ans[i] = (i, i + 1, 2 ** (i - 1));
        }

        while (l > 2 ** d) {
            for (int i = n - 1; i > 0; i--) {
                if (l - 2 ** (i - 1) > 2 ** d - 1) {
                    ans[i] = (i, n, l - 2 ** (i - 1));
                    m += 1;
                    l -= 2 ** (i - 1);
                    break;
                }
            }
        }

        System.out.println(n + " " + m);
        for (int i = 0; i < l; i++) {
            System.out.println(ans[i]);
        }
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `int[] ans` array is used to store the results of the calculation.</s>
