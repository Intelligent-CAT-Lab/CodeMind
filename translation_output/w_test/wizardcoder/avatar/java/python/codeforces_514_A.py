Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5728

Expected output:
4221


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
import math

def reverse_number(x):
    list = []
    while x > 0:
        r = x % 10
        if 9 - r < r:
            if x // 10 == 0 and 9 - r == 0:
                list.append(r)
            else:
                list.append(9 - r)
        else:
            list.append(r)
        x = x // 10
    return list

def reverse_and_add(list):
    new_number = 0
    pow = 0
    for i in list:
        new_number += i * math.pow(10, pow)
        pow += 1
    return new_number

x = int(input())
list = reverse_number(x)
new_number = reverse_and_add(list)
print(new_number)
```

Explanation:

- The `reverse_number` function takes an integer `x` as input and returns a list of digits of `x` in reverse order.
- The `reverse_and_add` function takes a list of digits as input and returns the integer formed by reversing the digits and adding them up.
- The main function takes an integer `x` as input, calls `reverse_number` to get a list of digits in reverse order, and then calls `reverse_and_add` to get the new number.
- The `math.pow` function is used to calculate the powers of 10.<|endoftext|>
