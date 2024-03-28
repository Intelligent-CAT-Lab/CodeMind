<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
rng gorilla apple

Expected output:
YeA

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

def main():
    a, b, c = input().split()

    if a[-1] == b[0] and b[-1] == c[0]:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input().split()` function to read the input from the user. This function splits the input into a list of strings, where each string is a word in the input. We then check if the last character of the first string is equal to the first character of the second string and the last character of the second string is equal to the first character of the third string. If both conditions are true, we print "YES", otherwise we print "NO".<｜end▁of▁sentence｜>
