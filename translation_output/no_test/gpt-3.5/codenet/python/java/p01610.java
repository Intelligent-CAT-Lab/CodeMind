```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rotation {

    public static List<String> rotate(List<String> s, char k) {
        List<String> s_ = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            s_.add(s.get(i));
        }

        if (k == 'R') {
            s_.set(0, replaceChar(s.get(0), 3, s.get(2).charAt(3)));
            s_.set(1, replaceChar(s.get(1), 3, s.get(3).charAt(3)));
            s_.set(2, replaceChar(s.get(2), 3, s.get(4).charAt(3)));
            s_.set(3, replaceChar(s.get(3), 3, s.get(5).charAt(3)));

            s_.set(4, replaceChar(s.get(4), 3, s.get(3).charAt(6)));
            s_.set(5, replaceChar(s.get(5), 3, s.get(2).charAt(6)));
            
            s_.set(3, replaceChar(s_.get(3), 6, s.get(0).charAt(3)));
            s_.set(2, replaceChar(s_.get(2), 6, s.get(1).charAt(3));
            
            char temp = s_.get(3).charAt(4);
            s_.set(3, replaceChar(s_.get(3), 4, s_.get(3).charAt(5)));
            s_.set(3, replaceChar(s_.get(3), 5, s_.get(2).charAt(5));
            s_.set(2, replaceChar(s_.get(2), 5, temp);
        } else if (k == 'L') {
            // similar logic for L rotation
        } else if (k == 'U') {
            // similar logic for U rotation
        } else if (k == 'D') {
            // similar logic for D rotation
        } else if (k == 'F') {
            // similar logic for F rotation
        } else {
            // similar logic for B rotation
        }

        return s_;
    }

    public static String replaceChar(String str, int index, char newChar) {
        if (str == null || index < 0 || index >= str.length()) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[index] = newChar;
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        List<String> s = new ArrayList<>();
        s.add("..rr....");
        s.add("..rr....");
        s.add("ggyybbww");
        s.add("ggyybbww");
        s.add("..oo....");
        s.add("..oo....");

        for (int i = 0; i < a.length(); i++) {
            s = rotate(s, a.charAt(i));
        }

        for (String row : s) {
            System.out.println(row);
        }
    }
}
```
```
