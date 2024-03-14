Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p02717 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(c+" "+a+" "+b);
	}

}

```

### Response:
```python
import java.util.Scanner;

public class p02717 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(c, a, b);
    }

}
```

In Python, we don't need to import the Scanner class. We can directly use it. Also, we don't need to enclose the output statement in quotes. Python automatically converts the integers to strings when concatenating them.<|endoftext|>
