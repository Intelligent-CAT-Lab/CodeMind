<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15 25

Expected output:
113.437508


```
import java.util.*;

public class p00094 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) System.out.println((sc.nextDouble()*sc.nextDouble())/3.305785);
	}	
}
```
[/INST]
```
import math

while True:
    try:
        a, b = map(float, input().split())
        print(math.sqrt(a * b) / 3.305785)
    except:
        break
```
This code uses the `math` module to perform the square root operation and the division by 3.305785. It also uses the `input()` function to read the input from the user, and the `split()` method to split the input into two numbers. The `map()` function is used to convert the input strings to floating-point numbers. The `try-except` block is used to handle the case where the user enters an invalid input.</s>
