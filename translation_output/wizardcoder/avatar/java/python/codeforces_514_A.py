Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class codeforces_514_A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Long> list = new ArrayList<>();
        long x = sc.nextLong();

        while (x > 0) {
            long r = x % 10;
            if (9 - r < r) {
                if (x / 10 == 0 && 9 - r == 0)
                    list.add(r);
                else
                    list.add(9 - r);
            } else {
                list.add(r);
            }
            x = x / 10;
        }

        int pow = 0;
        long newNumber = 0;

        for (int i = 0; i < list.size(); i++) {
            newNumber = newNumber + list.get(i) * (long) Math.pow(10, pow);
            pow++;
        }

        System.out.println(newNumber);
    }
}
```

### Response:
```python
import java.util.ArrayList
import java.util.List
import java.util.Scanner

def main():
    sc = Scanner(System.in)
    list = ArrayList()
    x = sc.nextLong()

    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x / 10 == 0 and 9 - r == 0:
                list.add(r)
            else:
                list.add(9 - r)
        else:
            list.add(r)
        x = x // 10

    pow = 0
    newNumber = 0

    for i in range(list.size()):
        newNumber = newNumber + list.get(i) * (10 ** pow)
        pow += 1

    System.out.println(newNumber)

if __name__ == '__main__':
    main()
```

Note: The `//` operator is used instead of `/` for integer division in Python 3.<|endoftext|>
