Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
YES


```
import java.util.Scanner;
public class p04043{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if(a== 5 && b == 7 && c ==5){
      	System.out.println("YES");
      }else if(a== 5 && b== 5 &&c ==7){
      	System.out.println("YES");
      }else if(a == 7 && b == 5&& c ==5){
      	System.out.println("YES");
      }else{
      	System.out.println("NO");
      }
    }
}
```

### Response:
```python
import java.util.Scanner;

public class p04043{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a== 5 and b == 7 and c ==5):
            System.out.println("YES");
        elif(a== 5 and b== 5 andc ==7):
            System.out.println("YES");
        elif(a == 7 and b == 5and c ==5):
            System.out.println("YES");
        else:
            System.out.println("NO");
    }
}
```

Note: The colon at the end of the if statement is not needed in Python. Also, the `and` operator is used instead of the `&&` operator in Python.<|endoftext|>
