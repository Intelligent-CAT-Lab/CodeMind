<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02608 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] eratosu = new int[100000];
		for(int i = 1 ; i <= 100 ; i++) {
			for(int j = 1 ; j <= 100 ; j++) {
				for(int k = 1 ; k <= 100 ; k++) {
                  if(i * i + j * j + k * k >= 100000)
                    continue;
					int result = i * i + j * j + k * k + i * j + j * k + k * i;
					eratosu[result]++;
				}
			}

		}
		String s = eratosu[1] + "";
		StringBuilder sb = new StringBuilder(s);

		for(int i = 2 ; i <= n ; i++) {
			sb.append("\n" + eratosu[i]);
		}

		sc.close();
		System.out.println(sb.toString());

	}
}


```

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline())
    eratosu = [0]*100000
    for i in range(1, 101):
        for j in range(1, 101):
            for k in range(1, 101):
                if i * i + j * j + k * k >= 100000:
                    continue
                result = i * i + j * j + k * k + i * j + j * k + k * i
                eratosu[result] += 1

    print("\n".join(map(str, eratosu[1:n+1])))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer `n` from the standard input, then it calculates the values of the array `eratosu` in the same way as in the Java code. Finally, it prints the values of `eratosu` from the first to the `n`th element, each on a new line.
<|EOT|>
