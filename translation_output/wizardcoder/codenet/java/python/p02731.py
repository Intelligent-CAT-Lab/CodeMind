Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02731{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		double L = scan.nextInt();
		scan.close();
		System.out.println(Math.pow(L/3, 3));
	}
}

```

### Response:
```python
import java.util.Scanner;

public class p02731:
    def main(self):
        scan = Scanner(System.in)
        L = scan.nextInt()
        scan.close()
        print(math.pow(L/3, 3))
```

Note: The `math` module in Python provides a `pow()` function that can be used to calculate the power of a number.<|endoftext|>
