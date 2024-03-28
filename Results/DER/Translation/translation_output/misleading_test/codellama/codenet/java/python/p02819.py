<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
20

Expected output:
29

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
[/INST]
```python
import math

def prime(x):
    if x <= 1:
        return False
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True

def main():
    x = int(input("Enter a number: "))
    while not prime(x):
        x += 1
    print(x)

if __name__ == "__main__":
    main()
```
This code uses the same logic as the Java code, but with some differences in syntax and structure. The `prime` function is defined as a separate function, and it uses the `math.sqrt` function to calculate the square root of the input number. The `main` function is also defined as a separate function, and it uses the `input` function to get the input from the user. The `while` loop is used to iterate over the input number until a prime number is found. Finally, the `print` function is used to print the result.</s>
