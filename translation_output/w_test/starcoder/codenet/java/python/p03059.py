<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 7

Expected output:
10


```
import java.util.*;


public class p03059 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int amount = 0;
      	int time = a;  
      
        for(int i = 2; time <= c + 0.5; i++){
            amount += b;
          	time = a * i;
        }
        
        System.out.println(amount);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

a, b, c = map(int, sys.stdin.readline().split())

amount = 0
time = a

for i in range(2, int(c + 0.5)):
    amount += b
    time = a * i

print(amount)
```
<|endoftext|>
