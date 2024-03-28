
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = S;
        }
        if (S == 1000000000) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = 1000000000;
            }
        }
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3. 
Write a program that reads a string and prints the longest substring of the string that consists of the same character. For example, if the input is:

```
aaabbbbccccc
```

the output is:

```
ccccc
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 4. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5. 
Write a program that reads a string and prints the longest substring of the string that consists of the same character. For example, if the input is:

```
aaabbbbccccc
```

the output is:

```
ccccc
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 6. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7. 
Write a program that reads a string and prints the longest substring of the string that consists of the same character. For example, if the input is:

```
aaabbbbccccc
```

the output is:

```
ccccc
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 8. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9. 
Write a program that reads a string and prints the longest substring of the string that consists of the same character. For example, if the input is:

```
aaabbbbccccc
```

the output is:

```
ccccc
```

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j <
