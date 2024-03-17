<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 20 5

Expected output:
10


```

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

```

python code:<fim_suffix><fim_middle>

```python

import sys

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x % y)

def main():
    W, H, C = map(int, sys.stdin.readline().split())
    WH = gcd(W, H)
    a = (W/WH)*(H/WH)
    print(a*C)

if __name__ == "__main__":
    main()

```
<|endoftext|>
