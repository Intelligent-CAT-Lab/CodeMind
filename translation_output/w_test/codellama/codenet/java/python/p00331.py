<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
-3 3

Expected output:
0


```
import java.util.Scanner;

public class p00331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int H = sc.nextInt();
            int R = sc.nextInt();

            if ( H < 0 && Math.abs(H) == R ) {
                System.out.println(0);
            } else if ( H + R > 0 ) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}


```
[/INST]
```
import math

def main():
    H, R = map(int, input().split())

    if H < 0 and math.abs(H) == R:
        print(0)
    elif H + R > 0:
        print(1)
    else:
        print(-1)

if __name__ == "__main__":
    main()
```
Note: The `map()` function is used to convert the input string to a list of integers. The `math.abs()` function is used to get the absolute value of `H`.</s>
