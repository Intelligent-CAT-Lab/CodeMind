Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import java.util.Scanner;

class p03729:

    def main(self):
        sc = Scanner(System.in)

        a = sc.next()
        b = sc.next()
        c = sc.next()

        if a[a.length() - 1] == b[0] and b[b.length() - 1] == c[0]:
            print("YES")
        else:
            print("NO")
```

Note: In Python, we use `len()` instead of `length()` to get the length of a string. Also, we use `print()` instead of `System.out.println()` to print the output.<|endoftext|>
