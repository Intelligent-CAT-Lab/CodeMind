Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import java.util.*;

public class p00094 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) System.out.println((sc.nextDouble()*sc.nextDouble())/3.305785);
	}	
}
```

The given java code is a simple program that reads two double values from the user and calculates their average. The average is then printed to the console. The program uses the Scanner class to read input from the user.

In Python, we can achieve the same functionality using the input() function to read input from the user and the print() function to print output to the console. Here's the equivalent Python code:

```python
while True:
    try:
        a = float(input("Enter first number: "))
        b = float(input("Enter second number: "))
        break
    except ValueError:
        print("Invalid input. Please enter a valid number.")

average = (a + b) / 2
print("The average is:", average)
```

In this code, we use a while loop to keep asking the user for input until they enter valid numbers. We use a try-except block to catch any ValueError that may occur if the user enters a non-numeric value.

Once we have valid input, we calculate the average and print it to the console.<|endoftext|>
