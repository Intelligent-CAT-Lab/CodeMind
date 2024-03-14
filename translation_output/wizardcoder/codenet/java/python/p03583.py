Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p03583 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        // a
        for (int i = 1; i < 3510; i++) {
            // b
            for (int j = 1; j < 3510; j++) {
                long si = n * i * j;
                long bo = 4 * i * j - n * j - n * i;
                if (bo <= 0) {
                    continue;
                }
                if (si % bo == 0) {
                    System.out.println(i + " " + j + " " + (si / bo));
                    return;
                }
            }
        }
    }
}

```

### Response:
```python
import java.util.Scanner;

class p03583:
    def main(self):
        sc = Scanner(System.in)
        n = sc.nextLong()
        sc.close()
        # a
        for i in range(1, 3510):
            # b
            for j in range(1, 3510):
                si = n * i * j
                bo = 4 * i * j - n * j - n * i
                if bo <= 0:
                    continue
                if si % bo == 0:
                    print(i, j, si // bo)
                    return

p03583().main()
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We define a class `p03583` which contains a method `main` which is the entry point of the program.
- Inside the `main` method, we create an instance of the `Scanner` class and read the input `n` from the user.
- We then close the `Scanner` instance.
- We then use two nested `for` loops to iterate over all possible values of `i` and `j` from 1 to 3510.
- Inside the inner loop, we calculate the value of `si` and `bo` as described in the problem statement.
- We then check if `bo` is positive, if not, we skip to the next iteration of the inner loop.
- If `si` is divisible by `bo`, we print the values of `i`, `j` and `si/bo` and return from the `main` method.<|endoftext|>
