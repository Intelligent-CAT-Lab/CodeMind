Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p00252 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[3];
		for(int i = 0; i < 3; i++) {
			a[i] = stdIn.nextInt();
		}
		if(a[0] == 1 && a[1] == 1) {
			System.out.println("Open");
		}
		else if(a[2] == 1) {
			System.out.println("Open");
		}
		else {
			System.out.println("Close");
		}
		
	}

}
```

### Response:
```python
import java.util.Scanner;

public class p00252 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int[] a = new int[3];
        for(int i = 0; i < 3; i++) {
            a[i] = stdIn.nextInt();
        }
        if(a[0] == 1 and a[1] == 1):
            System.out.println("Open");
        elif(a[2] == 1):
            System.out.println("Open");
        else:
            System.out.println("Close");
    }

}
```

Note: In Python, the `and` operator is replaced with the `and` keyword. The `elif` keyword is used instead of `else if`.<|endoftext|>
