System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 7

Expected output:
-17

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

def main():
    a, b, c = map(int, sys.stdin.readline().split())
    amount = 0
    time = a
    i = 2
    while time <= c + 0.5:
        amount += b
        time = a * i
        i += 1
    print(amount)

if __name__ == "__main__":
    main()
```

Test input:
```
3 5 7
```

Expected output:
```
-17
```<|endoftext|>
