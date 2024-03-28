<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3800


```
import java.util.Scanner;

public class p03551 {

	public static void main(String[] args) {
		p03551 m = new p03551();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		
		long base = n*100+m*1800;
		
		System.out.println(base << m);
		
	}
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    base = n*100+m*1800
    print(base << m)

if __name__ == '__main__':
    main()
```
<|endoftext|>
