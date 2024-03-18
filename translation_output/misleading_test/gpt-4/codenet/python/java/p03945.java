Here's the translated code from Python to Java. To achieve the same functionality as the provided Python code, I have created a Java method that counts occurrences of "WB" and "BW" in the provided string. I've also included a simple main method with the test case you've provided.

```java
public class Main {
    public static void main(String[] args) {
        String testInput = "BBBWW";
        System.out.println(countTransitions(testInput));
    }

    public static int countTransitions(String input) {
        int countWB = input.contains("WB") ? 1 : 0; // Java doesn't have a direct equivalent of Python's count here
        int countBW = input.contains("BW") ? 1 : 0; // so we are checking if "WB" or "BW" are contained in the string.
        return countWB + countBW;
    }
}
```

Notice that the given Python code is using `count()` which counts all non-overlapping occurrences of a substring, while in the Java implementation we are checking if the substrings "WB" and "BW" are present in the input string and adding 1 to the count each if they are found, under the assumption that the transitions will happen once. The Python code effectively counts individual transitions between W and B, however, if there are multiple transitions in a row (such as "BWBWBWB"), the Python implementation would count each of them whereas the Java code provided will not. If you want the exact equivalent behavior, you have to use a loop to count each occurrence. Here is the full implementation that correctly counts transitions like the Python code:

```java
public class Main {
    public static void main(String[] args) {
        String testInput = "BBBWW";
        System.out.println(countTransitions(testInput));
    }

    public static int countTransitions(String input) {
        int count = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) == 'W' && input.charAt(i + 1) == 'B') ||
                (input.charAt(i) == 'B' && input.charAt(i + 1) == 'W')) {
                count++;
            }
        }
        return count;
    }
}
```

This version of `countTransitions` will correctly count the number of transitions even if there are multiple consecutive transitions like in the case of "BWBWBWB".
