Here is the Python code translated into Java:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ref = "AADINNUY";
        String aizu = "AIZUNYAN";
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        if (inp.length() < 8) {
            System.out.println(inp);
        } else {
            StringBuilder ans = new StringBuilder();
            int l = inp.length();
            int i = 0;
            while (i < l) {
                if (i <= l - 8 && isRefSorted(ref, inp.substring(i, i + 8))) {
                    ans.append(aizu);
                    i += 8;
                } else {
                    ans.append(inp.charAt(i));
                    i += 1;
                }
            }
            System.out.println(ans);
        }
        
        scanner.close();
    }

    private static boolean isRefSorted(String ref, String subset) {
        char[] refArray = ref.toCharArray();
        char[] subsetArray = subset.toCharArray();
        Arrays.sort(refArray);
        Arrays.sort(subsetArray);
        return Arrays.equals(refArray, subsetArray);
    }
}
```

To execute the Java program:

1. Save the code to a file named "Main.java".
2. Compile the file with `javac Main.java`.
3. Run the compiled program with `java Main`.
4. Input the test string "AIDUNYAN" (or any other string) and press Enter to see the output.

Please remember to use the exact same Java version as the system where this will be executed, or adjust the code according to the target version's features and limitations.
