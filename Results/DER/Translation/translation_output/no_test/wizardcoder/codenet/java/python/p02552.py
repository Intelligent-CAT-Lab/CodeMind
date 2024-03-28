Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

/**
 * @author yadavd5
 *
 */
public class p02552 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n==0)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
```

### Response:
```python
import java.util.Scanner;

public class p02552 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0):
            System.out.println("1");
        else:
            System.out.println("0");
    }
}
```

Note: The colon (:) after the if statement is used to indicate the start of the code block that follows.<|endoftext|>
