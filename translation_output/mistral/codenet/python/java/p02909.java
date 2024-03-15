<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weather: ");
        String S = input.nextLine();

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
