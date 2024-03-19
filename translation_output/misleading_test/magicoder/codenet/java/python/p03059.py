<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
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

@@ Response
```python
# Python code

# Read input
a, b, c = map(int, input().split())

amount = 0
time = a

for i in range(2, c + 1):
    amount += b
    time = a * i

print(amount)
```

This Python code does the same thing as the Java code. It reads three integers from the input, calculates the amount of money earned, and prints the result. The range of the for loop in Python is inclusive of the start and end values, so we use c + 1 instead of c + 0.5.<｜end▁of▁sentence｜>
