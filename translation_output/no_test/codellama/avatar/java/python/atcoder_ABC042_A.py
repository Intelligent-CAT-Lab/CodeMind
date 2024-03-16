<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.*;

class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int num_1 = Integer.parseInt(str);

        str = scan.next();
        int num_2 = Integer.parseInt(str);

        str = scan.next();
        int num_3 = Integer.parseInt(str);

        if (num_1 == 7) {
            if (num_2 == 5 && num_3 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (num_2 == 7) {
            if (num_1 == 5 && num_3 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (num_3 == 7) {
            if (num_2 == 5 && num_1 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

num_1, num_2, num_3 = map(int, sys.stdin.readline().split())

if num_1 == 7 and num_2 == 5 and num_3 == 5:
    print("YES")
else:
    print("NO")
```
This is a more concise version of the Java code, using the `map` function to convert the input strings to integers, and the `split` method to split the input string into three parts. The `if` statement is also more concise, using the `and` operator to check if all three numbers are equal to 7, 5, and 5.</s>
