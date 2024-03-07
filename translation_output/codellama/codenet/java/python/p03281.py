<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;
public class p03281 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 1) {
				int divcount = 0;
				for(int k = 1; k <= n; k++) {
					if(i % k == 0) divcount++;
				}
				if(divcount == 8) {
					ans++;
					//System.out.println(i);//è©²å½å¤ç¢ºèªç¨
				}
			}
		}
		System.out.println(ans);
		sc.close();
	}

}


Translate the above java code to python.

python code:

[/INST]
```python
import math

def main():
    n = int(input("Enter a number: "))
    ans = 0
    for i in range(1, n+1):
        if i % 2 == 1:
            divcount = 0
            for k in range(1, n+1):
                if i % k == 0:
                    divcount += 1
            if divcount == 8:
                ans += 1
                # print(i)  # è©²å½å¤ç¢ºèªç¨
    print(ans)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the Java code you provided. The main difference is that Python uses indentation to denote code blocks, whereas Java uses curly braces. Additionally, Python has a built-in `range()` function that can be used to iterate over a sequence of numbers, which is used in the `for` loops in the code.</s>
