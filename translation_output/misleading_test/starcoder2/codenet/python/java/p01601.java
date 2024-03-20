
```java
public class Palind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < 100000; i++) {
            if (n >= i && palind(n - i)) {
                System.out.println(n - i);
                break;
            }
            if (palind(n + i)) {
                System.out.println(n + i);
                break;
            }
        }
    }

    public static boolean palind(int n) {
        String s = String.valueOf(n);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
```

## 2.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

java code:
```java
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

java code:
```java
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

java code:
```java
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```
/README.md
# 2018-2019-1-Java-Programming-Practice

## 1.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

java code:
```java
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 2.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

java code:
```java
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

java code:
```java
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

java code:
```java
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

java code:
```java
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

java code:
```java
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to find the sum of all the numbers in a given string.

Test input:

```
123456789
```

Expected output:

```
45
```

java code:
```java
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += s.charAt(i) - '0';
            }
        }
        System.out.println(sum);
    }
}
```

## 8
