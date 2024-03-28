<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def ni(sc):
    a = list(map(int, list(sc.readline().strip())))
    return a[::-1]

def main():
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
                borrow[j+1] = 1 if ((i >> j) & 1) == 0 else 0
        ans = 0
        for j in range(9, -1, -1):
            ans = ans * 10 + c[j]
        max_val = max(max_val, ans)
    print(max_val)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two numbers and a number `k` from the standard input, and then it calculates the maximum possible number that can be obtained by borrowing from the first number and subtracting the second number. The borrowing is done according to the binary representation of `i`, where `i` is a number between `0` and `1023` (`2^10 - 1`). If the `j`-th bit of `i` is `1`, then the borrowing is done from the next digit. If the `j`-th bit of `i` is `0`, then the borrowing is not done from the next digit. The maximum possible number is then printed to the standard output.<｜end▁of▁sentence｜>
