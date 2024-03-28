Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3 3

Expected output:
9


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
import java.util.Arrays;
import java.util.Scanner;

class p04005:
    def main(self):
        sc = Scanner(System.in)
        A = sc.nextLong()
        B = sc.nextLong()
        C = sc.nextLong()

        array = [A, B, C]
        Arrays.sort(array)

        if A % 2 == 0 or B % 2 == 0 or C % 2 == 0:
            print(0)
        else:
            print(array[0] * array[1])

p04005().main()
```<|endoftext|>
