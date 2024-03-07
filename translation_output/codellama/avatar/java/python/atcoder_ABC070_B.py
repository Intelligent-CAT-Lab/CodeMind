<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class atcoder_ABC070_B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] array = new int[101];
        
        for (int i = a; i < b; i++) {
            array[i]++;
        }
        
        for (int i = c; i < d; i++) {
            array[i]++;
        }
        
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            if (array[i] == 2) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

a, b, c, d = map(int, sys.stdin.readline().split())
array = [0] * 101

for i in range(a, b):
    array[i] += 1

for i in range(c, d):
    array[i] += 1

ans = 0
for i in range(101):
    if array[i] == 2:
        ans += 1

print(ans)
```
This is the Python code that translates the Java code you provided. It uses the `map` function to convert the input from a string to a list of integers, and then it uses a list comprehension to create the `array` variable. The rest of the code is similar to the Java code, with a few minor changes to account for the differences between Python and Java.</s>
