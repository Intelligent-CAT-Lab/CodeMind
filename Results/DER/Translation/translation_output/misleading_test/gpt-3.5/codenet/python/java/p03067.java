```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a < c && c < b) || (a > c && c > b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        int c = 5;

        if ((a < c && c < b) || (a > c && c > b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 7;

        if ((a < c && c < b) || (a > c && c > b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```
