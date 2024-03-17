<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
130000


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

@@ Response
```python
def debt_hell(total, weeks):
    sum = total
    for i in range(weeks):
        yield = sum * 0.05
        if yield % 1000 == 0:
            sum += yield
        else:
            sum += int(yield / 1000 + 1) * 1000
    return sum

weeks = int(input())
print(debt_hell(100000, weeks))
```

This Python code does the same thing as the Java code. It reads the number of weeks from the user, then calls the `debt_hell` function with the total amount and the number of weeks. The `debt_hell` function calculates the yield for each week, adds it to the total, and then prints the total after all weeks have been processed.<｜end▁of▁sentence｜>
