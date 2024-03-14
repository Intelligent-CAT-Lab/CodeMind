Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

	public class p02819 {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int x = sc.nextInt();
			
			while(!prime(x)) {
				x++;
			}
			System.out.println(x);
			
			
		}
		
		static boolean prime(int x) {
			for(int i=2;i<x;i++) {
				if(x%i==0) {
					return false;
				}
			}
			return true;
		}
		
	}
```

### Response:
```python
import java.util.Scanner;

public class p02819 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        
        while(!prime(x)):
            x++;
        System.out.println(x);
        
    }
    
    static boolean prime(int x) {
        for(int i=2;i<x;i++) {
            if(x%i==0) {
                return false;
            }
        }
        return true;
    }
    
}
```<|endoftext|>
