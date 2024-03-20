
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                System.out.println(i + 1 + " " + (i + 2));
                System.exit(0);
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                System.out.println(i + 1 + " " + (i + 3));
                System.exit(0);
            }
        }
        System.out.println(-1 + " " + -1);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbob
```

the output is:

```
3
```

Test input:

```
bobbobbob
```

Expected output:

```
3
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/2019-2020/2019-2020-1/2019-2020-1-1.md
# 2019-2020-1-1

## 1.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbob
```

the output is:

```
3
```

Test input:

```
bobbobbob
```

Expected output:

```
3
```

python code:
```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbob
```

the output is:

```
3
```

Test input:

```
bobbobbob
```

Expected output:

```
3
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```


```
1
```

python code:
```python
s = input()
count = 0
for i in range(len(s) - 1):
    if s[i] == s[i + 1]:
        count += 1
print(count)
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbob
```

the output is:

```
3
```

Test input:

```
bobbobbob
```

Expected output:

```
3
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/2019-2020/2019-2020-1/2019-2020-1-2.md
# 2019-2020-1-2

## 1.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbob
```

the output is:

```
3
```

Test input:

```
bobbobbob
```

Expected output:

```
3
```

python code:
```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbob
```

the output is:

```
3
```

Test input:

```
bobbobbob
```

Expected output:

```
3
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 1.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbob
```

the output is:

```
3
```

Test input:

```
bobbobbob
```

Expected output:

```
3
```

python code:
```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbob
```

the output is:

```
3
```

Test input:

```
bobbobbob
```

Expected output:

```
3
```

java code:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 1.

Write a program
