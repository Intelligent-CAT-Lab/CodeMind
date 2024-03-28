Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
-71

```
from math import *
n = int(input())

def ij(x):
    for i in range(x, 0, -1):
        if n/i == n//i:
            return i, n//i

print(sum(ij(int(sqrt(n)))) - 2)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[] ij = getIJ(n);
        System.out.println(ij[0] + ij[1] - 2);
    }

    public static int[] getIJ(int n) {
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                int j = n / i;
                if (j == i) {
                    return new int[]{i, j};
                }
            }
            i++;
        }
        return new int[]{0, 0};
    }
}
```

Explanation:

In Java, we can use the `Scanner` class to read input from the user. We can then use the `nextInt()` method to read an integer from the user.

We can define a function `getIJ(int n)` that takes an integer `n` as input and returns an array containing the values of `i` and `j` such that `n = i * j`. We can use a `while` loop to iterate over all values of `i` from 1 to `n`. For each value of `i`, we can check if `n` is divisible by `i` using the modulo operator `%`. If it is, we can calculate the value of `j` as `n / i`. If `j` is equal to `i`, we have found the values of `i` and `j` that satisfy the equation `n = i * j`, and we can return them as an array.

Finally, we can call the `getIJ(int n)` function with the input value `n` and print the sum of `i` and `j` minus 2.<|endoftext|>
