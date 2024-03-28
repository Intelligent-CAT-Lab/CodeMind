```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] values = input.nextLine().split(" ");
        input.close();
        
        int A = Integer.parseInt(values[0]);
        int B = Integer.parseInt(values[1]);
        int H = Integer.parseInt(values[2]);
        int M = Integer.parseInt(values[3]);
        
        double l = H*360/12 + M*30/60;
        double s = M*360/60;
        double ang = Math.abs(l-s);
        double c = Math.pow(A, 2) + Math.pow(B, 2) - 2*B*A*Math.cos(Math.toRadians(ang));
        System.out.println(Math.sqrt(c));
    }
}
```
