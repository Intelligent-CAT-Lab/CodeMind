System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())
    numbers = [A, B, C]
    numbers.sort()

    if A % 2 == 0 or B % 2 == 0 or C % 2 == 0:
        print(0)
    else:
        print(numbers[0] * numbers[1])

if __name__ == "__main__":
    main()
```<|endoftext|>
