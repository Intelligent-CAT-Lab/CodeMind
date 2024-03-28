Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 4 0 4 1

Expected output:
0


```
import java.util.Scanner;

public class p00291 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[]=new int[6];
		int b=0;
		for(int i=0;i<6;i++){
			a[i]=stdIn.nextInt();
		}
		b=a[0]+a[1]*5+a[2]*10+a[3]*50+a[4]*100+a[5]*500;
		if(1000<=b)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
```

### Response:
```python
import java.util.Scanner;

public class p00291 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[]=new int[6];
		int b=0;
		for(int i=0;i<6;i++){
			a[i]=stdIn.nextInt();
		}
		b=a[0]+a[1]*5+a[2]*10+a[3]*50+a[4]*100+a[5]*500;
		if(1000<=b)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
```

The given java code is a program that takes input from the user and calculates the total amount of money earned by the user. The program then checks if the total amount is greater than or equal to 1000. If it is, the program prints "1", otherwise it prints "0".

In python, we can achieve the same functionality using the same logic. Here's the solution:

```python
import java.util.Scanner;

def main():
    stdIn = Scanner(System.in)
    a = [0] * 6
    for i in range(6):
        a[i] = stdIn.nextInt()
    b = a[0] + a[1] * 5 + a[2] * 10 + a[3] * 50 + a[4] * 100 + a[5] * 500
    if b >= 1000:
        print("1")
    else:
        print("0")

if __name__ == '__main__':
    main()
```

In this solution, we first import the `Scanner` class from the `java.util` package. We then define a function called `main` that takes no arguments. Inside the function, we create an array called `a` with 6 elements initialized to 0. We then use a `for` loop to read 6 integers from the user using the `nextInt` method of the `Scanner` class and store them in the `a` array.

Next, we calculate the total amount of money earned by the user by multiplying each element of the `a` array by its corresponding value and adding them up. We store this value in a variable called `b`.

Finally, we use an `if` statement to check if `b` is greater than or equal to 1000. If it is, we print "1", otherwise we print "0".

We then call the `main` function from the `if` block to execute the program.<|endoftext|>
