<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        double b = sc.nextDouble();
        long c = (long) Math.round(b * 100);
        long d = a * c;
        System.out.println(d / 100);
    }
}
```
[/INST]
```python
import sys

def main():
    sc = sys.stdin
    a = int(sc.readline())
    b = float(sc.readline())
    c = int(round(b * 100))
    d = a * c
    print(d // 100)

if __name__ == "__main__":
    main()
```</s>
