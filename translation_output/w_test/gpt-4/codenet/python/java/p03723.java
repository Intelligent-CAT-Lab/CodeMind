Below is the translated Java code for the provided Python script. It takes three integer inputs and performs the operations described in the script to determine the number of iterations until a condition is met or a cycle is detected:

```java
import java.util.Scanner;

public class ChocolateSharing {
    public static boolean rem(int a, int b, int c) {
        return (a % 2 == 0) && (b % 2 == 0) && (c % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int cnt = 0;
        int fa = a;
        int fb = b;
        int fc = c;

        while (true) {
            if (cnt != 0 && fa == a && fb == b && fc == c) {
                System.out.println(-1);
                return;
            }

            int tmp1 = a / 2;
            int tmp2 = b / 2;
            int tmp3 = c / 2;
            cnt++;

            a = tmp2 + tmp3;
            b = tmp1 + tmp3;
            c = tmp1 + tmp2;

            if (!rem(a, b, c)) {
                break;
            }
        }

        System.out.println(cnt);
        scanner.close();
    }
}
```

Please note that in Java, you don't need to check if values are integers (`%1!=0`) after division as integer division truncates the fractional part and always gives an integer result. In the original Python code, this check was unnecessary since the input was already converted to integers and integer division was used which does not produce floating-point results.

Make sure to run this Java code inside a class and with the appropriate imports for `Scanner` if you are using it outside an IDE like Eclipse or IntelliJ IDEA that includes these automatically during project setup. The code takes input from the console and prints the output to the console as well.
