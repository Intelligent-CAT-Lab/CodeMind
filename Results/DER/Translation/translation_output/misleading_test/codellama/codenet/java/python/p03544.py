<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
-20

```
import java.util.*;
public class p03544{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] num = new long[100];

        for(int i =0;i<100;i++){
            if(i==0){
                num[i]=2;
            }else if(i==1){
                num[i]=1;
            }else{
            num[i] = num[i-1]+num[i-2];
        }
    }

        System.out.println(num[n]);
        

    }
}


```
[/INST]
```python
import sys

n = int(sys.stdin.readline())
num = [0] * 100

num[0] = 2
num[1] = 1

for i in range(2, 100):
    num[i] = num[i-1] + num[i-2]

print(num[n])
```

Explanation:

The code first reads an integer `n` from the standard input using `sys.stdin.readline()`. It then initializes an array `num` of size 100 with all elements set to 0.

The code then sets the first two elements of the array to 2 and 1, respectively. This is because the first two elements of the Fibonacci sequence are 2 and 1.

The code then enters a loop that iterates from 2 to 99. For each iteration, the code calculates the next element of the Fibonacci sequence using the formula `num[i] = num[i-1] + num[i-2]`. This formula is based on the fact that the Fibonacci sequence is defined recursively as `F(n) = F(n-1) + F(n-2)`.

Finally, the code prints the `n`th element of the Fibonacci sequence, which is stored in the `num[n]` element of the array.

Note that the code uses the `range` function to iterate from 2 to 99, which is more efficient than using a `for` loop with a manual counter.</s>
