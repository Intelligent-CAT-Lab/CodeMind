<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    a, b, c = sys.stdin.readline().split()
    if a[-1] == b[0] and b[-1] == c[0]:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```
Note: The `sys.stdin.readline()` method is used to read a line of input from the standard input stream. The `split()` method is used to split the input line into a list of words. The `a[-1]`, `b[0]`, and `c[0]` expressions are used to access the last character of the first word, the first character of the second word, and the first character of the third word, respectively. The `if` statement checks if the last character of the first word is equal to the first character of the second word, and if the first character of the second word is equal to the first character of the third word. If both conditions are true, the program prints "YES", otherwise it prints "NO".</s>
