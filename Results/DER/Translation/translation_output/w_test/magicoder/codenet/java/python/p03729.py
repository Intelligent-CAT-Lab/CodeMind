<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
rng gorilla apple

Expected output:
YES


```
import java.util.Scanner;

class p03729 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

@@ Response
```python
# Python code

def check_strings(a, b, c):
    if a[-1] == b[0] and b[-1] == c[0]:
        return "YES"
    else:
        return "NO"

# Test input
a, b, c = input().split()

# Print the result
print(check_strings(a, b, c))
```

In this Python code, we define a function `check_strings` that takes three strings as input and checks if the last character of the first string is equal to the first character of the second string and the last character of the second string is equal to the first character of the third string. If both conditions are met, it returns "YES", otherwise it returns "NO".

Then we take the input from the user and split it into three strings. Finally, we call the `check_strings` function with these strings and print the result.<｜end▁of▁sentence｜>
