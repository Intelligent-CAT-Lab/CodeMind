

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println((a+b)/2);
    }
}
```


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
    }
}
```
/01-add-two-numbers/README.md
# Add two numbers

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
4000


```
a,b=map(int,input().split())
print(a+b)/02-add-two-numbers-with-input-validation/README.md
# Add two numbers with input validation

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
4000


```
a,b=map(int,input().split())
if a<0 or b<0:
    print("Invalid input")
else:
    print(a+b)

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 0 || b < 0) {
            System.out.println("Invalid input");
        } else {
            System.out.println(a+b);
        }
    }
}
```
/03-add-two-numbers-with-input-validation-and-exception-handling/README.md
# Add two numbers with input validation and exception handling

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
4000


```
try:
    a,b=map(int,input().split())
    if a<0 or b<0:
        print("Invalid input")
    else:
        print(a+b)
except:
    print("Invalid input")

```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a < 0 || b < 0) {
                System.out.println("Invalid input");
            } else {
                System.out.println(a+b);
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
```

