```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputData = sc.nextLine().split(" ");
        
        int value1 = Integer.parseInt(inputData[0]);
        int value2 = Integer.parseInt(inputData[1]);
        int value3 = Integer.parseInt(inputData[2]);
        
        if ((double)value1 / value2 <= value3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
