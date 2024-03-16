Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

Note: In Python, the `and` operator is used instead of the `&&` operator. Also, the `min` function is used instead of `Math.min`.<|endoftext|>
