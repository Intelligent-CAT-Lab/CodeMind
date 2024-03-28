<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5728

Expected output:
4304

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
def codeforces_514_A(x):
    list_ = []

    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                list_.append(r)
            else:
                list_.append(9 - r)
        else:
            list_.append(r)
        x = x // 10

    pow_ = 0
    new_number = 0

    for i in range(len(list_)):
        new_number = new_number + list_[i] * (10 ** pow_)
        pow_ += 1

    return new_number

# Test input
x = 5728
# Expected output
print(codeforces_514_A(x))
```
<|EOT|>
