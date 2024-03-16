<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02576 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x, t;
        n = sc.nextInt();
        x = sc.nextInt();
        t = sc.nextInt();
        long ans = 0, tako = 0;
        while (n > tako) {
            ans += t;
            tako += x;
        }
        System.out.println(ans);
        sc.close();
    }
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

n, x, t = map(int, sys.stdin.readline().split())
ans = 0
tako = 0
while n > tako:
    ans += t
    tako += x
print(ans)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from the standard input stream to integers, and the `split` method is used to split the input into three separate integers. The rest of the code is similar to the Java code, with the exception of the `print` function being used instead of `System.out.println`.</s>
