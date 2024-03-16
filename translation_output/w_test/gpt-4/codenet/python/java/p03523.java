```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        boolean b = s.replace("A", "").equals("KIHBR");

        if (b) {
            String replacedString = s.replaceAll("[^A]", "*");
            String[] splitArray = replacedString.split("\\*");
            int[] lengths = new int[splitArray.length];
            
            // Copying the lengths of the split parts
            for (int i = 0; i < splitArray.length; i++) {
                lengths[i] = splitArray[i].length();
            }
            
            // The initial pattern lengths without 'A'
            // K=1, I=0, H=0, B=1, R=1
            int[] patternLengths = {1, 0, 0, 0, 1, 1, 1};
            
            // Verifying if each section has appropriate number of 'A's
            for (int i = 0; i < lengths.length; i++) {
                if (lengths[i] > patternLengths[i]) {
                    b = false;
                    break;
                }
            }
        }

        // Printing the result using the "YNEOS" trick from Python
        System.out.println(b ? "YES" : "NO");
        scanner.close();
    }
}
```

This Java code is equivalent to the provided Python code and should provide the same output when given the test input "KIHBR". The principle of operation is the same: check if the string without 'A's equals "KIHBR" and then check the allowed positions of 'A's according to the pattern. Finally, the result is printed with a ternary operator instead of the Python slicing trick used in the original code.
