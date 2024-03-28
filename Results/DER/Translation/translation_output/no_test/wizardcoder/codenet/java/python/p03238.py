Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03238{
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		if(n == 1)System.out.println("Hello World");
		else {
			int a = fs.nextInt(),b = fs.nextInt();
			System.out.println(a+b);
		}
		fs.close();
	}
}
```

### Response:
```python
import java.util.*;

public class p03238{
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		if(n == 1):
			System.out.println("Hello World");
		else:
			int a = fs.nextInt();
			int b = fs.nextInt();
			System.out.println(a+b);
		fs.close();
	}
}
```

Note: In Python, we don't need to use the `;` at the end of the `if` statement. Also, we don't need to use curly braces `{}` to enclose the code inside the `if` statement.<|endoftext|>
