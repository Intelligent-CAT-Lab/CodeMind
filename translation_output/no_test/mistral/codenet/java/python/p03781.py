<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03781 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), i = 1;
        for (; i * (i + 1) / 2 < x; i++) {}
        System.out.println(i);
    }
}
```
[/INST]
```python
import sys

def main():
    x = int(input())
    i = 1
    while i * (i + 1) // 2 < x:
        i += 1
    print(i)

if __name__ == "__main__":
    main()
```</s>
