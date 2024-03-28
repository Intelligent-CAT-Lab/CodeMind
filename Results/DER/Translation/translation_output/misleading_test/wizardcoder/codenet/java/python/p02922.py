Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 10

Expected output:
32

```
import java.util.Scanner;
public class p02922 {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = (b-1)/(a-1);
    if((b-1)%(a-1)==0) {
    	System.out.println(ans);
    }else {
    	System.out.println(ans+1);
    }
    }
}
```

### Response:
```python
import java.util.Scanner;

public class p02922 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = (b-1)//(a-1);
        if((b-1)%(a-1)==0) {
            System.out.println(ans);
        }else {
            System.out.println(ans+1);
        }
    }
}
```

Explanation:

- We need to import the Scanner class from java.util package in python.
- We create a Scanner object to read input from the user.
- We read two integers a and b from the user using the nextInt() method of the Scanner class.
- We calculate the answer by dividing b-1 by a-1 and store it in the variable ans.
- We check if the remainder of b-1 divided by a-1 is zero or not. If it is zero, then the answer is an integer, otherwise, it is an integer plus one.
- We print the answer using the println() method of the System.out object.<|endoftext|>
