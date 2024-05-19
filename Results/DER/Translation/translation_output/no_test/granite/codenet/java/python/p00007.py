System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import math

def debt_hell(total, weeks):
    sum = total
    for i in range(weeks):
        yield_ = sum * 0.05
        if yield_ % 1000 == 0:
            sum += yield_
        else:
            sum += math.ceil(yield_ / 1000) * 1000
    return sum

total = 100000
weeks = int(input("Enter the number of weeks: "))
result = debt_hell(total, weeks)
print(result)
```<|endoftext|>
