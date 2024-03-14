Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A,B,C = map(str,input().split("/"))
if int(A) <= 2018:
  print("Heisei")
elif int(A) == 2019 and int(B) <=4 and int(C)<=30:
  print("Heisei")
else:
  print("TBD")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("/");
        String A = input[0];
        String B = input[1];
        String C = input[2];
        int year = Integer.parseInt(A);
        int month = Integer.parseInt(B);
        int day = Integer.parseInt(C);

        if (year <= 2018) {
            System.out.println("Heisei");
        } else if (year == 2019 && month <= 4 && day <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
```<|endoftext|>
