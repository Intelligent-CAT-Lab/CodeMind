<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();
        int x3 = x2 + (y1 - y2);
        int y3 = y2 - (x1 - x2);
        int x4 = x1 - (y2 - y1);
        int y4 = y1 + (x2 - x1);
        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import sys
input = sys.stdin.readline

x1, y1 = map(int, input().split())
x2, y2 = map(int, input().split())

x3 = x2 + (y1 - y2)
y3 = y2 - (x1 - x2)
x4 = x1 - (y2 - y1)
y4 = y1 + (x2 - x1)

print(x3, y3, x4, y4)
```
"""

import sys
input = sys.stdin.readline

x1, y1 = map(int, input().split())
x2, y2 = map(int, input().split())

x3 = x2 + (y1 - y2)
y3 = y2 - (x1 - x2)
x4 = x1 - (y2 - y1)
y4 = y1 + (x2 - x1)

print(x3, y3, x4, y4)
<|endoftext|>
