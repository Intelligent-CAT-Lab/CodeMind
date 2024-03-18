Here's the translation of the provided Python code to Java:

```java
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = 0; i < h; i++) {
            if (i < b) {
                System.out.println("0".repeat(a) + "1".repeat(w - a));
            } else {
                System.out.println("1".repeat(a) + "0".repeat(w - a));
            }
        }
        
        sc.close();
    }
    
}
```

Remember, the `String.repeat(int count)` method is a feature available from Java 11. If you're using an older version of Java, you'll have to implement the repetition manually using loops.

For older versions of Java (prior to Java 11), you can use a StringBuilder instead:

```java
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for (int i = 0; i < h; i++) {
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < a; j++) {
                sb.append(i < b ? '0' : '1');
            }
            for (int j = a; j < w; j++) {
                sb.append(i < b ? '1' : '0');
            }
            
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
    
}
```

To run this code, you would need to compile it with `javac Main.java` and then run `java Main`, inputting the numbers `3 3 1 1` when prompted, to match the test case provided.
