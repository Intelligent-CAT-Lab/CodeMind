
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] memory = new int[10];
        String r = "";
        for (int i = 30; i < 121; i += 10) {
            for (int j = 0; j < i; j++) {
                r += "+";
            }
            r += ">";
        }
        r += "<".repeat(10);
        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = (c - '0') / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r += ">".repeat(d);
            } else {
                r += "<".repeat(d);
            }
            point = n;
            int l = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                r += "+".repeat(l);
            } else {
                r += "-".repeat(l);
            }
            memory[point] = c;
            r += ".";
        }
        System.out.println(r);
    }
}
```

## 2.

Write a program that takes a string and returns the number of vowels in the string.

```python
def vowel_count(s):
    return len([i for i in s if i in 'aeiou'])
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.

Write a program that takes a string and returns the number of consonants in the string.

```python
def consonant_count(s):
    return len([i for i in s if i not in 'aeiou'])
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.

Write a program that takes a string and returns the number of words in the string.

```python
def word_count(s):
    return len(s.split())
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
```

## 5.

Write a program that takes a string and returns the number of words in the string.

```python
def word_count(s):
    return len(s.split())
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
```

## 6.

Write a program that takes a string and returns the number of words in the string.

```python
def word_count(s):
    return len(s.split())
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
```

## 7.

Write a program that takes a string and returns the number of words in the string.

```python
def word_count(s):
    return len(s.split())
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
```

## 8.

Write a program that takes a string and returns the number of words in the string.

```python
def word_count(s):
    return len(s.split())
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
```

## 9.

Write a program that takes a string and returns the number of words in the string.

```python
def word_count(s):
    return len(s.split())
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
```

## 10.

Write a program that takes a string and returns the number of words in the string.

```python
def word_count(s):
    return len(s.split())
```

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);
    }
}
```

## 11.

Write a program that takes a string and returns the number of words in the string.

```python
def word_count(s):
    return len(s.split())
```

```java
public
