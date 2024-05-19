System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

a, b, c = map(int, sys.stdin.readline().split())
amount = 0
time = a

for i in range(2, c + 1):
    amount += b
    time = a * i
    if time > c + 0.5:
        break

print(amount)
```<|endoftext|>
