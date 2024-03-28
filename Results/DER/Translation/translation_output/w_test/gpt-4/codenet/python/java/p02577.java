Here is the Java translation of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String n = sc.nextLine();
        int tmp = 0;
        
        for (int i = 0; i < n.length(); i++) {
            tmp = (tmp + Character.getNumericValue(n.charAt(i))) % 9;
        }
        
        System.out.println(tmp == 0 ? "Yes" : "No");
        
        sc.close();
    }
}
```

To run this Java program, you would compile it with `javac Main.java` and run it with `java Main`. When prompted, you would enter the test input, such as `123456789`, and the program should output `Yes` as expected.
