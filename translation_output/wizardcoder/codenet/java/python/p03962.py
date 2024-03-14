Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

Note: The ```@SuppressWarnings("resource")``` annotation is not necessary in Python.<|endoftext|>
