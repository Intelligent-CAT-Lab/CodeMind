```java
import java.util.Scanner;

public class TimeDifference {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int k = sc.nextInt();

        int t1 = 60*h1 + m1;
        int t2 = 60*h2 + m2;

        System.out.println(t2 - t1 - k);
    }
}
```
