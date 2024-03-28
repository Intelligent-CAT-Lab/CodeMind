<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2 1 1

Expected output:
-55

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
[/INST]
```python
import sys

def main():
    num_dog = sys.stdin.readline().split()
    result = 0
    for i in range(len(num_dog)):
        result += int(num_dog[i])
    print(result)

if __name__ == "__main__":
    main()
```
This is a simple program that reads a line of input from the user, splits it into a list of numbers using the `split()` method, and then calculates the sum of those numbers using a `for` loop. The result is then printed to the console.

The `sys` module is used to read input from the user, and the `int` function is used to convert the input strings to integers.

The program is then wrapped in a `main()` function, which is the entry point for the program. The `if __name__ == "__main__":` block is used to ensure that the `main()` function is only executed when the program is run directly, and not when it is imported as a module.</s>
