
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        code = code.replace(",", "");
        code = code.replace(".", "");
        String[] codeArray = code.split(" ");
        String[] list = new String[codeArray.length];
        int count = 0;
        for (int i = 0; i < codeArray.length; i++) {
            if (codeArray[i].length() >= 3 && codeArray[i].length() <= 6) {
                list[count] = codeArray[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
```

## 3.
Write a program that reads a string and prints the number of vowels and consonants in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println("vowel: " + vowel);
        System.out.println("consonant: " + consonant);
    }
}
```

## 4.
Write a program that reads a string and prints the number of words in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        System.out.println(strArray.length);
    }
}
```

## 5.
Write a program that reads a string and prints the number of digits in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 6.
Write a program that reads a string and prints the number of upper case letters in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7.
Write a program that reads a string and prints the number of lower case letters in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 8.
Write a program that reads a string and prints the number of spaces in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9.
Write a program that reads a string and prints the number of punctuations in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '!' || str.charAt(i) == '?' || str.charAt(i) == ';' || str.charAt(i) == ':') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 10.
Write a program that reads a string and prints the number of alphabets in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 11.
Write a program that reads a string and prints the number of alphabets, digits, spaces, and punctuations in the string.

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int alpha = 0;
        int digit = 0;
        int space = 0;
        int punc = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                alpha++;
            } else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                digit++;
            } else if (str.charAt(i) == ' ') {
                space++;
            } else {
                punc++;
            }
        }
        System.out.println("alpha: " + alpha);
        System.out.println("digit: " + digit);
        System.out.println("space: " + space);
        System.out.println("punc: " + punc);
    }
}
```

## 12.
Write a program that reads a string and prints the number of alphabets,
