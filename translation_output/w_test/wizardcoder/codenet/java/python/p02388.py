Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
8


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

Note: The `if __name__ == '__main__':` line is added to ensure that the `main` method is only called if the script is run as the main program, and not if it is imported as a module.<|endoftext|>
