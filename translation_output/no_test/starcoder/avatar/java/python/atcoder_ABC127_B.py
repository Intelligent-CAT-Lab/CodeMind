<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        for (int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import java.util.*;

class atcoder_ABC127_B:
    def main(self):
        sc = Scanner(System.in)
        r = Integer.parseInt(sc.next())
        d = Integer.parseInt(sc.next())
        x = Integer.parseInt(sc.next())

        for i in range(10):
            x = r * x - d
            System.out.println(x)

if __name__ == '__main__':
    atcoder_ABC127_B().main()
```
"""

import java.util.*;

class atcoder_ABC127_B:
    def main(self):
        sc = Scanner(System.in)
        r = Integer.parseInt(sc.next())
        d = Integer.parseInt(sc.next())
        x = Integer.parseInt(sc.next())

        for i in range(10):
            x = r * x - d
            System.out.println(x)

if __name__ == '__main__':
    atcoder_ABC127_B().main()
<|endoftext|>
