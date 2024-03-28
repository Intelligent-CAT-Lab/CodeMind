<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
Sunny

Expected output:
Cloudy


```
S = input()

if S == "Sunny":
    print("Cloudy")
elif S=="Cloudy":
    print("Rainy")
else:
    print("Sunny")
```
[/INST]
```java
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (S.equals("Cloudy")) {
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }
}
```</s>
