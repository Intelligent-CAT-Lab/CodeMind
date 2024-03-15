
```
import math

class Tuple:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def print(self):
        print(self.x, self.y)

def koch(n, a, b):
    if n == 0:
        return

    s = Tuple((2.0 * a.x + 1.0 * b.x) / 3.0, (2.0 * a.y + 1.0 * b.y) / 3.0)
    t = Tuple((1.0 * a.x + 2.0 * b.x) / 3.0, (1.0 * a.y + 2.0 * b.y) / 3.0)
    u = Tuple((t.x - s.x) * math.cos(math.pi * 60.0 / 180.0) - (t.y - s.y) * math.sin(math.pi * 60.0 / 180.0) + s.x,
              (t.x - s.x) * math.sin(math.pi * 60.0 / 180.0) + (t.y - s.y) * math.cos(math.pi * 60.0 / 180.0) + s.y)

    koch(n - 1, a, s)
    s.print()
    koch(n - 1, s, u)
    u.print()
    koch(n - 1, u, t)
    t.print()
    koch(n - 1, t, b)

n = int(input())
a = Tuple(0.0, 0.0)
b = Tuple(100.0, 0.0)

a.print()
koch(n, a, b)
b.print()
```

## 02274

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p02274 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[] b = new int[q];
        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < q; i++) {
            int key = b[i];
            int left = 0;
            int right = n;
            int mid;
            while (left < right) {
                mid = (left + right) / 2;
                if (a[mid] == key) {
                    System.out.println(mid);
                    break;
                } else if (key < a[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if (left == right) {
                System.out.println(-1);
            }
        }
    }
}
```

python code:
```
n = int(input())
a = list(map(int, input().split()))

q = int(input())
b = list(map(int, input().split()))

for i in range(q):
    key = b[i]
    left = 0
    right = n
    while left < right:
        mid = (left + right) // 2
        if a[mid] == key:
            print(mid)
            break
        elif key < a[mid]:
            right = mid
        else:
            left = mid + 1
    if left == right:
        print(-1)
```
 1000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
