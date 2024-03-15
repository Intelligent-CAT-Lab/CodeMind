```java
import java.util.Scanner;

public class CalculateSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int salary = 800 * N - 200 * (N / 15);
        System.out.println(salary);
    }
}
```
