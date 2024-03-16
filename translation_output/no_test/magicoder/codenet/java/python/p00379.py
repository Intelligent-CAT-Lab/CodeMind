<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00379{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = sc.nextInt();
		int m = sc.nextInt();
		int max = (int) Math.pow(m, (double) 1 / n);
		
		int ans = 0;
		for(int i = 1; i <= max; i++) {
			int x = (int) Math.pow(i, n);
			String str = String.valueOf(x);
			int y = 0;
			for(int j = 0; j < str.length(); j++) {
				y += Integer.parseInt(str.substring(j, j + 1));
			}
			
			if(y + a == i) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}

```

@@ Response
```python
import math

def main():
    a = int(input())
    n = int(input())
    m = int(input())
    max_val = int(math.pow(m, 1 / n))

    ans = 0
    for i in range(1, max_val + 1):
        x = int(math.pow(i, n))
        str_x = str(x)
        y = sum(int(digit) for digit in str_x)

        if y + a == i:
            ans += 1

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the maximum value for the loop, and then iterates over the range from 1 to the maximum value. For each value, it calculates the power of the value to the nth power, converts it to a string, calculates the sum of its digits, and checks if the sum plus the initial value equals the current value. If it does, it increments the answer. Finally, it prints the answer.<｜end▁of▁sentence｜>
