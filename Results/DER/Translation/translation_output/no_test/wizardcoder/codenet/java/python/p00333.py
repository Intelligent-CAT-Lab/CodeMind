Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import java.util.Scanner;

class p00333:

    @staticmethod
    def gcd(x, y):
        if y == 0:
            return x
        else:
            return p00333.gcd(y, x % y)

    @staticmethod
    def main(args):
        sc = Scanner(System.in)
        W = sc.nextInt()
        H = sc.nextInt()
        WH = p00333.gcd(W, H)
        C = sc.nextInt()

        a = (W/WH)*(H/WH)

        print(a*C)

if __name__ == '__main__':
    p00333.main(None)
```<|endoftext|>
