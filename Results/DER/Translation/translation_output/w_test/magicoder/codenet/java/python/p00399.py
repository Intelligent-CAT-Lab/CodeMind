<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2 1 1

Expected output:
8


```
import java.io.BufferedReader;
import java.io.InputStreamReader;

//PCK/Prelim:   0404:   Shiba Inu
// http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
class p00399 {

	public static void main(String[] args) throws Exception {
		int result = 0;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String[] numDog = reader.readLine().split(" ");

			for(int i=0;i<numDog.length;i++) {
				result += Integer.parseInt(numDog[i]);
			}

			System.out.println(result);

		}
	}

}

```

@@ Response
```python
# Python code

# Read input from user
numDog = input().split()

# Initialize result
result = 0

# Add each number to result
for i in numDog:
    result += int(i)

# Print result
print(result)
```

This Python code does the same thing as the Java code. It reads a line of input from the user, splits it into a list of strings, converts each string to an integer, and adds it to the result. Finally, it prints the result.<｜end▁of▁sentence｜>
