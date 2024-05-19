System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())
    if (A == B and B == C) or (A!= B and A!= C and B!= C):
        print("No")
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```<|endoftext|>
