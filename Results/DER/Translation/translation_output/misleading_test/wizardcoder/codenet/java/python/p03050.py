Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
38

```
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class p03050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long ans = 0;
        for(int i = 1; i <= Math.sqrt(n); i++) {
           if(n % i == 0) {
               long m = n / i - 1;
               if(i < m) ans += m;
           }
        }

        System.out.println(ans);
        
        br.close();
    }
}
```

### Response:
```python
import math

def sum_of_divisors(n):
    sum = 0
    for i in range(1, int(math.sqrt(n))+1):
        if n % i == 0:
            if i == n/i:
                sum += i
            else:
                sum += i + n/i
    return sum

n = int(input())
print(sum_of_divisors(n))
```

Explanation:

We can use the same logic as in the given java code to find the sum of divisors of a number. We iterate from 1 to the square root of the number and check if the number is divisible by the current iteration variable. If it is, we add the current iteration variable and the quotient of the number divided by the current iteration variable. If the current iteration variable is equal to the quotient of the number divided by the current iteration variable, we add only the current iteration variable. Finally, we return the sum of divisors.

In the given java code, we read the input as a string and then convert it to a long. We then iterate from 1 to the square root of the number and check if the number is divisible by the current iteration variable. If it is, we calculate the quotient of the number divided by the current iteration variable and subtract 1 from it. We then check if the current iteration variable is less than the quotient. If it is, we add the quotient to the answer. Finally, we print the answer.<|endoftext|>
