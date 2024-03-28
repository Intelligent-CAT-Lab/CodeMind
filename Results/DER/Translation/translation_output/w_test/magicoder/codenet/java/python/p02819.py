<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20

Expected output:
23


```
import java.util.Scanner;

	public class p02819 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int x = sc.nextInt();
			
			while(!prime(x)) {
				x++;
			}
			System.out.println(x);
			
			
		}
		
		static boolean prime(int x) {
			for(int i=2;i<x;i++) {
				if(x%i==0) {
					return false;
				}
			}
			return true;
		}
		
	}
```

@@ Response
```python
def prime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True

x = int(input())

while not prime(x):
    x += 1

print(x)
```

This Python code does the same thing as the Java code. It checks if a number is prime by dividing it by all numbers less than itself. If the number is divisible by any of these numbers, it is not prime. If it is not divisible by any of these numbers, it is prime. The code then asks for user input, checks if the number is prime, and if it is not, increments the number until it is prime. The prime number is then printed.<｜end▁of▁sentence｜>
