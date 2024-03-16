Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
        scanner.close();
    }
}
```

To run the above Java program, make sure your input is provided as follows:

Test input:
```
CODEFESTIVAL
```

Expected output:
```
CODE FESTIVAL
```
