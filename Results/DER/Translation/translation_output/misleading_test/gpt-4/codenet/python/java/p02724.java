Below is the equivalent Java code for the provided Python script. It reads an integer from the standard input, performs the specified calculations, and then outputs the result:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = scanner.nextInt();
        
        int num_500 = total / 500;

        int remain = total - num_500 * 500;
        int num_5 = remain / 5;

        System.out.println(num_500 * 1000 + num_5 * 5);
        
        scanner.close();
    }
}
```

To use this Java code, compile it with a Java compiler, and then run the resulting class file. When prompted, enter the test input (1024 in the provided test case), and the program will output the expected result (2036).
