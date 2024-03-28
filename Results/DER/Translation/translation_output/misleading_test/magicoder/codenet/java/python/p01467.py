<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
99 98 1

Expected output:
86

```
import java.util.Scanner;

public class p01467 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = ni(sc);
		int[] b = ni(sc);
		int k = sc.nextInt();
		long max = 0;
		for(int i=0;i<(1<<10);i++) {
			if (Integer.bitCount(i) > k) {
				continue;
			}
			int[] borrow = new int[11];
			int[] c = new int[10];
			for(int j=0;j<10;j++) {
				if (a[j] - borrow[j] >= b[j]) {
					c[j] = a[j] - borrow[j] - b[j];
					borrow[j+1] = 0;
				}else{
					c[j] = a[j] - borrow[j] + 10 - b[j];
					borrow[j+1] = (i&(1<<j)) > 0 ? 0 : 1;
				}
			}
			long ans = 0;
			for(int j=9;j>=0;j--) {
				ans *= 10;
				ans += c[j];
			}
			max = Math.max(max,ans);
		}
		System.out.println(max);
	}

	public static int[] ni(Scanner sc) {
		int[] a = new int[10];
		char[] c = sc.next().toCharArray();
		for(int i=0;i<c.length;i++) {
			a[i] = c[c.length-1-i] - '0';
		}
		return a;
	}

}
```

@@ Response
```python
def ni(sc):
    a = list(map(int, list(sc.readline().strip())))
    return a

def main():
    import sys
    sc = sys.stdin
    a = ni(sc)
    b = ni(sc)
    k = int(sc.readline())
    max_val = 0
    for i in range(1 << 10):
        if bin(i).count('1') > k:
            continue
        borrow = [0] * 11
        c = [0] * 10
        for j in range(10):
            if a[j] - borrow[j] >= b[j]:
                c[j] = a[j] - borrow[j] - b[j]
                borrow[j+1] = 0
            else:
                c[j] = a[j] - borrow[j] + 10 - b[j]
                borrow[j+1] = (i & (1 << j)) > 0 and 0 or 1
        ans = 0
        for j in range(9, -1, -1):
            ans = ans * 10 + c[j]
        max_val = max(max_val, ans)
    print(max_val)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two numbers and a number of digits to borrow, then calculates the maximum possible number that can be obtained by borrowing digits from the first number. The Python code uses the `bin` function to count the number of '1's in the binary representation of the integer `i`, which is equivalent to the Java code's `Integer.bitCount(i)`. The Python code also uses list comprehension and the `map` function to convert the input string to a list of integers. The Python code also uses the `max` function to find the maximum value.<｜end▁of▁sentence｜>
