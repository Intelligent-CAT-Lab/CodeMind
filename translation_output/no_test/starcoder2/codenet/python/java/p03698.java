
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    count++;
                }
            }
            if (count >= 2) {
                System.out.println("no");
                break;
            }
        }
        if (count == 1) {
            System.out.println("yes");
        }
    }
}
```

## Question 2

Write a program to print the following pattern:
```
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
```

java code:
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
```

## Question 3

Write a program to print the following pattern:
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

java code:
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
```

## Question 4

Write a program to print the following pattern:
```
1
2 3
4 5 6
10 9 8 7
11 12 13 14 15
```

java code:
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(count + i + " ");
                } else {
                    System.out.print(count + " ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
```

## Question 5

Write a program to print the following pattern:
```
1
2 3
6 5 4
10 9 8 7
11 12 13 14 15
```

java code:
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(count + i + " ");
                } else {
                    System.out.print(count + " ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
```

## Question 6

Write a program to print the following pattern:
```
1
2 3
6 5 4
10 9 8 7
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28
```

java code:
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(count + i + " ");
                } else {
                    System.out.print(count + " ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
```

## Question 7

Write a program to print the following pattern:
```
1
2 3
6 5 4
10 9 8 7
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31 32 33 34 35 36
```

java code:
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(count + i + " ");
                } else {
                    System.out.print(count + " ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
```

## Question 8

Write a program to print the following pattern:
```
1
2 3
6 5 4
10 9 8 7
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31 32 33 34 35 36
37 38 39 40 41 42 43 44 45
```

java code:
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(count + i + " ");
                } else {
                    System.out.print(count + " ");
                }
                count++;
            }
            System.out.println();
        }
    }
}
```

## Question 9

Write a program to print the following pattern:
```
1
2 3
6 5 4
10 9 8 7
11 12 13 14 15
16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31 32 33 34 35 36
37 38 39 40 41 42 43 44 45
46 47 48 49 50 51 52 53 54 55
```

java code:
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
