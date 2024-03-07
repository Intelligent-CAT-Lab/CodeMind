<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p03331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = n;
        for(int a = 2; a <= n/2; a++) {
            int b = n - a;
            int sum = digit(a) + digit(b);
            ans = Math.min(sum,ans);
        }
        System.out.println(ans);
    }
    
    static int digit(int num) {
        int r = 0;
        while(true) {
            r += (num%10);
            num /= 10;
            if(num == 0) break;
        }
        return r;
    }
}

Translate the above java code to python.

python code:

[/INST]
```python
import math

def digit(num):
    r = 0
    while num > 0:
        r += num % 10
        num //= 10
    return r

n = int(input())
ans = n
for a in range(2, n//2+1):
    b = n - a
    sum = digit(a) + digit(b)
    ans = min(sum, ans)

print(ans)
```
This is the Python code equivalent to the Java code you provided. The `digit` function is the same, and the main loop is also similar, but the syntax for the `for` loop and the `min` function is different in Python.

Also, in Python, you don't need to declare the `ans` variable before using it, you can simply use it directly in the `min` function.

Also, in Python, you don't need to use `static` keyword for the `digit` function, it is automatically considered as a static function.

Also, in Python, you don't need to use `System.out.println` to print the result, you can simply use `print` function.</s>
