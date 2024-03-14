<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
from numpy import*
n,M=map(int,input().split())
l=n*3+1
d=zeros((l,n*5),int64)
d[0][0]=1
for i in range(1,l):j,k=i-1,i-2;d[i]=((d[i-3]*k+roll(d[k],-1))*j+roll(d[j],1))%M
print(sum(d[-1][:l])%M)
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int M = scanner.nextInt();
        int l = n * 3 + 1;
        long[][] d = new long[l][n * 5];
        d[0][0] = 1;
        for (int i = 1; i < l; i++) {
            int j = i - 1, k = i - 2;
            d[i] = ((d[i-3][k] + roll(d[k], -1)) * j + roll(d[j], 1)) % M;
        }
        long sum = 0;
        for (int i = 0; i < l; i++) {
            sum += d[i][i];
        }
        System.out.println(sum % M);
    }

    public static long[] roll(long[] arr, int shift) {
        long[] result = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[(i + shift + arr.length) % arr.length] = arr[i];
        }
        return result;
    }
}
```

Please note that Java does not have built-in support for rolling arrays like Python's numpy.roll function, so I've implemented a simple version of it in the `roll` method.

Also, Java does not have a built-in equivalent to Python's numpy.zeros, so I've used a regular Java array to initialize `d`.

Finally, Java does not have a built-in equivalent to Python's numpy.sum, so I've used a for loop to calculate the sum.
<|EOT|>
