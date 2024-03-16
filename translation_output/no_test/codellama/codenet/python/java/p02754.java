<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,a,b = map(int,input().split())

k = n//(a+b)
p = n%(a+b)

print(k*a + min(p,a))


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int k = n / (a + b);
        int p = n % (a + b);

        System.out.println(k * a + Math.min(p, a));
    }
}
```
Note that the `Math.min()` method is used to find the minimum of two values, which is equivalent to the `min()` function in Python.</s>
