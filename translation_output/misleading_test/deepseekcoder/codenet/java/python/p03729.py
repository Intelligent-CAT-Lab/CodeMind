<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def main():
    a, b, c = input().split()

    if a[-1] == b[0] and b[-1] == c[0]:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input().split()` function to read the input and split it into three strings `a`, `b`, and `c`. Then we check if the last character of `a` is the same as the first character of `b` and the last character of `b` is the same as the first character of `c`. If both conditions are met, we print "YES", otherwise we print "NO".
<|EOT|>
