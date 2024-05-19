System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-60

```
import java.util.ArrayList;
import java.util.Scanner;

public class p01809{
	public static void main(String args[]) {
		ArrayList<Long> yaku = new ArrayList<Long>();

		Scanner scn = new Scanner(System.in);
		long p = scn.nextLong(), q = scn.nextLong();
		scn.close();
		long qs;
		long ans = 1;
		long bp = p,bq = q,buf = p;

		while(bq % bp!= 0) {
			buf = bq % bp;
			bq = bp;
			bp = buf;
		}
		qs = q/buf;
		for(long i = 2;i <= Math.sqrt(qs);i++) {
			if(qs % i ==0) {
				while(qs % i == 0) {
					qs /=i;
				}
				ans *= i;
			}
		}
		ans*= qs;
		System.out.println(ans);
	}
}

```


Answer:
```python
import math

def gcd(a, b):
    while b!= 0:
        a, b = b, a % b
    return a

def lcm(a, b):
    return a * b // gcd(a, b)

def main():
    p, q = map(int, input().split())
    ans = 1
    for i in range(2, int(math.sqrt(q)) + 1):
        if q % i == 0:
            ans = lcm(ans, i)
            while q % i == 0:
                q //= i
    ans = lcm(ans, q)
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    ("1 2", -60),
    ("2 4", 4),
    ("6 9", 9),
    ("12 18", 18),
]
for test_input, expected_output in test_inputs:
    input_str = "10\n" + test_input
    expected_str = str(expected_output) + "\n"
    try:
        import io, sys
        from contextlib import redirect_stdout

        sys.stdin = io.StringIO(input_str)
        with redirect_stdout(io.StringIO()) as stdout:
            main()
        actual_str = stdout.getvalue().strip()
        assert actual_str == expected_str, f"Expected {expected_str}, got {actual_str}"
        print("Test passed")
    except Exception as e:
        print(f"Test failed: {e}")
```<|endoftext|>
