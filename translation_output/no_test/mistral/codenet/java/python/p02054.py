<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
		}
		System.out.println(odd >= 2 ? "Hom" : "Tem");
	}
}


```
[/INST]
```python
import sys

def main():
    odd = 0
    for i in range(3):
        odd += int(input()) % 2
    print("Hom" if odd >= 2 else "Tem")

if __name__ == "__main__":
    main()
```</s>
