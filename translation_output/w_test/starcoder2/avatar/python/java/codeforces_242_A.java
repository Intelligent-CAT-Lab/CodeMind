

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    count++;
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println(count);
    }
}
```


```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
```
/01-basic-syntax/01-max-of-n-numbers.md
# Max of N numbers

Write a program to find the maximum of N numbers.

Input:

The first line contains an integer N.

The next line contains N space separated integers.

Output:

Print the maximum of the N numbers.

Sample Input:

5

1 2 3 4 5

Sample Output:

5

```
n = int ( input ( ) )
a = [ int ( i ) for i in input ( ) . split ( ) ]
print ( max ( a ) )
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
```

## 2.

Write a program to find the maximum of N numbers.

Input:

The first line contains an integer N.

The next line contains N space separated integers.

Output:

Print the maximum of the N numbers.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
```
/01-basic-syntax/02-max-of-n-numbers-2.md
# Max of N numbers 2

Write a program to find the maximum of N numbers.

Input:

The first line contains an integer N.

The next line contains N space separated integers.

Output:

Print the maximum of the N numbers.

Sample Input:

5

1 2 3 4 5

Sample Output:

5

```
n = int ( input ( ) )
a = [ int ( i ) for i in input ( ) . split ( ) ]
print ( max ( a ) )
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
```

## 2.

Write a program to find the maximum of N numbers.

Input:

The first line contains an integer N.

The next line contains N space separated integers.

Output:

Print the maximum of the N numbers.

Sample Input:

5

1 2 3 4 5

Sample Output:

5/01-basic-syntax/03-sum-of-n-numbers.md
# Sum of N numbers

Write a program to find the sum of N numbers.

Input:

The first line contains an integer N.

The next line contains N space separated integers.

Output:

Print the sum of the N numbers.

Sample Input:

5

1 2 3 4 5

Sample Output:

15

```
n = int ( input ( ) )
a = [ int ( i ) for i in input ( ) . split ( ) ]
print ( sum ( a ) )
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```

## 2.

Write a program to find the sum of N numbers.

Input:

The first line contains an integer N.

The next line contains N space separated integers.

Output:

Print the sum of the N numbers.

Sample Input:

5

1 2 3 4 5

Sample Output:

15

```
n = int ( input ( ) )
a = [ int ( i ) for i in input ( ) . split ( ) ]
print ( sum ( a ) )
```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
```
/01-basic-syntax/04-sum-of-n-numbers-2.md
# Sum of N numbers 2

Write a program to find the sum of N numbers.

Input:

The first line contains an integer N.

The next line contains N space separated integers.

Output:

Print the sum of the N numbers.

Sample Input:

5

1 2 3 4 5

Sample Output:

15

```
n = int ( input ( ) )
a = [ int ( i ) for
