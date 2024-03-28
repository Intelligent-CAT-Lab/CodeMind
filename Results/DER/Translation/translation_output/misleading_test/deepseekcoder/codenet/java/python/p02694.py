<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
103

Expected output:
-45

```
import java.util.Scanner;

class p02694 {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long x=stdIn.nextLong();
        int count=0;

        long a=100;
        while(true){
            if(a>=x){
                break;
            }
            a=a+a/100;
            count++;
        }
        System.out.println(count);
        
    }

}
```

### Response:
```python
def p02694(x):
    count = 0
    a = 100
    while True:
        if a >= x:
            break
        a = a + a//100
        count += 1
    return count

x = int(input())
print(p02694(x))
```

In this Python code, we define a function `p02694` that takes an integer `x` as input. The function calculates the number of times `a` can be incremented by `a/100` before it becomes greater than or equal to `x`. The function returns this count. The input `x` is read from the standard input, and the result is printed to the standard output.
<|EOT|>
