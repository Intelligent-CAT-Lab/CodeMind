Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02963{
	public static void main(String[]i){
		long s=Long.parseLong(new Scanner(System.in).next());
		int a=1000000000;
		System.out.println("0 0 "+a+" 1 "+(a-s%a)%a+" "+((s-1)/a+1));
	}
}

```

### Response:
```python
import java.util.*;

public class p02963:
    def main(i):
        s = Long.parseLong(Scanner(System.in).nextLine())
        a = 1000000000
        print("0 0", a, "1", (a-s%a)%a, (s-1)//a+1)

```

Explanation:

- We import the `java.util` package to use the `Scanner` class.
- We define a class `p02963` with a method `main` that takes an array of strings `i` as input.
- We declare a variable `s` and initialize it with the input integer `s` obtained from the user using the `Scanner` class.
- We declare a variable `a` and initialize it with the value `1000000000`.
- We print the required output using the `print` function.<|endoftext|>
