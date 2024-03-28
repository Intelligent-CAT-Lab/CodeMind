<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
    x = int(input())
    while not prime(x):
        x += 1
    print(x)

if __name__ == "__main__":
    main()
```
This is the Python code that translates the given Java code. The `prime` function is the same as the `prime` function in the Java code, and the `main` function is also the same. The only difference is that in Python, we use `input()` to read the input from the user, and `print()` to print the output.

Also, in Python, we don't need to create a `Scanner` object to read the input, we can simply use `input()` to read the input from the user.

The `main` function in Python is the entry point of the program, and it is executed when the program is run. In this case, the `main` function reads the input from the user, calls the `prime` function to check if the input is a prime number, and if it is not, it increments the input and calls the `prime` function again until it finds a prime number. Finally, it prints the prime number.

The `prime` function in Python is the same as the `prime` function in the Java code, it checks if the input is a prime number by checking if it is divisible by any number between 2 and the square root of the input. If it is not divisible by any number, it returns `True`, otherwise it returns `False`.

Note that in Python, we don't need to create a `Scanner` object to read the input, we can simply use `input()` to read the input from the user. Also, in Python, we don't need to create a `System.out.println()` statement to print the output, we can simply use `print()` to print the output.</s>
