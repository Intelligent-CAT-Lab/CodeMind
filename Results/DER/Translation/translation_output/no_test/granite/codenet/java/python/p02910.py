System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02910 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		for (int i = 0; i < N.length(); i++) {
			char c = N.charAt(i);
			if (i % 2 == 0) {
				if (c =='L') {
					System.out.println("No");
					break;
				}
			}else {
				if (c =='R') {
					System.out.println("No");
					break;
				}
			}
			if (i == N.length() - 1) {
				System.out.println("Yes");
			}
		}
	}

}
```


Answer:
```python
import sys

N = input()

for i in range(len(N)):
    c = N[i]
    if i % 2 == 0:
        if c =='L':
            print("No")
            sys.exit()
    else:
        if c =='R':
            print("No")
            sys.exit()
print("Yes")
```<|endoftext|>
