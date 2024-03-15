<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02778 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.print("x");
        }

    }
}
```
[/INST]
```python
import sys

def main():
    s = input()

    for i in range(len(s)):
        print("x", end="")

if __name__ == "__main__":
    main()
```</s>
