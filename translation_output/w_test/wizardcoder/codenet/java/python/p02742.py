Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5

Expected output:
10


```
import java.util.Scanner;

public class p02742 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
		long h = scan.nextLong();

		if(w == 1 || h == 1) {
			System.out.println(1);
			return;
		}
		long c = (w*h)%2 == 0? (w*h)/2 : (w*h)/2+1;
		System.out.println(c);
	}

}
```

### Response:
```python
import sys

w, h = map(int, sys.stdin.readline().split())

if w == 1 or h == 1:
    print(1)
else:
    c = (w*h)%2 == 0 and (w*h)//2 or (w*h)//2+1
    print(c)
```

Explanation:

- We first import the `sys` module to read input from the standard input.
- We read the input values of `w` and `h` using `map(int, sys.stdin.readline().split())`.
- We check if either `w` or `h` is equal to 1, in which case we print 1 as the answer.
- We calculate the value of `c` using the formula `(w*h)%2 == 0 and (w*h)//2 or (w*h)//2+1`.
- We print the value of `c` using `print(c)`.<|endoftext|>
