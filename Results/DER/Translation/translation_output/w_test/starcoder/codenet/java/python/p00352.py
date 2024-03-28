<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
2000


```
import java.io.IOException;
import java.util.Scanner;

class p00352 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() + sc.nextInt()) / 2);
	}
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    print((a + b) / 2)

if __name__ == '__main__':
    main()

```

'''
<|endoftext|>
