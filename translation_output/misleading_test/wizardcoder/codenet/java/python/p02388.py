Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
-16

```
import java.io.BufferedReader;
import java.io.InputStreamReader;

class p02388 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		System.out.println(num*num*num);
	}

}
```

### Response:
```python
import java.io.BufferedReader;
import java.io.InputStreamReader;

class p02388:

    @staticmethod
    def main(args):
        br = BufferedReader(InputStreamReader(System.in))
        num = int(br.readLine())
        print(num*num*num)

if __name__ == '__main__':
    p02388.main(None)
```

Explanation:

- We import the necessary classes from the java package.
- We define a class `p02388` with a static method `main` that takes in a list of arguments.
- Inside the `main` method, we create a `BufferedReader` object to read input from the standard input stream.
- We read a single integer from the input stream using the `readLine` method of the `BufferedReader` object.
- We print the cube of the input number using the `print` function.
- We call the `main` method with `None` as the argument to run the program.<|endoftext|>
