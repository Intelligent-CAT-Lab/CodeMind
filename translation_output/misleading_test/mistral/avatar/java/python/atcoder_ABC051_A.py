<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud,

Expected output:
@nxzq asadas asdasf

```
import java.util.Scanner;

public class atcoder_ABC051_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");
        
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();
        
        System.out.println(a + " " + b + " " + c);
    }
}
```
[/INST]
```python
import sys

def main():
    a, b, c = sys.stdin.readline().strip().split()
    print(a + " " + b + " " + c)

if __name__ == "__main__":
    main()
```</s>
