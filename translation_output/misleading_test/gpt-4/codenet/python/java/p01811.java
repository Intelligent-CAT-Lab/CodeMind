Here's the translated Python code into Java. Note that Java has a much more structured approach to input/output and does not inherently support the `exit()` command as Python does. Rather than exiting mid-code, the Java version returns from the `main` method after printing the message. I have also added the necessary imports and other Java specific syntax:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moto = sc.nextLine();
        String s = moto;
        final String gene = "ABC";
        boolean f = true;
        List<Character> log = new ArrayList<>();
        
        while (s.length() > 3 && f) {
            f = false;
            if (s.startsWith("ABC")) {
                s = s.replace("ABC", "A");
                log.add('A');
                f = true;
            } else if (s.endsWith("ABC")) {
                s = s.replace("ABC", "C");
                log.add('C');
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replace("ABC", "B");
                log.add('B');
                f = true;
            }
        }
        
        if (!s.equals(gene)) {
            System.out.println("No");
            return;
        }
        
        int l = log.size();
        for (int i = 0; i < l; ++i) {
            s = s.replace(log.get(l - 1 - i).toString(), "ABC");
        }
        
        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        sc.close();
    }
}
```

Make sure to place this Java code inside a file called `Main.java` and compile it with `javac Main.java`. You can then run the Java program with `java Main` and it will read from standard input as the Python script does.
