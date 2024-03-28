<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:


import java.util.Scanner;

class p00333 {

    static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int W = sc.nextInt();
        int H = sc.nextInt();
        int WH = gcd(W, H);
        int C = sc.nextInt();

        
        int a = (W/WH)*(H/WH);
        
        System.out.println(a*C);
    }
}


Translate the above java code to python.

python code:

[/INST]
```python
import math

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

def main():
    W, H, C = map(int, input().split())
    WH = gcd(W, H)
    a = (W // WH) * (H // WH)
    print(a * C)

if __name__ == "__main__":
    main()
```
Note: The `//` operator is used for integer division in Python, which is equivalent to the `floor()` function in Java.</s>
