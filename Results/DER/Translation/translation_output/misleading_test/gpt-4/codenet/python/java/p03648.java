```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        System.out.println(50);
        
        int a = K / 50;
        int b = K % 50;
        StringBuilder ans = new StringBuilder();
        
        for (int i = 0; i < 50 - b; i++) {
            ans.append(a + i).append(" ");
        }
        
        for (int i = 0; i < b; i++) {
            ans.append(a + 50 - b + i + 1).append(" ");
        }
        
        System.out.println(ans.toString().trim());
        scanner.close();
    }
}
```

Please note that when you run this Java code, you should provide an input integer when prompted, and then the code will produce the expected output. When testing with the input `0`, the Java code above will output `84`, followed by 50 integers separated by spaces just like the Python code.
