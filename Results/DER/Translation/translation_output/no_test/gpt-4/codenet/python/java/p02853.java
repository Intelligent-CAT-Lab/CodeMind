Here is the Python code translated to Java:

```java
import java.util.Scanner;

public class DdCcFinals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int X = 0;
        int Y = 0;

        switch (x) {
            case 3:
                X = 100000;
                break;
            case 2:
                X = 200000;
                break;
            case 1:
                X = 300000;
                break;
            default:
                X = 0;
                break;
        }

        switch (y) {
            case 3:
                Y = 100000;
                break;
            case 2:
                Y = 200000;
                break;
            case 1:
                Y = 300000;
                break;
            default:
                Y = 0;
                break;
        }

        if (x == 1 && y == 1) {
            System.out.println(X + Y + 400000);
        } else {
            System.out.println(X + Y);
        }
        
        scanner.close();
    }
}
```

Remember to add the class to a file named `DdCcFinals.java` and compile with Java compiler before running. This code assumes that you are inputting two integers on the same line separated by a space, as that's how the original Python code is set up to handle input.
