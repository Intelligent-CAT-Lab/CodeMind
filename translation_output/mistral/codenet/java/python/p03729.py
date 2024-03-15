<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
    a = input()
    b = input()
    c = input()

    if a[-1] == b[0] and b[-1] == c[0]:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```</s>
