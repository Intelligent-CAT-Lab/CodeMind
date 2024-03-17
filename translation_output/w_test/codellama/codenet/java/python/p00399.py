<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
Note: The `sys` module is used to read input from stdin, and the `split()` method is used to split the input string into a list of strings. The `int()` function is used to convert each string to an integer. The `range()` function is used to iterate over the list of integers. The `print()` function is used to print the result.</s>
