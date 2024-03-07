<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    a, n, m = map(int, input().split())
    max_value = int(math.pow(m, 1 / n))
    ans = 0
    for i in range(1, max_value + 1):
        x = int(math.pow(i, n))
        str_x = str(x)
        y = 0
        for j in range(len(str_x)):
            y += int(str_x[j])
        if y + a == i:
            ans += 1
    print(ans)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the Java code you provided. It uses the `math` module to perform the necessary mathematical operations, and the `input()` function to read the input from the user. The rest of the code is similar to the Java code, with some minor changes to account for the differences in syntax between the two languages.</s>
