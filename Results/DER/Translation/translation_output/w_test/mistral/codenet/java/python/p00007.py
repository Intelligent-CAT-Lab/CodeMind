<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
# Sample test case
weeks = 5

# Expected output
expected_output = 130000

# Actual output
actual_output = debt_hell(100000, weeks)

# Check if the actual output is equal to the expected output
if actual_output == expected_output:
    print("Test passed!")
else:
    print("Test failed!")


def debt_hell(total, weeks):
    sum = total
    for i in range(weeks):
        yield = sum * 0.05
        if yield % 1000 == 0:
            sum += yield
        else:
            sum += (int(yield / 1000 + 1) * 1000)
    return sum
```</s>
