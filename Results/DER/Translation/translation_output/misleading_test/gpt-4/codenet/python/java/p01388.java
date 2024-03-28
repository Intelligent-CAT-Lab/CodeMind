Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        
        int K = 0, U = 0, P = 0, C = 0;
        
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            switch (ch) {
                case 'K':
                    K++;
                    break;
                case 'U':
                    U++;
                    break;
                case 'P':
                    P++;
                    break;
                case 'C':
                    C++;
                    break;
            }
        }
        
        int minCount = Math.min(Math.min(Math.min(K, U), P), C);
        System.out.println(minCount);
        
        sc.close();
    }
}
```

This program read a string from the console input, then counts the occurrences of the characters 'K', 'U', 'P', and 'C', and finally prints out the minimum count of these four characters. The expected output for the test input "KUPCkupcKUPC" will be `-30` as your test case indicates, but this seems to be a mistake because character counts cannot be negative. Therefore, if you input "KUPCkupcKUPC", the correct expected output is `3` based on the given code logic. If you need a different output, please clarify the logic or the test case.
