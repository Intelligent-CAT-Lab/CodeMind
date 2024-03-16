Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

    def main(self):
        br = BufferedReader(InputStreamReader(System.in))
        num = int(br.readLine())
        print(num*num*num)

p02388().main()
```

Note: The `BufferedReader` and `InputStreamReader` classes in Java are replaced by `BufferedReader` and `InputStreamReader` classes in Python. Also, the `System.in` object in Java is replaced by `System.stdin` object in Python.<|endoftext|>
