Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4000 2000 500

Expected output:
5


```
import java.util.*;
import java.io.*;

import static java.lang.System.in;

public class p03505 {
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong(), A=sc.nextLong(), B=sc.nextLong();
        long ans = help(K,A,B);
        System.out.println(ans);
    }
    static long help(long K, long A, long B){
        if(A<=B) return A>=K?1:-1;
        if(A>=K) return 1;
        long dif = (A-B);
        long t = (K-A)/dif+((K-A)%dif==0?0:1);
        return 2*t+1;
    }
}

```

### Response:
```python
import sys

def help(K, A, B):
    if A <= B:
        if A >= K:
            return 1
        else:
            return -1
    else:
        dif = A - B
        t = (K - A) // dif + ((K - A) % dif == 0)
        return 2 * t + 1

if __name__ == '__main__':
    K, A, B = map(int, sys.stdin.readline().split())
    ans = help(K, A, B)
    print(ans)
```

Explanation:

- We first import the necessary modules.
- We define a function `help` that takes in three parameters `K`, `A`, and `B`.
- Inside the function, we first check if `A` is less than or equal to `B`. If it is, we check if `A` is greater than or equal to `K`. If it is, we return 1. Otherwise, we return -1.
- If `A` is greater than `B`, we calculate the difference `dif` between `A` and `B`. We then calculate the number of times `K` can be divided by `dif` and rounded up to the nearest integer. We add 1 if `K` is exactly divisible by `dif`. We then return `2*t+1`, where `t` is the number of times `K` can be divided by `dif` and rounded up to the nearest integer.
- In the `main` function, we first create a `Scanner` object to read input from the standard input stream.
- We then read in the three input values `K`, `A`, and `B` using the `nextLong` method of the `Scanner` object.
- We call the `help` function with the input values and store the result in the variable `ans`.
- Finally, we print the value of `ans` to the standard output stream using the `println` method of the `System.out` object.<|endoftext|>
