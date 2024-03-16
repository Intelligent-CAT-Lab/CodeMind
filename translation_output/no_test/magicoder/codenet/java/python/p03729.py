<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
class p03729:

    @staticmethod
    def main():
        a = input()
        b = input()
        c = input()

        if a[-1] == b[0] and b[-1] == c[0]:
            print("YES")
        else:
            print("NO")

p03729.main()
```

This Python code does the same thing as the Java code. It reads three strings from the user, and then checks if the last character of the first string is the same as the first character of the second string, and if the last character of the second string is the same as the first character of the third string. If both conditions are met, it prints "YES". Otherwise, it prints "NO".<｜end▁of▁sentence｜>
