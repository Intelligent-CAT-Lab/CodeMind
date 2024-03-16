
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                a++;
            } else if (s.charAt(i) == 'b') {
                b++;
            } else if (s.charAt(i) == 'c') {
                c++;
            }
        }
        int max = Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a)));
        if (max <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

## 2.
Write a program that reads a string and prints the number of occurrences of each character in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println((char) (i + 'a') + " " + count[i]);
            }
        }
    }
}
```

## 3.
Write a program that reads a string and prints the number of occurrences of each word in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (count[i] != 0) {
                System.out.println(words[i] + " " + count[i]);
            }
        }
    }
}
```

## 4.
Write a program that reads a string and prints the number of occurrences of each word in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (count[i] != 0) {
                System.out.println(words[i] + " " + count[i]);
            }
        }
    }
}
```

## 5.
Write a program that reads a string and prints the number of occurrences of each word in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (count[i] != 0) {
                System.out.println(words[i] + " " + count[i]);
            }
        }
    }
}
```

## 6.
Write a program that reads a string and prints the number of occurrences of each word in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (count[i] != 0) {
                System.out.println(words[i] + " " + count[i]);
            }
        }
    }
}
```

## 7.
Write a program that reads a string and prints the number of occurrences of each word in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (count[i] != 0) {
                System.out.println(words[i] + " " + count[i]);
            }
        }
    }
}
```

## 8.
Write a program that reads a string and prints the number of occurrences of each word in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (count[i] != 0) {
                System.out.println(words[i] + " " + count[i]);
            }
        }
    }
}
```

## 9.
Write a program that reads a string and prints the number of occurrences of each word in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < words.length; i++) {
            if (count[i] != 0) {
                System.out.println(words[i] + " " + count[i]);
            }
       
