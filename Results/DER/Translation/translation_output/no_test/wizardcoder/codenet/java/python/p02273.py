Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
import java.lang.Math;

class p02273 {

    public static class Tuple{
        public final double x;
        public final double y;
        public Tuple(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public void print(){
            System.out.printf("%f %f\n", x, y);
        }
    }

    static void koch(int n, Tuple a, Tuple b){
        if (n == 0) return;

        Tuple s, t, u;
        double cos60 = Math.cos(Math.PI * 60.0 / 180.0);
        double sin60 = Math.sin(Math.PI * 60.0 / 180.0);
        s = new Tuple((2.0 * a.x + 1.0 *b.x) / 3.0, (2.0 * a.y + 1.0 * b.y) / 3.0);
        t = new Tuple((1.0 * a.x + 2.0 *b.x) / 3.0, (1.0 * a.y + 2.0 * b.y) / 3.0);
        u = new Tuple((t.x - s.x) * cos60 - (t.y - s.y) * sin60 + s.x,
                      (t.x - s.x) * sin60 + (t.y - s.y) * cos60 + s.y);

        koch(n - 1, a, s);
        s.print();
        koch(n - 1, s, u);
        u.print();
        koch(n - 1, u, t);
        t.print();
        koch(n - 1, t, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Tuple a = new Tuple(0.0,0.0);
        Tuple b = new Tuple(100.0,0.0);

        a.print();
        koch(n,a,b);
        b.print();
    }
}


```

### Response:
```python
import math

class Tuple:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def print(self):
        print("{:.2f} {:.2f}".format(self.x, self.y))

def koch(n, a, b):
    if n == 0:
        return

    s = Tuple((2*a.x + 1*b.x) / 3, (2*a.y + 1*b.y) / 3)
    t = Tuple((1*a.x + 2*b.x) / 3, (1*a.y + 2*b.y) / 3)
    u = Tuple((t.x - s.x) * math.cos(math.pi * 60 / 180) - (t.y - s.y) * math.sin(math.pi * 60 / 180) + s.x,
              (t.x - s.x) * math.sin(math.pi * 60 / 180) + (t.y - s.y) * math.cos(math.pi * 60 / 180) + s.y)

    koch(n-1, a, s)
    s.print()
    koch(n-1, s, u)
    u.print()
    koch(n-1, u, t)
    t.print()
    koch(n-1, t, b)

if __name__ == '__main__':
    n = int(input())
    a = Tuple(0,0)
    b = Tuple(100,0)

    a.print()
    koch(n, a, b)
    b.print()
```<|endoftext|>
