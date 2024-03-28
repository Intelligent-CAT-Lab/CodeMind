Here is the equivalent Java code for the provided Python code snippet along with the use of `Scanner` for input:

```java
import java.util.Arrays;
import java.util.Scanner;

public class SortAndCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[4];
        
        for (int i = 0; i < 4; i++) {
            num[i] = scanner.nextInt();
        }
        
        Arrays.sort(num);
        
        if (num[0] == num[1] && num[2] == num[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        
        scanner.close();
    }
}
```

Sample Usage:

```text
Input:  1 1 3 4
Output: no
```

To run this code, ensure your Java environment is properly set up and compile and run the `SortAndCompare` class. The program will await input, and once provided, it will output the result as per the logic defined.
