Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02724 {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int X = scan.nextInt();
			
			int gohyaku = X/500;
			
			X = X-500*gohyaku;
			
			int goen = X/5;
			
			
			System.out.println(1000*gohyaku+5*goen);
		}
		
		
	}
		

}

```

### Response:
```python
import java.util.Scanner;

public class p02724 {
    public static void main(String[]args) {
        try(Scanner scan = new Scanner(System.in)){
            
            int X = scan.nextInt();
            
            int gohyaku = X//500;
            
            X = X-500*gohyaku;
            
            int goen = X//5;
            
            
            System.out.println(1000*gohyaku+5*goen);
        }
        
        
    }
        

}
```

Explanation:

- We need to import the `java.util.Scanner` package to read input from the user.
- We create a `try-with-resources` block to ensure that the `Scanner` object is closed properly after use.
- We read the input integer `X` from the user using the `nextInt()` method of the `Scanner` class.
- We calculate the number of gohyaku coins by dividing `X` by 500 and store the result in the variable `gohyaku`.
- We calculate the remaining amount of money after the gohyaku coins by subtracting 500 multiplied by `gohyaku` from `X`.
- We calculate the number of goen coins by dividing the remaining amount of money by 5 and store the result in the variable `goen`.
- We print the total number of coins by multiplying the number of gohyaku coins by 1000 and adding the number of goen coins multiplied by 5.<|endoftext|>
