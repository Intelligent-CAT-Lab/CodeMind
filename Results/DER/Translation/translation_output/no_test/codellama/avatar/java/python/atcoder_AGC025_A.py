<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.nextLine();

        for (int i = 1; i < n.length(); i++) {
            if (n.charAt(i) != '0') {
                int sum = 0;
                for (int j = 0; j < n.length(); j++) {
                    sum += n.charAt(j) - '0';
                }
                System.out.println(sum);
                return;
            }
        }

        if (n.charAt(0) == '1') {
            System.out.println(10);
            return;
        }

        System.out.println(n.charAt(0));
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

n = sys.stdin.readline().strip()

for i in range(1, len(n)):
    if n[i] != '0':
        sum = 0
        for j in range(len(n)):
            sum += int(n[j])
        print(sum)
        return

if n[0] == '1':
    print(10)
    return

print(n[0])
```
This is the Python code equivalent to the given Java code. The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing newline characters from the input string. The rest of the code is similar to the Java code, with the exception of the `int()` function being used to convert the characters to integers before adding them to the sum.</s>
