<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
2


```
import java.util.*;

public class p01998 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] arr = new boolean[n + 3];
		arr[0] = true;
		arr[1] = true;
		int count = 0;
		for (int i = 2; i < arr.length; i++) {
		    if (!arr[i]) {
		        for (int j = 2; j * i < arr.length; j++) {
		            arr[i * j]  = true;
		        }
		        if (!arr[i] &&!arr[i - 2]) {
		            count++;
		        }
		    }
		}
		System.out.println(count * 2);
	}
}


```

python code:<fim_suffix><fim_middle>

```python
import sys

def is_prime(n):
    if n == 1:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

def main():
    n = int(sys.stdin.readline())
    count = 0
    for i in range(2, n + 1):
        if not is_prime(i):
            for j in range(2, n + 1):
                if i * j > n:
                    break
                if not is_prime(i * j):
                    count += 1
                    break
    print(count * 2)

if __name__ == '__main__':
    main()

```
<|endoftext|>
