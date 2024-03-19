<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AtCoder Beginner Contest

Expected output:
ABC

```
import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        char upper = lines[1].charAt(0);
        System.out.println("A" + upper +"C");
    }
}
```
[/INST]
```python
import sys

def main():
    lines = sys.stdin.readline().split()
    upper = lines[1][0]
    print("A" + upper + "C")

if __name__ == "__main__":
    main()
```</s>
