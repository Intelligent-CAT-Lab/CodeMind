<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

a,b,c=map(int,input().split())
x=max(a,b,c)
y=min(a,b,c)
z=a+b+c-x-y
if (z-y)%2==0:
  print(x-z+(z-y)//2)
else:
  print(x-z+1+(z-y+1)//2)

Translate the above python code to java.

java code:

[/INST]
```
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = Math.max(a, Math.max(b, c));
        int y = Math.min(a, Math.min(b, c));
        int z = a + b + c - x - y;
        if ((z - y) % 2 == 0) {
            System.out.println(x - z + (z - y) / 2);
        } else {
            System.out.println(x - z + 1 + (z - y + 1) / 2);
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user, and the `Math.max` and `Math.min` methods to find the maximum and minimum values of `a`, `b`, and `c`. The rest of the code is similar to the Python code, with the exception of the `//` operator, which is used for integer division in Java.</s>
