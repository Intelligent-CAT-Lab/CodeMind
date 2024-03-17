Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
3


```
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03962 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Set<Integer> paintCans = new HashSet<Integer>();
		paintCans.add(scan.nextInt());
		paintCans.add(scan.nextInt());
		paintCans.add(scan.nextInt());

		System.out.println(paintCans.size());
	}

}
```

### Response:
```python
import java.util.HashSet
import java.util.Scanner
import java.util.Set

def main():
    scan = Scanner(System.in)
    paintCans = HashSet()
    paintCans.add(scan.nextInt())
    paintCans.add(scan.nextInt())
    paintCans.add(scan.nextInt())

    System.out.println(paintCans.size())

if __name__ == '__main__':
    main()
```

Note: The `java` code uses `Scanner` class to read input from the user. In Python, we use the `input()` function to read input from the user. Therefore, we need to modify the code accordingly.<|endoftext|>
