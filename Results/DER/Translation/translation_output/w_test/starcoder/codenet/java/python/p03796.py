<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
import java.util.*;
import java.lang.*;


public class p03796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        double power = 1;
        for (int i = 1; i <= cnt; i++) {
            power = (power*i)%(Math.pow(10, 9) + 7);
        }
        System.out.println((int)power);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    cnt = int(sys.stdin.readline())
    power = 1
    for i in range(1, cnt+1):
        power = (power*i)%(10**9 + 7)
    print(power)

if __name__ == "__main__":
    main()
```
<|endoftext|>
