

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.replace(",", " "));
    }
}
```

## 2.

Write a java program to print the following pattern:

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

## 3.

Write a java program to print the following pattern:

```
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
```

## 4.

Write a java program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

```java
public class Main {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
```

## 5.

Write a java program to print the following pattern:

```
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
```

```java
public class Main {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n * 2 + " ");
                n++;
            }
            System.out.println();
        }
    }
}
```

## 6.

Write a java program to print the following pattern:

```
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
```

```java
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

## 7.

Write a java program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
11 12 13 14
7 8 9 10
4 5 6
2 3
1
```

```java
public class Main {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
```

## 8.

Write a java program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
11 12 13 14
7 8 9 10
4 5 6
2 3
1
```

```java
public class Main {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
```

## 9.

Write a java program to print the following pattern:

```
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
5 10 15 20
4 8 12
3 6 9
2 4
1
```

```java
public class Main {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n * 2 + " ");
                n++;
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n * 2 + " ");
                n++;
            }
            System.out.println();
        }
    }
}
```

## 10.

Write a java program to print the following pattern:

```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
11 12 13 14
7 8 9 10
4 5 6
2 3
1
```

```java
public class Main {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
    }
}
```

## 11.

Write a java program to print the following pattern:

```
1
2 4
3 6 9
4 8 12 16
5 10 15 20 25
5 10 15 20
4 8 12
3 6 9
2 4
1
```

```java
public class Main {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(
