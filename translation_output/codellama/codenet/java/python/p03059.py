<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import math

a = int(input("Enter the value of a: "))
b = int(input("Enter the value of b: "))
c = int(input("Enter the value of c: "))

amount = 0
time = a

for i in range(2, math.ceil(c + 0.5)):
    amount += b
    time = a * i

print(amount)
```
This code first prompts the user to enter the values of `a`, `b`, and `c`. It then initializes the `amount` variable to 0 and the `time` variable to `a`.

The code then uses a `for` loop to iterate from 2 to `math.ceil(c + 0.5)` (the ceiling of `c + 0.5`). For each iteration, it adds `b` to the `amount` variable and multiplies `a` by the current iteration number (i.e., `i`) to get the new value of `time`.

Finally, the code prints the value of `amount`.</s>
