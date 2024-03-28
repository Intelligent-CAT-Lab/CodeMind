<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
0 0


```
import java.util.*;

public class p02111 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minute = 12 * 60 * n / 360;
        System.out.println((minute / 60) + " " + (minute % 60));
    }
}

```
[/INST]
```
import math

def main():
    n = int(input())
    minute = 12 * 60 * n / 360
    print(math.floor(minute / 60), minute % 60)

if __name__ == '__main__':
    main()
```
This code uses the `math.floor()` function to round down the result of the division to the nearest integer, and then prints the result along with the remainder.

Note that the `math.floor()` function is used instead of the `//` operator to ensure that the result is always an integer.</s>
