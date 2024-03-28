Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
5


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

        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                int j = n / i;
                if (j == i) {
                    i++;
                } else {
                    System.out.println(i + j);
                    break;
                }
            } else {
                i++;
            }
        }
    }
}
```

Explanation:

In Java, we can use a while loop to iterate through all the numbers from 1 to n and check if n is divisible by i. If it is, we can calculate the value of j by dividing n by i and check if j is equal to i. If it is, we increment i and continue the loop. If j is not equal to i, we print the sum of i and j and break out of the loop. If n is not divisible by i, we increment i and continue the loop.<|endoftext|>
