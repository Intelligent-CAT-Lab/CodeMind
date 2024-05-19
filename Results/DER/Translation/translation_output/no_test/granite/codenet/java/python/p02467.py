System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

//?Â´??????Â°????Â§Â£?????????????????Â°??????
public class p02467 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = Long.parseLong(sc.nextLine());
		System.out.print(n + ":");
		for (int i = 2; n >= i * i;) {
			if (n % i == 0) {
				n = n / i;
				System.out.print(" " + i);
			} else {
				i++;
			}
		}
		System.out.println(" " + n);
	}

}
```


Answer:
```python
import sys

#?Â´??????Â°????Â§Â£?????????????????Â°??????
def main():
    n = int(sys.stdin.readline())
    print(n, end = ':')
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            n //= i
            print(''+ str(i), end = '')
        else:
            i += 1
    print(''+ str(n))

if __name__ == '__main__':
    main()
```<|endoftext|>
