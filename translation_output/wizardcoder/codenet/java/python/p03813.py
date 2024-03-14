Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}
```

### Response:
```python
import java.util.*;

s = Scanner(System.in)

if s.nextInt() < 1200:
    print("ABC")
else:
    print("ARC")
```

Explanation:

- We first import the `java.util` package to use the `Scanner` class.
- We create an instance of the `Scanner` class and assign it to the variable `s`.
- We use the `nextInt()` method of the `Scanner` class to read an integer input from the user.
- We use an `if` statement to check if the input is less than 1200. If it is, we print "ABC". Otherwise, we print "ARC".<|endoftext|>
