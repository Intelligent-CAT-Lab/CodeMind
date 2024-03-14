Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
 
class p02811 {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int K = stdIn.nextInt();
		int X = stdIn.nextInt();

		if( X <= 500*K ) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
    
}
```

### Response:
```python
import java.util.Scanner;

class p02811:

    def main(self):
        stdIn = Scanner(System.in)
        K = stdIn.nextInt()
        X = stdIn.nextInt()

        if X <= 500*K:
            print("Yes")
        else:
            print("No")

p02811().main()
```<|endoftext|>
