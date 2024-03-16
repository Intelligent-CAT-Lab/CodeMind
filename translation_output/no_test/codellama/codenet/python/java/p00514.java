<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n,m,r=map(int,input().split())
a,b=sorted([n-1,r-m*n])
d=1
for i in range(a):d*=i+1
u=1
for i in range(b,a+b):u*=i+1
print(0 if a<1 else u//d)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int r = scanner.nextInt();
        int a = Math.max(n - 1, r - m * n);
        int b = Math.min(n - 1, r - m * n);
        int d = 1;
        for (int i = 0; i < a; i++) {
            d *= i + 1;
        }
        int u = 1;
        for (int i = b; i < a + b; i++) {
            u *= i + 1;
        }
        System.out.println(0 < a ? u / d : 0);
    }
}
```
Note that the `Math.max` and `Math.min` functions are used to find the maximum and minimum values of `n - 1` and `r - m * n`, respectively. The `Scanner` class is used to read input from the user. The `System.out.println` method is used to print the result to the console.</s>
