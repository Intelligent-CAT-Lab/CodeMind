<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Arrays;
import java.util.Scanner;
 
class p04005 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
 
		long[] array = new long[] { A, B, C };
		Arrays.sort(array);
 
		if (A % 2 == 0 || B % 2 == 0 || C % 2 == 0) {
			System.out.println(0);
		} else {
			System.out.println(array[0] * array[1]);
		}
	}
}
```

### Response:
```python
import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())

    arr = [A, B, C]
    arr.sort()

    if A % 2 == 0 or B % 2 == 0 or C % 2 == 0:
        print(0)
    else:
        print(arr[0] * arr[1])

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, sorts them in ascending order, and then prints the product of the two smallest odd numbers if all three are odd, or 0 if any of them is even.
<|EOT|>
