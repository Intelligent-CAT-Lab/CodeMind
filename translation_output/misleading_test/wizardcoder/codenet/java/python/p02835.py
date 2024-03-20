Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 9

Expected output:
vin

```
import java.util.Scanner;

public class p02835{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b+c >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");

		}
	}

}

```

### Response:
```python
import java.util.Scanner;

public class p02835{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a+b+c >= 22) {
			System.out.println("bust");
		}else {
			System.out.println("win");

		}
	}

}
```

The given java code is a simple program that takes three integers as input from the user and checks if their sum is greater than or equal to 22. If the sum is greater than or equal to 22, it prints "bust" else it prints "win". 

Here's the equivalent python code:

```python
import java.util.Scanner;

public class p02835{

	public static void main(String[] args) {
		Scanner sc = Scanner(input())
		a = int(sc.next())
		b = int(sc.next())
		c = int(sc.next())
		if(a+b+c >= 22):
			print("bust")
		else:
			print("win")

	}

}
```

In the above code, we have used the `Scanner` class to take input from the user. We have also used the `int()` function to convert the input strings to integers. 

We have used the `if-else` statement to check if the sum of the three integers is greater than or equal to 22. If it is, we print "bust" else we print "win".<|endoftext|>
