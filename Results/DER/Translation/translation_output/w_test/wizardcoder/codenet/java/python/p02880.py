Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
Yes


```
import java.util.Scanner;

public class p02880 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		boolean f = false;
		for(int A = 1 ; A <= 9 ; ++A){
			if(N % A == 0 && N / A < 10){
				f = true;
			}
		}
		String ret = f? "Yes" : "No";
		System.out.println(ret);
	}
}

```

### Response:
```python
import java.util.Scanner;

public class p02880 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		boolean f = false;
		for(int A = 1 ; A <= 9 ; ++A){
			if(N % A == 0 and N / A < 10){
				f = true;
			}
		}
		String ret = f? "Yes" : "No";
		System.out.println(ret);
	}
}
```

The given java code is a simple program that takes an integer input from the user and checks if it is divisible by any number from 1 to 9. If it is divisible by any number from 1 to 9 and the quotient is less than 10, then it prints "Yes". Otherwise, it prints "No".

In python, we can achieve the same functionality using a for loop and the modulo operator. We can also use the ternary operator to simplify the code. Here's the equivalent python code:

```python
import java.util.Scanner;

def is_divisible(N):
    for A in range(1, 10):
        if N % A == 0 and N // A < 10:
            return True
    return False

def main():
    sc = Scanner(System.in)
    N = sc.nextInt()
    ret = "Yes" if is_divisible(N) else "No"
    print(ret)

if __name__ == '__main__':
    main()
```

In this code, we define a function `is_divisible` that takes an integer `N` as input and returns `True` if `N` is divisible by any number from 1 to 9 and the quotient is less than 10, and `False` otherwise. We use the `//` operator to perform integer division.

In the `main` function, we create a `Scanner` object to read input from the user, read an integer `N`, and call the `is_divisible` function to check if `N` is divisible by any number from 1 to 9 and the quotient is less than 10. We use the ternary operator to assign the value "Yes" to `ret` if `is_divisible` returns `True`, and "No" otherwise. Finally, we print `ret`.<|endoftext|>
