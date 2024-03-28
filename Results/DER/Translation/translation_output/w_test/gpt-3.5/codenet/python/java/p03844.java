```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputs = input.split(" ");
        
        int A = Integer.parseInt(inputs[0]);
        String s = inputs[1];
        int B = Integer.parseInt(inputs[2]);
        
        if (s.equals("+")) {
            System.out.println(A + B);
        } else if (s.equals("-")) {
            System.out.println(A - B);
        }
    }
}
```  
