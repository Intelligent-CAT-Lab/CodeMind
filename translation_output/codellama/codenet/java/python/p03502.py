<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p03502 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	int N = sc.nextInt();

	int X = N;

	int fx = 0;


	while(N>=10) {

		fx += N%10;

		N /= 10;

	}

	fx += N;

	if(X%fx == 0) System.out.println("Yes");

	else System.out.println("No");
}

}

Translate the above java code to python.

python code:

[/INST]
```
import math

def is_divisible(n):
    x = n
    fx = 0
    while n >= 10:
        fx += n % 10
        n //= 10
    fx += n
    return x % fx == 0

n = int(input("Enter a number: "))
if is_divisible(n):
    print("Yes")
else:
    print("No")
```
This code first defines a function `is_divisible` that takes an integer `n` as input and returns `True` if `n` is divisible by the sum of its digits, and `False` otherwise.

The function works by first assigning `n` to a variable `x` and initializing `fx` to 0. It then enters a loop that continues as long as `n` is greater than or equal to 10. Inside the loop, `fx` is incremented by the remainder of `n` divided by 10, and `n` is divided by 10.

After the loop, `fx` is incremented by `n`, and the function returns `True` if `x` is divisible by `fx`, and `False` otherwise.

The main part of the code prompts the user to enter a number, converts the input to an integer using the `int` function, and then calls the `is_divisible` function with the input number as an argument. If the function returns `True`, the code prints "Yes", and if it returns `False`, the code prints "No".</s>
