Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxxoxoo

Expected output:
o


```
import java.util.Scanner;
public class p01521
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		char c[]=in.next().toCharArray();
		System.out.println(c[0]=='x'&&c[c.length-1]=='x'? "x":"o");
	}
}
```

### Response:
```python
import java.util.Scanner;

public class p01521 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] c = in.next().toCharArray();
        System.out.println(c[0] == 'x' and c[c.length - 1] == 'x'? "x" : "o");
    }
}
```

Explanation:

- We first import the `java.util.Scanner` class to read input from the user.
- We then declare a `main` method which is the entry point of the program.
- We create a new instance of the `Scanner` class and read the input string from the user using the `next()` method.
- We convert the input string to a character array using the `toCharArray()` method.
- We use the ternary operator to check if the first character of the input string is 'x' and the last character is 'x'. If both conditions are true, we print 'x'. Otherwise, we print 'o'.<|endoftext|>
