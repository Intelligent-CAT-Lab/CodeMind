Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03740 {
    public static void main(String[] args) {
		try{
			Scanner sc  = new Scanner(System.in);
			System.out.println(Math.abs(sc.nextLong() - sc.nextLong()) <= 1? "Brown" : "Alice");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
```

### Response:
```python
import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        try{
            Scanner sc  = new Scanner(System.in);
            System.out.println(abs(sc.nextLong() - sc.nextLong()) <= 1? "Brown" : "Alice");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
```

In Python, we don't need to import the java package. Instead, we can use the built-in `abs()` function to get the absolute value of a number. We can also use the `print()` function to output the result. Here's the updated code:

```python
import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        try{
            Scanner sc  = new Scanner(System.in);
            long a = sc.nextLong();
            long b = sc.nextLong();
            if abs(a - b) <= 1:
                print("Brown")
            else:
                print("Alice")
        }catch(Exception e):
            e.printStackTrace();
    }
}
```

Note that we have used `:` to indicate the start of the `try` block and `except` block. Also, we have used `print()` instead of `System.out.println()` to output the result.<|endoftext|>
