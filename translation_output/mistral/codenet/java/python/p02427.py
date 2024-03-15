<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < Math.pow(2, n); i++) {
			int temp = i;
			System.out.print(i + ":");
			for(int j = 0; temp > 0; j++) {
				if(temp % 2 == 1) System.out.print(" " + j);
				temp /= 2;
			}
			System.out.println();
		}
	}
}

```
[/INST]
```python
import sys

n = int(input())

for i in range(2**n):
    temp = i
    print(i, end=":")
    for j in range(temp):
        if temp % 2 == 1:
            print(j, end=" ")
        temp //= 2
    print()
```</s>
