<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p00252 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = stdIn.nextInt();
		}
		if(a[0] == 1 && a[1] == 1) {
			System.out.println("Open");
		}
		else if(a[2] == 1) {
			System.out.println("Open");
		}
		else {
			System.out.println("Close");
		}
		
	}

}
```

### Response:
```python
def p00252():
    a = [int(input()) for _ in range(3)]
    if a[0] == 1 and a[1] == 1:
        print("Open")
    elif a[2] == 1:
        print("Open")
    else:
        print("Close")

p00252()
```
This Python code does the same thing as the Java code. It reads three integers from the standard input, stores them in a list, and then checks if the first two are both 1, the third is 1, or neither are 1. If the first two are 1 or the third is 1, it prints "Open". Otherwise, it prints "Close".
<|EOT|>
