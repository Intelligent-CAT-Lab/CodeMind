System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 4 0 0 3 3

Expected output:
2


```
import java.util.*;
import java.math.*;
class p00991{
	public static void main(String[]Z){
		Scanner cin=new Scanner(System.in);
		int r=cin.nextInt(),c=cin.nextInt(),a1=cin.nextInt(),a2=cin.nextInt(),b1=cin.nextInt(),b2=cin.nextInt();
		int x=Math.abs(a1-b1),y=Math.abs(a2-b2);
		x=Math.min(x,r-x);y=Math.min(y,c-y);
		int z=1,C=Math.min(x,y);
		if(x==r-x)z*=2;
		if(y==c-y)z*=2;
		BigInteger b=BigInteger.ONE;
		for(int i=0;i<C;i++)b=b.multiply(new BigInteger(String.valueOf(x+y-i))).divide(new BigInteger(String.valueOf(i+1)));
		System.out.println(b.multiply(new BigInteger(String.valueOf(z))).mod(new BigInteger("100000007")));
	}
}
```


Answer:
```python
import sys
from fractions import Fraction

def main():
    r, c, a1, a2, b1, b2 = map(int, sys.stdin.readline().split())
    x = abs(a1 - b1)
    y = abs(a2 - b2)
    x = min(x, r - x)
    y = min(y, c - y)
    z = 1
    if x == r - x:
        z *= 2
    if y == c - y:
        z *= 2
    ans = Fraction(1)
    for i in range(min(x, y)):
        ans *= Fraction(x + y - i, i + 1)
    ans *= z
    print(int(ans) % 100000007)

if __name__ == '__main__':
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "4 4 0 0 3 3",
    "4 4 0 0 0 0",
    "4 4 0 0 3 4",
]

expected_outputs = [
    2,
    1,
    0,
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    sys.stdin = open("input.txt", "w")
    sys.stdout = open("output.txt", "w")
    sys.stdin.write(test_input + "\n")
    main()
    sys.stdin.close()
    sys.stdout.close()
    with open("output.txt", "r") as output_file:
        actual_output = output_file.read().strip()
    assert actual_output == str(expected_output), f"Expected output: {expected_output}, Actual output: {actual_output}"
```<|endoftext|>
