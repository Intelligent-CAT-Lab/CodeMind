<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15 25

Expected output:
66.94277711156654

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

def main():
    sc = input("Enter two numbers separated by a space: ")
    numbers = sc.split()
    result = (float(numbers[0]) * float(numbers[1])) / 3.305785
    print(result)

if __name__ == "__main__":
    main()
```
This code uses the `input()` function to get the user input, and then splits the input into two numbers using the `split()` method. It then calculates the result by multiplying the two numbers and dividing the result by 3.305785. Finally, it prints the result using the `print()` function.

Note that the `input()` function returns a string, so we need to convert it to a float using the `float()` function before we can perform arithmetic operations on it.</s>
