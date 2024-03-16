<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a <= 0 && b >= 0 || a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else if (a < 0 && b < 0) {
            System.out.println(((b - a + 1) % 2 == 0)? "Positive" : "Negative");
        } else if (a > 0 && b > 0) {
            System.out.println("Positive");
        }
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import java.util.*;

class atcoder_AGC002_A:
    def main(self):
        sc = Scanner(System.in)
        a = sc.nextLong()
        b = sc.nextLong()

        if a <= 0 and b >= 0 or a <= 0 and b >= 0:
            print("Zero")
        elif a < 0 and b < 0:
            print(((b - a + 1) % 2 == 0)? "Positive" : "Negative")
        elif a > 0 and b > 0:
            print("Positive")

if __name__ == '__main__':
    atcoder_AGC002_A().main()
```
"""

import java.util.*;

class atcoder_AGC002_A:
    def main(self):
        sc = Scanner(System.in)
        a = sc.nextLong()
        b = sc.nextLong()

        if a <= 0 and b >= 0 or a <= 0 and b >= 0:
            print("Zero")
        elif a < 0 and b < 0:
            print(((b - a + 1) % 2 == 0)? "Positive" : "Negative")
        elif a > 0 and b > 0:
            print("Positive")

if __name__ == '__main__':
    atcoder_AGC002_A().main()
<|endoftext|>
