Here's the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ABC = new int[3];
        
        for (int i = 0; i < 3; i++) {
            ABC[i] = scanner.nextInt();
        }
        
        int countOfFive = 0;
        for (int i = 0; i < 3; i++) {
            if (ABC[i] == 5) {
                countOfFive++;
            }
        }
        
        if (countOfFive == 2 && sum(ABC) == 17) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
}
```

Please note that in the Java version, we use a for-loop to count the occurrences of the number 5 in the array and to calculate the sum of the array elements. I've also created a helper method `sum` to encapsulate the logic for summing the array elements. This is because Java does not have a built-in method for counting occurrences or summing up the elements of an array as Python does with the `count` and `sum` methods.
