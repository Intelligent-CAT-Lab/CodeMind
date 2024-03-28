Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
a  `b

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02391 {

	public static void main(String[] args) {
		
		String CMD = null ;
		BufferedReader BR = null;
		BR = new BufferedReader(new InputStreamReader(System.in));
		try {CMD = BR.readLine();
		} 
		catch (IOException e) {e.printStackTrace();
		}
		String[] str = CMD.split(" "); 
		
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		
		if(x==y){
			System.out.println("a == b");
		}if(x<y){
			System.out.println("a < b");
		}if(x>y){
			System.out.println("a > b");
		}

	}

}
```

### Response:
```python
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02391 {

	public static void main(String[] args) {
		
		String CMD = None ;
		BufferedReader BR = None;
		BR = java.io.BufferedReader(java.io.InputStreamReader(System.in));
		try {CMD = BR.readLine();
		} 
		catch (IOException e) {e.printStackTrace();
		}
		String[] str = CMD.split(" "); 
		
		int x = int(str[0]);
		int y = int(str[1]);
		
		if(x==y):
			System.out.println("a == b");
		elif(x<y):
			System.out.println("a < b");
		else:
			System.out.println("a > b");

	}

}
```

Note:
- In Python, we use `None` instead of `null` to represent null values.
- In Python, we use `int()` instead of `Integer.parseInt()` to convert a string to an integer.
- In Python, we use `if` instead of `if()` to check conditions.
- In Python, we use `elif` instead of `else if()` to check multiple conditions.<|endoftext|>
