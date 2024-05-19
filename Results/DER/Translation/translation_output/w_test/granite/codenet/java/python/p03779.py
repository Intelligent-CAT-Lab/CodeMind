System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6

Expected output:
3


```


import java.util.Scanner;

public class p03779{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < 100000; i++) {
			if (x <= i * (i + 1) / 2) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}

```


Answer:
```python
def main():
    x = int(input())
    ans = 0
    i = 0
    while x > i * (i + 1) / 2:
        i += 1
    ans = i - 1
    print(ans)

if __name__ == "__main__":
    main()
```

Test input:
```
6
```

Expected output:
```
3
```<|endoftext|>
