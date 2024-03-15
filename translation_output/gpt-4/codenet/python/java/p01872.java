Below is the Java translation of your given Python code:

```java
public class NumberCheck {
    public static boolean isCorrect(String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(fixedNumber.substring(i, i + 1)) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(fixedNumber.substring(i, i + 1)) * (i - 5);
        }
        int last = 11 - score % 11;
        if (String.valueOf(last).equals(fixedNumber.substring(0, 1)) 
            || (last >= 10 && fixedNumber.charAt(0) == '0')) {
            return true;
        } else {
            return false;
        }
    }
    
    public static Integer check(String s) {
        int index = s.indexOf('?');
        int cnt = 0;
        Integer ret = null; 
        for (int i = 0; i < 10; i++) {
            String c = String.valueOf(i);
            String fixedNumber = s.substring(0, index) + c + s.substring(index + 1);
            if (isCorrect(fixedNumber)) {
                cnt++;
                ret = i;
            }
        }
        if (cnt == 1) {
            return ret;
        } else {
            return null;
        }
    }
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = new StringBuilder(scanner.next()).reverse().toString();
        Integer ans = check(input);
        System.out.println(ans != null ? ans : "MULTIPLE");
        scanner.close();
    }
}
```
The main class is named `NumberCheck` which contains two static methods: `isCorrect` and `check`, replicating the functionality of your Python functions. The `main` method now incorporates a scanner to read from the standard input, processes the string by reversing it and then calls the `check` method. The result is printed according to whether a single solution is found or not.

Please note that the function names have been adjusted slightly to match Java naming conventions. Additionally, I have modified the function `check` to return an `Integer` object instead of an `int` to allow for the `null` return when no unique replacement digit can be found.
