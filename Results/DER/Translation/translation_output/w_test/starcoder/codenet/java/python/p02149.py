<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 900 850

Expected output:
A


```
import java.util.*;

public class p02149 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        idx = i;
		    }
		}
		System.out.println((char)('A' + idx));
	}
}


```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    a = [int(x) for x in sys.stdin.readline().split()]
    print(chr(ord('A') + a.index(max(a))))

if __name__ == '__main__':
    main()

```
<|endoftext|>
