
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(dfs(0, new int[]{0}, s, 0));
    }

    public static int dfs(int i, int[] sep, String s, int tot) {
        int n = s.length();
        i += 1;

        // ææ·±é¨ã¾ã§å°éããæ
        if (i == n) {
            int ans = 0;
            if (sep.length > 1) {
                for (int j = 0; j < sep.length - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep[j], sep[j + 1]));
                }
            }
            ans += Integer.parseInt(s.substring(sep[sep.length - 1]));
            return ans;
        }

        // içªç®ã«+ãå¥ããæ
        int[] sep_copy = sep.clone();
        sep_copy = Arrays.copyOf(sep_copy, sep_copy.length + 1);
        sep_copy[sep_copy.length - 1] = i;
        tot += dfs(i, sep_copy, s, 0);

        // içªç®ã«+ãå¥ããªãæ
        sep_copy = Arrays.copyOf(sep, sep.length - 1);
        tot += dfs(i, sep_copy, s, 0);

        return tot;
    }
}
```

## 10. 
Write a program that reads a string and prints the number of times that the string a occurs in the string, with an overlap. For example, the string aab occurs three times in the string aabaab.

```
input: aabaab
output: 3
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(count(s, "a"));
    }

    public static int count(String s, String t) {
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            int j = 0;
            while (j < t.length() && i + j < s.length() && s.charAt(i + j) == t.charAt(j)) {
                j++;
            }
            if (j == t.length()) {
                ans++;
            }
            i++;
        }
        return ans;
    }
}
```

## 11. 
Write a program that reads a string and prints the number of times that the string a occurs in the string, without overlap. For example, the string aab occurs two times in the string aabaab.

```
input: aabaab
output: 2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(count(s, "a"));
    }

    public static int count(String s, String t) {
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            int j = 0;
            while (j < t.length() && i + j < s.length() && s.charAt(i + j) == t.charAt(j)) {
                j++;
            }
            if (j == t.length()) {
                ans++;
                i += j;
            } else {
                i++;
            }
        }
        return ans;
    }
}
```

## 12. 
Write a program that reads a string and prints the number of times that the string a occurs in the string, without overlap. For example, the string aab occurs two times in the string aabaab.

```
input: aabaab
output: 2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(count(s, "a"));
    }

    public static int count(String s, String t) {
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            int j = 0;
            while (j < t.length() && i + j < s.length() && s.charAt(i + j) == t.charAt(j)) {
                j++;
            }
            if (j == t.length()) {
                ans++;
                i += j;
            } else {
                i++;
            }
        }
        return ans;
    }
}
```

## 13. 
Write a program that reads a string and prints the number of times that the string a occurs in the string, without overlap. For example, the string aab occurs two times in the string aabaab.

```
input: aabaab
output: 2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(count(s, "a"));
    }

    public static int count(String s, String t) {
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            int j = 0;
            while (j < t.length() && i + j < s.length() && s.charAt(i + j) == t.charAt(j)) {
                j++;
            }
            if (j == t.length()) {
                ans++;
                i += j;
            } else {
                i++;
            }
        }
        return ans;
    }
}
```

## 14. 
Write a program that reads a string and prints the number of times that the string a occurs in the string, without overlap. For example, the string aab occurs two times in the string aabaab.

```
input: aabaab
output: 2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(count(s, "a"));
    }

    public static int count(String s, String t) {
        int ans = 0;
        int i = 0;
        while (i < s.length()) {
            int j = 0;
            while (j < t.length() && i + j < s.length() && s.charAt(i + j) == t.charAt(j)) {
                j++;
            }
            if (j == t.length()) {
                ans++;
                i += j;
            } else {
                i++;
            }
        }
        return ans;
    }
}
```

## 15. 
Write a program that reads a string and
