<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 10

Expected output:
Hom


```
import java.util.Scanner;

public class p02054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
		}
		System.out.println(odd >= 2? "Hom" : "Tem");
	}
}


```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    odd = 0
    for i in range(3):
        odd += int(sys.stdin.readline()) % 2
    print("Hom" if odd >= 2 else "Tem")

if __name__ == "__main__":
    main()

```
<|endoftext|>
