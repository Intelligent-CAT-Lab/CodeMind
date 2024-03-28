<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2019/04/30

Expected output:
Heeisei

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
        int year = Integer.parseInt(split[0]);
        if (year <= 2018) {
            System.out.println("Heisei");
        } else if (year == 2019 && Integer.parseInt(split[1]) <= 4 && Integer.parseInt(split[2]) <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
```</s>
