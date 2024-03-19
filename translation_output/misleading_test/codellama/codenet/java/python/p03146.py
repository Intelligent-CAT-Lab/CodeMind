<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
62

```

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03146 {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int s = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        set.add(s);
        int i = 1;
        while (true) {
            i++;
            if (s % 2 == 0) {
                s = s / 2;
            } else {
                s = 3 * s + 1;
            }
            if (set.contains(s)) {
                System.out.println(i);
                return;
            } else {
                set.add(s);
            }
        }
    }
}

```
[/INST]
```python
import sys

def main():
    s = int(sys.stdin.readline().strip())
    set = set()
    set.add(s)
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in set:
            print(i)
            return
        else:
            set.add(s)

if __name__ == "__main__":
    main()
```
Note: The `//` operator is used for integer division in Python, while the `%` operator is used for modulo. The `set` data structure in Python is similar to the `HashSet` in Java, but it is not necessary to explicitly create a `HashSet` in Python.</s>
