<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
n = input()

a = int(n[0])
b = int(n[1])
c = int(n[2])
d = int(n[3])

if (a+b+c+d) == 7:
    print(a, "+" ,b, "+" ,c, "+", d, "=7", sep="")
elif (a+b+c-d) == 7:
    print(a, "+" ,b, "+" ,c, "-", d, "=7", sep="")
elif (a+b-c+d) == 7:
    print(a, "+" ,b, "-" ,c, "+", d, "=7", sep="")
elif (a+b-c-d) == 7:
    print(a, "+" ,b, "-" ,c, "-", d, "=7", sep="")
elif (a-b+c+d) == 7:
    print(a, "-" ,b, "+" ,c, "+", d, "=7", sep="")
elif (a-b+c-d) == 7:
    print(a, "-" ,b, "+" ,c, "-", d, "=7", sep="")
elif (a-b-c+d) == 7:
    print(a, "-" ,b, "-" ,c, "+", d, "=7", sep="")
elif (a-b-c-d) == 7:
    print(a, "-" ,b, "-" ,c, "-", d, "=7", sep="")
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(input.charAt(i) + "");
        }
        int sum = arr[0] + arr[1] + arr[2] + arr[3];
        if (sum == 7) {
            System.out.println(arr[0] + " + " + arr[1] + " + " + arr[2] + " + " + arr[3] + " = 7");
        } else if (sum == 6) {
            System.out.println(arr[0] + " + " + arr[1] + " + " + arr[2] + " - " + arr[3] + " = 7");
        } else if (sum == 5) {
            System.out.println(arr[0] + " + " + arr[1] + " - " + arr[2] + " + " + arr[3] + " = 7");
        } else if (sum == 4) {
            System.out.println(arr[0] + " + " + arr[1] + " - " + arr[2] + " - " + arr[3] + " = 7");
        } else if (sum == 3) {
            System.out.println(arr[0] + " - " + arr[1] + " + " + arr[2] + " + " + arr[3] + " = 7");
        } else if (sum == 2) {
            System.out.println(arr[0] + " - " + arr[1] + " + " + arr[2] + " - " + arr[3] + " = 7");
        } else if (sum == 1) {
            System.out.println(arr[0] + " - " + arr[1] + " - " + arr[2] + " + " + arr[3] + " = 7");
        } else {
            System.out.println("No solution");
        }
    }
}
```</s>
