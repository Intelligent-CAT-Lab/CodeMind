<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:



a,b,x = [int(i) for i in input().split()]

d = a - b
n = max(0,(x - b)) // d
ans = x + n * b
print(ans % 1000000007)



Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int d = a - b;
        int n = Math.max(0, (x - b)) / d;
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}
```
Note that the `Scanner` class is used to read input from the user, and the `Math.max` method is used to find the maximum of two numbers. The `%` operator is used to perform modulo division, which is equivalent to the `//` operator in Python.</s>
