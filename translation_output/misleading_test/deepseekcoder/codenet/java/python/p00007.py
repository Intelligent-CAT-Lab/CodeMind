<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
130089

```
import java.util.*;

public class p00007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weeks = sc.nextInt();
        debtHell(100000, weeks);
    }
    
    public static void debtHell(int total, int weeks){
        int sum = total;
        for(int i = 0; i < weeks; i++){
            double yield = sum * 0.05;
            if(yield % 1000 == 0){
                sum += yield;
            }else{
                sum += (int)(yield /1000 + 1) *1000;
            }
        }
        System.out.println(sum);
    }
}

```

### Response:
```python
def debt_hell(total, weeks):
    sum = total
    for i in range(weeks):
        yield = sum * 0.05
        if yield % 1000 == 0:
            sum += yield
        else:
            sum += int(yield / 1000 + 1) * 1000
    print(int(sum))

weeks = int(input())
debt_hell(100000, weeks)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, which represents the number of weeks, and then calls the `debt_hell` function with the total debt of 100000 and the number of weeks as arguments. The `debt_hell` function calculates the total debt after a certain number of weeks, taking into account the interest rate of 5%. The result is printed to the standard output.
<|EOT|>
