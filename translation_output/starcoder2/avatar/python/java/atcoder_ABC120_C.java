
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int num_0 = 0;
        int num_1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                num_0++;
            } else {
                num_1++;
            }
        }
        System.out.println(Math.min(num_0, num_1) * 2);
    }
}
```

## 2.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
a.sort ( )
print ( a [ 0 ] , a [ 1 ] )
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(a[0] + " " + a[1]);
    }
}
```

## 3.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
a.sort ( )
print ( a [ 0 ] , a [ 1 ] )
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(a[0] + " " + a[1]);
    }
}
```

## 4.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
a.sort ( )
print ( a [ 0 ] , a [ 1 ] )
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(a[0] + " " + a[1]);
    }
}
```

## 5.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
a.sort ( )
print ( a [ 0 ] , a [ 1 ] )
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(a[0] + " " + a[1]);
    }
}
```

## 6.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
a.sort ( )
print ( a [ 0 ] , a [ 1 ] )
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(a[0] + " " + a[1]);
    }
}
```

## 7.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
a.sort ( )
print ( a [ 0 ] , a [ 1 ] )
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println(a[0] + " " + a[1]);
    }
}
```

## 8.

Translate the following python code to java and enclose your solution inside ```java```:
```
n = int ( input ( ) )
a = [ int ( input ( ) ) for i in range ( n ) ]
a.sort ( )
print ( a [ 0 ] , a [ 1 ] )
```

java code
