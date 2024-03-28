<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```
import math

def debt_hell(total, weeks):
    sum = total
    for i in range(weeks):
        yield = sum * 0.05
        if yield % 1000 == 0:
            sum += yield
        else:
            sum += math.ceil(yield / 1000) * 1000
    return sum

print(debt_hell(100000, 10))
```
This code is similar to the Java code, but it uses Python's built-in `math.ceil()` function to round up the yield to the nearest thousand. It also uses the `range()` function to iterate over the weeks instead of using a `for` loop with a counter variable.</s>
