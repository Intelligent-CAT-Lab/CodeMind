Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

Note: In Python, the `and` operator is used instead of the `&&` operator used in Java. The `elif` statement is used instead of the `else if` statement in Python.<|endoftext|>
