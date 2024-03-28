Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 4

Expected output:
5


```

import java.util.Scanner;

class p00356 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int p = 0;
        int a;
        int b;
        int z;
        int m;
        a = x;
        b = y;
        while (x % y!= 0) {
            z = x;
            x = y;
            y = z % y;
        }
        m = a + b - y;

        if (a % 2 == 0 || b % 2 == 0 || a == b || a % 2 > 0 && b % 2 > 0) {
            System.out.println(m + 1);
        } else {
            System.out.println(m);
        }

    }
}


```

### Response:

```python
import java.util.Scanner;

class p00356:

    def main(self):
        scan = Scanner(System.in)
        x = scan.nextInt()
        y = scan.nextInt()
        p = 0
        a = x
        b = y
        while x % y!= 0:
            z = x
            x = y
            y = z % y
        m = a + b - y

        if a % 2 == 0 or b % 2 == 0 or a == b or (a % 2 > 0 and b % 2 > 0):
            print(m + 1)
        else:
            print(m)

p00356().main()
```<|endoftext|>
