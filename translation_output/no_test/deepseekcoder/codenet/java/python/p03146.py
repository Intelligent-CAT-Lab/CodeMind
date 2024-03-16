<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
def p03146():
    s = int(input())
    set_ = {s}
    i = 1
    while True:
        i += 1
        if s % 2 == 0:
            s = s // 2
        else:
            s = 3 * s + 1
        if s in set_:
            print(i)
            return
        else:
            set_.add(s)

if __name__ == "__main__":
    p03146()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then applies the Collatz function to it, keeping track of the number of steps taken and the values encountered, until it finds a value that has already been seen. The number of steps taken is then printed to the standard output.
<|EOT|>
