<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
fr

```
import java.util.Scanner;
public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}

```
[/INST]
```python
import sys

def main():
    sc = sys.stdin
    print("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.readline().strip().split(" ")[0] % 7])

if __name__ == "__main__":
    main()
```</s>
