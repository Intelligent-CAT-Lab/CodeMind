
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] s_frq_dict = new int[3];
        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            if (s == 'a') {
                s_frq_dict[0]++;
            } else if (s == 'b') {
                s_frq_dict[1]++;
            } else if (s == 'c') {
                s_frq_dict[2]++;
            }
        }
        int max = 0;
        int min = 1000000000;
        for (int i = 0; i < s_frq_dict.length; i++) {
            if (s_frq_dict[i] > max) {
                max = s_frq_dict[i];
            }
            if (s_frq_dict[i] < min) {
                min = s_frq_dict[i];
            }
        }
        if (max - min <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

## 10. 
Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

### Input
A string.

### Output
An integer.

### Example
```
Input:
abacabadabacaba

Output:
5
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 11. 
Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

### Input
A string.

### Output
An integer.

### Example
```
Input:
abacabadabacaba

Output:
5
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 12. 
Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

### Input
A string.

### Output
An integer.

### Example
```
Input:
abacabadabacaba

Output:
5
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 13. 
Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

### Input
A string.

### Output
An integer.

### Example
```
Input:
abacabadabacaba

Output:
5
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 14. 
Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

### Input
A string.

### Output
An integer.

### Example
```
Input:
abacabadabacaba

Output:
5
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 15. 
Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

### Input
A string.

### Output
An integer.

### Example
```
Input:
abacabadabacaba

Output:
5
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 16. 
Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

### Input
A string.

### Output
An integer.

### Example
```
Input:
abacabadabacaba

Output:
5
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 17. 
Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

### Input
A string.

### Output
An integer.

### Example
```
Input:
abacabadabacaba

Output:
5
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 18. 
Write a program that reads a string and prints the number of times that the letter 'a' appears in it.

### Input
A string.

### Output
An integer.

### Example
```
Input:
abacabadabacaba

Output:
5
```

### Solution
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count =
