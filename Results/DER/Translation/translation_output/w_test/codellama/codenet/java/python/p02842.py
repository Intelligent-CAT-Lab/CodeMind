<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
432

Expected output:
400


```
import java.util.Scanner;

public class p02842 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i=0;i<=N;i++) {
			if ((int)(i*1.08)==N) {
				System.out.println(i);
				return ;
			}
		}
		System.out.println(":(");
	}
}

```
[/INST]
```
import math

def main():
    N = int(input())
    for i in range(N):
        if math.ceil(i * 1.08) == N:
            print(i)
            return
    print(":(")

if __name__ == "__main__":
    main()
```
Note: The `math.ceil()` function is used to round up the result of the multiplication to the nearest integer.</s>
