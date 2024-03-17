<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 1

Expected output:
Open


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
def main():
    a = [int(i) for i in input().split()]
    if a[0] == 1 and a[1] == 1:
        print("Open")
    elif a[2] == 1:
        print("Open")
    else:
        print("Close")

if __name__ == "__main__":
    main()
```

In this Python code, we use the built-in `input().split()` function to read the input from the user. This function splits the input into a list of strings, and the `[int(i) for i in ...]` part converts these strings into integers.

Then, we use an if-elif-else statement to check the conditions in the Java code. If the first two elements of the list are both 1, we print "Open". If the third element of the list is 1, we also print "Open". If neither of these conditions are met, we print "Close".
<|EOT|>
