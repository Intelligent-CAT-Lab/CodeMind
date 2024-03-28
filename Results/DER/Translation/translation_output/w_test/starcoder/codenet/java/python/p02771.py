<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 5

Expected output:
Yes


```

import java.util.Scanner;

public class p02771 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();

		if((A == B && B == C)||(A!=B && A!=C && B!=C) ) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}

```

python code:<fim_suffix><fim_middle>

```python

A,B,C = map(int,input().split())

if A==B==C or A!=B and A!=C and B!=C:
    print("Yes")
else:
    print("No")

```
<|endoftext|>
