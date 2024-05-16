System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03502 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	int N = sc.nextInt();

	int X = N;

	int fx = 0;


	while(N>=10) {

		fx += N%10;

		N /= 10;

	}

	fx += N;

	if(X%fx == 0) System.out.println("Yes");

	else System.out.println("No");
}

}
```


Answer:
```python
import sys

def main():
    N = int(input())
    X = N
    fx = 0

    while N >= 10:
        fx += N % 10
        N //= 10

    fx += N

    if X % fx == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    sys.exit(main())
```<|endoftext|>
