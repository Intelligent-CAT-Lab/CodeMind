<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 0 15 0 30

Expected output:
270


```
import java.util.Scanner;

public class p02663 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = nextInt(scanner);
        int m1 = nextInt(scanner);
        int h2 = nextInt(scanner);
        int m2 = nextInt(scanner);
        int k = nextInt(scanner);
        int h = h2 - h1;
        int m = m2 - m1;
        int day = (h * 60) + m;
        System.out.println(day - k);

    }

    public static int nextInt(Scanner scanner) {
        return Integer.parseInt(scanner.next());
    }
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

h1, m1, h2, m2, k = map(int, sys.stdin.readline().split())

h = h2 - h1
m = m2 - m1

day = (h * 60) + m

print(day - k)

```
<|endoftext|>
