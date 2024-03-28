Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.HashSet
import java.util.Scanner
import java.util.Set

class p03146:
    sc = Scanner(System.in)

    def main(self):
        s = sc.nextInt()
        set = HashSet()
        set.add(s)
        i = 1
        while True:
            i += 1
            if s % 2 == 0:
                s = s // 2
            else:
                s = 3 * s + 1
            if set.contains(s):
                print(i)
                return
            else:
                set.add(s)

p03146().main()
```<|endoftext|>
