<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def debtHell(total, weeks):
    sum = total
    for i in range(weeks):
        yield_ = sum * 0.05
        if yield_ % 1000 == 0:
            sum += yield_
        else:
            sum += (int)(yield_ /1000 + 1) *1000
    print(sum)

if __name__ == '__main__':
    total = int(sys.stdin.readline())
    weeks = int(sys.stdin.readline())
    debtHell(total, weeks)

```
<|endoftext|>
