

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        if (h * w % 2 == 1) {
            if ((s + t) % 2 == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        } else {
            System.out.println("Yes");
        }
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

## 3.

Write a program that reads a string and prints the longest substring of the string that consists of the same letter. For example, if the input is:

```
aaabbbbccccc
```

the output is:

```
ccccc
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            if (count > max) {
                max = count;
                ans = s.substring(i, i + count);
            }
        }
        System.out.println(ans);
    }
}
```

## 4.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

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

## 5.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

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
/docs/python/python-100-days/day-01-15/day-10.md
# Day 10

## 1.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 3.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 4.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 5.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```
/docs/python/python-100-days/day-01-15/day-01.md
# Day 1

## 1.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

```python
s = input()
count = 0
for i in range(len(s) - 2):
    if s[i:i + 3] == "bob":
        count += 1
print(count)
```

## 3.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

```
