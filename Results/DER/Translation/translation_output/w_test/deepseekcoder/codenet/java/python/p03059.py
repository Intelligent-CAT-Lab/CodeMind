<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import sys

def calculate_amount(a, b, c):
    amount = 0
    time = a
    i = 2
    while time <= c + 0.5:
        amount += b
        time = a * i
        i += 1
    return amount

if __name__ == "__main__":
    a, b, c = map(int, sys.stdin.readline().split())
    print(calculate_amount(a, b, c))
```

In this Python code, we define a function `calculate_amount` that takes three arguments `a`, `b`, and `c`. This function calculates the amount of money earned by the person who earns `a` dollars every `a` minutes and earns an additional `b` dollars every subsequent `a` minutes. The total earnings are capped at `c` dollars. The function returns the total amount of money earned.

In the main part of the code, we read the input from the standard input, convert it to integers, and pass these integers to the `calculate_amount` function. The result is printed to the standard output.
<|EOT|>
