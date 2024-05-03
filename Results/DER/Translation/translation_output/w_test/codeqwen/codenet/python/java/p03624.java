Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "atcoderregularcontest";
        char[] s2 = s.toCharArray();
        Set<Character> s3 = new HashSet<>();
        for (char c : s2) {
            s3.add(c);
        }
        char[] s4 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] s5 = new char[s4.length];
        int j = 0;
        for (char c : s3) {
            s5[j++] = c;
        }
        Arrays.sort(s5);
        if (Arrays.equals(s5, s4)) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s5.length; i++) {
                if (s5[i] != s4[i]) {
                    System.out.println(s4[i]);
                    break;
                }
                if (i == s5.length - 1) {
                    System.out.println(s4[i + 1]);
                }
            }
        }
    }
}
```

This Java code does the same thing as your Python code. It first converts the input string to a character array, then creates a HashSet from this array to remove duplicate characters. It then creates another character array from the HashSet and sorts it. If the sorted array is equal to the sorted character array of all lowercase English letters, it prints "None". Otherwise, it prints the first character in the sorted array that is not in the sorted character array of all lowercase English letters.
