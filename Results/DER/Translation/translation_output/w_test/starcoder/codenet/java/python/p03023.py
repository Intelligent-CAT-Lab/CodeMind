<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
180


```
import java.util.Scanner;

public class p03023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int answer = 180 * (num - 2);

        System.out.println(answer);
    }
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

num = int(sys.stdin.readline())

print(180 * (num - 2))

```
<|endoftext|>
