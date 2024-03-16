<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```

import java.util.Scanner;

public class p03643 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();

			System.out.println("ABC" + a);
		}
	}
}

```
[/INST]
```python
import sys

def main():
    a = int(input())
    print("ABC" + str(a))

if __name__ == "__main__":
    main()
```</s>
