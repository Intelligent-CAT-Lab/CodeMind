Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.IOException;
import java.util.Scanner;

class p00352 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println((sc.nextInt() + sc.nextInt()) / 2);
	}
}

```

### Response:
```python
import java.io.IOException;
import java.util.Scanner;

class p00352:
    def main(self):
        sc = Scanner(System.in)
        print((sc.nextInt() + sc.nextInt()) / 2)

p00352().main()
```

Note: The `java` package is not available in Python, so we need to use the `Scanner` class from the `java.util` package instead. Also, we need to define a class `p00352` and define a `main` method inside it. Finally, we need to call the `main` method of the `p00352` class to execute the program.<|endoftext|>
