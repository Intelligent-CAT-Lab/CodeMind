<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
A,B,C = map(str,input().split("/"))
if int(A) <= 2018:
  print("Heisei")
elif int(A) == 2019 and int(B) <=4 and int(C)<=30:
  print("Heisei")
else:
  print("TBD")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split("/");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int C = Integer.parseInt(split[2]);
        if (A <= 2018) {
            System.out.println("Heisei");
        } else if (A == 2019 && B <= 4 && C <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
```</s>
