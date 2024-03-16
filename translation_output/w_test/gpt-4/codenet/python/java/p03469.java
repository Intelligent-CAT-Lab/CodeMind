Below is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        String modifiedDate = "2018" + inputDate.substring(4);
        System.out.println(modifiedDate);
        scanner.close();
    }
}
```

If you save the above code as `Main.java`, you can compile it with `javac Main.java` and run it with `java Main`. Upon entering "2017/01/07" as the input, the program will print "2018/01/07".
