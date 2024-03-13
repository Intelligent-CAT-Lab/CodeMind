<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
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
```

@@ Response
```python
# Python code

# Get input from user
num_1 = int(input())
num_2 = int(input())
num_3 = int(input())

# Check conditions
if num_1 == 7:
    if num_2 == 5 and num_3 == 5:
        print("YES")
    else:
        print("NO")
elif num_2 == 7:
    if num_1 == 5 and num_3 == 5:
        print("YES")
    else:
        print("NO")
elif num_3 == 7:
    if num_2 == 5 and num_1 == 5:
        print("YES")
    else:
        print("NO")
```

This Python code does the same thing as the Java code. It gets three integers as input from the user, and then checks if the first number is 7 and the second and third numbers are 5. If so, it prints "YES". Otherwise, it prints "NO".<｜end▁of▁sentence｜>
