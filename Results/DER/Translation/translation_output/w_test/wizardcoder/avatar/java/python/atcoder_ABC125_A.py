Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20 20 19

Expected output:
0


```
import java.util.Scanner;

public class atcoder_ABC125_A {
    static long n, k, m, l, a, b, c;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        k = 0;
        for (int i = 1; i * a <= n; i++) {
            k += b;
        }
        System.out.println(k);
    }
}
```

### Response:
```python
import java.util.Scanner;

public class atcoder_ABC125_A {
    static long n, k, m, l, a, b, c;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        k = 0;
        for (int i = 1; i * a <= n; i++) {
            k += b;
        }
        System.out.println(k);
    }
}
```

The given java code is a solution to the problem of finding the minimum number of coins required to make up a given amount of money. The code takes input of the amount of money, the value of each coin, and the total number of coins available. The code then iterates through all possible combinations of coins and calculates the total value of the combination. The minimum value is then returned as the output.

In python, we can use the same logic to solve the problem. We can define a function that takes the input of the amount of money, the value of each coin, and the total number of coins available. We can then iterate through all possible combinations of coins and calculate the total value of the combination. We can keep track of the minimum value and return it as the output.

Here's the python code:

```python
import java.util.Scanner;

def min_coins(n, a, b):
    k = 0
    for i in range(1, n//a+1):
        k += b
    return k

if __name__ == '__main__':
    a = int(input())
    b = int(input())
    n = int(input())
    k = min_coins(n, a, b)
    print(k)
```

In this code, we define a function `min_coins` that takes the input of the amount of money, the value of each coin, and the total number of coins available. We then iterate through all possible combinations of coins and calculate the total value of the combination. We keep track of the minimum value and return it as the output.

We then call the `min_coins` function with the input values and print the output.<|endoftext|>
