<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,m=map(int,input().split())
d=[1]*(n+1)
for i in range(n):
  d[i+1]=((m-i)*((m-n+i)*d[i]+i*d[i-1]*(m-i+1)))%(10**9+7)
print(d[-1])


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] d = new int[n + 1];
        for (int i = 0; i < n; i++) {
            d[i + 1] = (m - i) * ((m - n + i) * d[i] + i * d[i - 1] * (m - i + 1)) % (1000000007);
        }
        System.out.println(d[n]);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `nextInt()` method is used to read an integer value from the user. The `int[]` array is used to store the values of `d` in the Python code. The `for` loop is used to iterate over the values of `i` from 0 to `n - 1`, and the `d[i + 1]` expression is used to calculate the value of `d[i + 1]` based on the previous values of `d[i]` and `d[i - 1]`. Finally, the `System.out.println()` method is used to print the value of `d[n]` to the console.</s>
