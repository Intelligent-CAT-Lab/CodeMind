<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02639 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] x = new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            x[i] = sc.nextInt();
            sum += x[i];
        }
        System.out.println(15-sum);
    }

}

```
[/INST]
```python
import sys

x = [int(input()) for i in range(5)]
sum = 0
for i in range(5):
    sum += x[i]
print(15 - sum)
```</s>
