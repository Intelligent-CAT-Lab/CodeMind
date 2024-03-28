<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
if(n>=65 and n<=90):
    print("1")
elif(n>=97 and n<=122):
    print("2")
else:
    print("0")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n>=65 && n<=90){
            System.out.println("1");
        } else if(n>=97 && n<=122){
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}
```
<|EOT|>
