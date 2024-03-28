Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int counter = 0;
        
        while (num1!= 0 && num2!= 0) {
            if (num1 == 1 && num2 == 1) {
                break;
            }
            
            if (num1 <= num2) {
                num1++;
                num2 -= 2;
            } else {
                num1 -= 2;
                num2++;
            }
            
            counter++;
        }
        
        System.out.println(counter);
    }
}
```

### Response:
```python
import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int counter = 0;
        
        while (num1!= 0 and num2!= 0):
            if (num1 == 1 and num2 == 1):
                break;
            
            if (num1 <= num2):
                num1++;
                num2 -= 2;
            else:
                num1 -= 2;
                num2++;
            counter++;
        }
        
        System.out.println(counter);
    }
}
```

Note: The colon (:) after the while statement is used in Python to indicate the start of a block of code.<|endoftext|>
