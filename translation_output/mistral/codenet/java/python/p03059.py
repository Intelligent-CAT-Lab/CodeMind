<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

a = int(input())
b = int(input())
c = int(input())
amount = 0
time = a

for i in range(2, int(time + 0.5) + 1):
    amount += b
    time = a * i

print(amount)
```</s>
