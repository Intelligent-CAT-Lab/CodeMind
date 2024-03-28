Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import java.io.BufferedReader;
import java.io.InputStreamReader;

class p00399:
    def main(self):
        result = 0
        with BufferedReader(InputStreamReader(System.in)) as reader:
            numDog = reader.readLine().split()
            for i in range(len(numDog)):
                result += int(numDog[i])
            print(result)

p00399().main()
```

Explanation:

- We import the necessary classes from the java package.
- We define a class `p00399` which contains a `main` method.
- Inside the `main` method, we initialize a variable `result` to 0.
- We use a `with` statement to create a `BufferedReader` object that reads input from the standard input stream.
- We read a line from the input stream using the `readLine` method and split it into an array of strings using the `split` method.
- We loop through the array of strings and convert each string to an integer using the `int` function and add it to the `result` variable.
- Finally, we print the `result` variable.<|endoftext|>
