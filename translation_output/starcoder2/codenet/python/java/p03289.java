
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int flag = 0;
        if (S.charAt(0) != 'A') {
            flag = 1;
        }
        int count = 0;
        for (int i = 2; i < S.length() - 1; i++) {
            if (S.charAt(i) == 'C') {
                count++;
            }
        }
        if (count != 1) {
            flag = 1;
        }
        int count2 = 0;
        for (int i = 0; i < S.length(); i++) {
            if (Character.isUpperCase(S.charAt(i))) {
                count2++;
            }
        }
        if (count2 != 2) {
            flag = 1;
        }
        if (flag == 0) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}
```

## 10. 
Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

### Input
The first line contains a string.

### Output
Print the number of times that the string "hi" appears anywhere in the given string.

### Sample Input
```
abc hi ho hi
```

### Sample Output
```
2
```

### Hint
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 11. 
Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

### Input
The first line contains a string.

### Output
Print the number of times that the string "hi" appears anywhere in the given string.

### Sample Input
```
abc hi ho hi
```

### Sample Output
```
2
```

### Hint
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 12. 
Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

### Input
The first line contains a string.

### Output
Print the number of times that the string "hi" appears anywhere in the given string.

### Sample Input
```
abc hi ho hi
```

### Sample Output
```
2
```

### Hint
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 13. 
Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

### Input
The first line contains a string.

### Output
Print the number of times that the string "hi" appears anywhere in the given string.

### Sample Input
```
abc hi ho hi
```

### Sample Output
```
2
```

### Hint
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 14. 
Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

### Input
The first line contains a string.

### Output
Print the number of times that the string "hi" appears anywhere in the given string.

### Sample Input
```
abc hi ho hi
```

### Sample Output
```
2
```

### Hint
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 15. 
Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

### Input
The first line contains a string.

### Output
Print the number of times that the string "hi" appears anywhere in the given string.

### Sample Input
```
abc hi ho hi
```

### Sample Output
```
2
```

### Hint
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 16. 
Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

### Input
The first line contains a string.

### Output
Print the number of times that the string "hi" appears anywhere in the given string.

### Sample Input
```
abc hi ho hi
```

### Sample Output
```
2
```

### Hint
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int count = 0;
        for (int i = 0; i < S.length() - 1; i++) {
            if (S.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 17. 
Write a program that reads a string and prints the number of times that the string "hi" appears anywhere in the given string.

### Input
The first line contains a string.

### Output
Print the number of times that the string "hi" appears anywhere in the given string.

### Sample Input
```
abc hi ho hi
```

### Sample Output
```
2
```

### Hint
```java
import java.util.Scanner;

public class Main {
    public static void main(String[]
