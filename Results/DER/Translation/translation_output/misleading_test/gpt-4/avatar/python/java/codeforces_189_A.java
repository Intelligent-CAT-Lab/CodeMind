Here is the translated code in Java:

```java
import java.util.Arrays;
import java.util.Scanner;

public class RibbonCut {

    public static void main(String[] args) {
        cutRibbon();
    }

    public static void cutRibbon() {
        Scanner scanner = new Scanner(System.in);
        String[] inputStrings = scanner.nextLine().split(" ");
        int length = Integer.parseInt(inputStrings[0]);
        int[] arr = new int[3];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(inputStrings[i + 1]);
        }
        Arrays.sort(arr);
        
        if (length % arr[0] == 0) {
            System.out.println(length / arr[0]);
            scanner.close();
            return;
        }
        
        int ans = 0;
        if (arr[0] == arr[1]) {
            int k;
            for (int i = 0; i <= length / arr[2]; i++) {
                int check = length - i * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    k = check / arr[0];
                    ans = Math.max(ans, k + i);
                }
            }
        } else {
            int k;
            for (int i = 0; i <= length / arr[2]; i++) {
                for (int j = 0; j <= length / arr[1]; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        k = check / arr[0];
                        ans = Math.max(ans, k + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
        scanner.close();
    }
}
```

This Java version takes the input from the user in a similar manner as the Python code, processes the input, calculates the answer, and prints the result to the console.
