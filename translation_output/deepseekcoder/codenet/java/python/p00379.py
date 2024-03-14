<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
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
        y = sum(int(digit) for digit in str(x))

        if y + a == i:
            ans += 1

    print(ans)

if __name__ == "__main__":
    main()
```
<|EOT|>
