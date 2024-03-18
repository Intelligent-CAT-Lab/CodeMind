Here is the Python code translated into Java:

```java
public class CollectCheck {
  
  public static boolean isCollect(String fixedNumber) {
    int score = 0;
    for (int i = 1; i < 7; i++) {
      score += Character.getNumericValue(fixedNumber.charAt(i)) * (i + 1);
    }
    for (int i = 7; i < 12; i++) {
      score += Character.getNumericValue(fixedNumber.charAt(i)) * (i - 5);
    }
    int last = 11 - score % 11;
    return (last == Character.getNumericValue(fixedNumber.charAt(0)) ||
            (last >= 10 && fixedNumber.charAt(0) == '0'));
  }

  public static Integer check(String s) {
    int index = s.indexOf("?");
    int cnt = 0;
    Integer ret = null;
    for (int i = 0; i < 10; i++) {
      String fixedNumber = s.substring(0, index) + i + s.substring(index + 1);
      if (isCollect(fixedNumber)) {
        cnt++;
        ret = i;
      }
    }
    if (cnt == 1) return ret;
    else return null;
  }

  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    String input = new StringBuilder(scanner.nextLine()).reverse().toString();
    Integer ans = check(input);
    if (ans != null) {
      System.out.println(ans);
    } else {
      System.out.println("MULTIPLE");
    }
    scanner.close();
  }
}
```

Note that in Java, since we're dealing with characters and strings, we use `Character.getNumericValue()` to convert a character to its numeric value. Also, Java is strictly typed, so we return an `Integer` object instead of a primitive `int` to allow `null` as a possible return value.
