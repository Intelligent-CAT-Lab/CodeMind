<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def debtHell(total, weeks):
    sum = total
    for i in range(weeks):
        yield = sum * 0.05
        if yield % 1000 == 0:
            sum += yield
        else:
            sum += (int)(yield /1000 + 1) *1000
    print(sum)

if __name__ == "__main__":
    total = int(input())
    weeks = int(input())
    debtHell(total, weeks)
```</s>
