Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
ES

```
import java.util.*;
import java.math.BigDecimal;

public class p03210 {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
      
      	if(age == 3 || age == 5 || age == 7) {
        	System.out.println("YES");
        } else {
          	System.out.println("NO");
        }

    }
}
```

### Response:
```python
import java.util.*;
import java.math.BigDecimal;

public class p03210 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
      
        if(age == 3 or age == 5 or age == 7):
            System.out.println("YES");
        else:
            System.out.println("NO");
    }
}
```

Note: In Python, the `or` operator is used instead of the `||` operator.<|endoftext|>
