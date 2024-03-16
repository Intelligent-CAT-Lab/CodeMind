<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```
import math

def main():
    while True:
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
Note: The `map` function is used to convert the input strings to integers. The `math.abs` function is used to get the absolute value of `H`.</s>
