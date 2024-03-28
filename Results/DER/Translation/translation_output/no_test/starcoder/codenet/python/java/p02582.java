<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import sys


def solve():
    readline = sys.stdin.buffer.readline
    mod = 10 ** 9 + 7
    s = str(readline().rstrip().decode('utf-8'))
    if s == "RRR":
        print(3)
    elif s == "RRS" or s == "SRR":
        print(2)
    elif s.count("R") == 0:
        print(0)
    else:
        print(1)


if __name__ == '__main__':
    solve()

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.equals("RRR")) {
            System.out.println(3);
        } else if (s.equals("RRS") || s.equals("SRR")) {
            System.out.println(2);
        } else if (s.replaceAll("R", "").equals("")) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```
<|endoftext|>
