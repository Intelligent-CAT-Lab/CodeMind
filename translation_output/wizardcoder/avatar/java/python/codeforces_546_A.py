Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o, g, x = 0;
        long n, borrow = 0;

        o = sc.nextInt();
        n = sc.nextLong();
        g = sc.nextInt();

        for (int i = 1; i <= g; i++) {
            x = x + i * o;
        }

        borrow = x - n;

        if (borrow <= 0)
            System.out.println(0);
        else
            System.out.println(borrow);
    }
}
```

### Response:
```python
import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o, g, x = 0;
        long n, borrow = 0;

        o = sc.nextInt();
        n = sc.nextLong();
        g = sc.nextInt();

        for (int i = 1; i <= g; i++) {
            x = x + i * o;
        }

        borrow = x - n;

        if (borrow <= 0)
            System.out.println(0);
        else
            System.out.println(borrow);
    }
}
```<|endoftext|>
