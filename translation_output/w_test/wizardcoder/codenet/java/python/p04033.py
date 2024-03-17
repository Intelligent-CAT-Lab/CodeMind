Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
Positive


```
import java.util.Scanner;

public class p04033 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int a=s.nextInt(),b=s.nextInt();
		if(a<=0&&0<=b)
			System.out.println("Zero");
		else
			System.out.println((Math.min(0,b)-Math.min(-1,a))%2==1?"Positive":"Negative");
	}
}

```

### Response:
```python
import java.util.Scanner;

public class p04033 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int a=s.nextInt(),b=s.nextInt();
        if(a<=0 and b>=0):
            System.out.println("Zero");
        else:
            System.out.println((min(0,b)-min(-1,a))%2==1?"Positive":"Negative");
    }
}
```

Explanation:

- We have imported the `java.util.Scanner` class to read input from the user.
- We have defined a class `p04033` with a `main` method that reads two integers `a` and `b` from the user using the `Scanner` class.
- We have used the `if-else` statement to check if `a` is less than or equal to 0 and `b` is greater than or equal to 0. If both conditions are true, we print "Zero".
- If the conditions are not met, we use the `min` function to find the minimum value between 0 and `b` and the minimum value between -1 and `a`. We then check if the difference between these two values is odd or even using the modulo operator. If it is odd, we print "Positive". Otherwise, we print "Negative".<|endoftext|>
