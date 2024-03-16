Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03139 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(Math.min(A, B) + " " + Math.max(0, A + B - N));
	}
}
```

### Response:
```python
import java.util.Scanner;

public class p03139 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(min(A, B) + " " + max(0, A + B - N));
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
```

Explanation:

- We import the `java.util.Scanner` class to read input from the user.
- We define a `Scanner` object `sc` to read input from the standard input stream.
- We define a `main` method that reads three integers `N`, `A`, and `B` from the user using the `nextInt` method of the `Scanner` class.
- We use the `min` and `max` methods to find the minimum and maximum of `A` and `B`, respectively.
- We print the minimum and maximum values using the `println` method of the `System.out` object.
- We define two helper methods `min` and `max` that return the minimum and maximum of two integers, respectively.<|endoftext|>
