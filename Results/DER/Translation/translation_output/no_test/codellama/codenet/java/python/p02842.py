<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```
import math

N = int(input("Enter a number: "))

for i in range(N):
    if math.ceil(i * 1.08) == N:
        print(i)
        break
else:
    print(":(")
```
Note: The `math.ceil()` function is used to round up the result of the multiplication to the nearest integer.</s>
