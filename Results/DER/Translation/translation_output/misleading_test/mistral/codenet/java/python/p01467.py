<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

def ni(input):
    a = [int(x) for x in input.split()]
    return a

def p01467():
    sc = sys.stdin
    a = ni(sc)
    b = ni(sc)
    k = int(sc.readline())
    max = 0
    for i in range(1 << 10):
        if (i & k) > 0:
            continue
        borrow = [0] * 11
        c = [0] * 10
        for j in range(10):
            if a[j] - borrow[j] >= b[j]:
                c[j] = a[j] - borrow[j] - b[j]
                borrow[j + 1] = 0
            else:
                c[j] = a[j] - borrow[j] + 10 - b[j]
                borrow[j + 1] = (i & (1 << j)) > 0 ? 0 : 1
        ans = 0
        for j in range(9, -1, -1):
            ans *= 10
            ans += c[j]
        max = max(max, ans)
    print(max)

if __name__ == "__main__":
    p01467()
```</s>
