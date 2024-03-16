<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def main():
    sc = sys.stdin
    print((sc.readline().strip().split()[0] + sc.readline().strip().split()[1]) / 2)

if __name__ == "__main__":
    main()
```</s>
