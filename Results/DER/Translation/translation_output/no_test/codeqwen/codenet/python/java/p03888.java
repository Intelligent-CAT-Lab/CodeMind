Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayResult = new String[100];
        int i = 0;
        arrayResult[i] = scanner.nextLine();
        i++;
        boolean flg = true;
        try {
            while (flg) {
                String data = scanner.nextLine();
                if (!data.equals("")) {
                    arrayResult[i] = data;
                    i++;
                    flg = true;
                } else {
                    flg = false;
                }
            }
        } finally {
            int r1 = Integer.parseInt(arrayResult[0].split(" ")[0]);
            int r2 = Integer.parseInt(arrayResult[0].split(" ")[1]);
            System.out.println(1.0 / ((r2 + r1) / (r1 * r2)));
        }
    }
}
```

Please note that in Java, we use `Scanner` class to get input from the user. Also, Java doesn't have a built-in function to split a string into an array of strings, so we use `split(" ")` method to split the string into an array of strings. The `equals("")` method is used to check if the input string is empty. The `parseInt()` method is used to convert a string to an integer. The `System.out.println()` method is used to print the result.
