
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.length() < 26) {
            for (int i = 0; i < 26; i++) {
                char tmp = (char) (i + 'a');
                if (!s.contains(String.valueOf(tmp))) {
                    System.out.println(s + tmp);
                    return;
                }
            }
        } else {
            for (int i = 25; i >= 0; i--) {
                for (int j = s.charAt(i) + 1; j <= 'z'; j++) {
                    if (!s.substring(0, i).contains(String.valueOf((char) j))) {
                        System.out.println(s.substring(0, i) + (char) j);
                        return;
                    }
                }
            }
            System.out.println(-1);
            return;
        }
    }
}
```

## 11655

### 题目描述

ROT13 is a simple letter substitution cipher that replaces a letter with the letter 13 letters after it in the alphabet. ROT13 is an example of the Caesar cipher.

Create a function that takes a string and returns the string ciphered with Rot13. If there are numbers or special characters included in the string, they should be returned as they are. Only letters from the latin/english alphabet should be shifted, like in the original Rot13 "implementation".

### 输入描述

A string to be ciphered into Rot13.

### 输出描述

A ciphered string.

### 输入例子

```
test
```

### 输出例子

```
grfg
```

### 题目解析

题目描述很简单，就是把字符串中的字母按照ROT13加密，其他字符不变。

### 参考代码

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append((char) ((c - 'a' + 13) % 26 + 'a'));
            } else if (c >= 'A' && c <= 'Z') {
                sb.append((char) ((c - 'A' + 13) % 26 + 'A'));
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
```

## 11656

### 题目描述

Given a string, sort it in decreasing order based on the frequency of characters.

### 输入描述

A string with lowercase letters only.

### 输出描述

A sorted string.

### 输入例子

```
tree
```

### 输出例子

```
eert
```

### 题目解析

题目描述很简单，就是按照字符出现的频率降序排序。

### 参考代码

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        System.out.println(sb.toString());
    }
}
```

## 11657

### 题目描述

Given a string, return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

### 输入描述

A string.

### 输出描述

The sum of the numbers in the string.

### 输入例子

```
aa11b33
```

### 输出例子

```
44
```

### 题目解析

题目描述很简单，就是求字符串中所有数字的和。

### 参考代码

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int j = i;
                while (j < s.length() && Character.isDigit(s.charAt(j))) {
                    j++;
                }
                sum += Integer.parseInt(s.substring(i, j));
                i = j - 1;
            }
        }
        System.out.println(sum);
    }
}
```

## 11658

### 题目描述

Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping. For example, sameEnds("abXab") is "ab".

### 输入描述

A string.

### 输出描述

The longest substring that appears at both the beginning and end of the string without overlapping.

### 输入例子

```
abXab
```

### 输出例子

```
ab
```

### 题目解析

题目描述很简单，就是求字符串中最长的子串，这个子串出现在字符串的开头和结尾，并且不重叠。

### 参考代码

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int max = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String tmp = s.substring(i, j);
                if (s.startsWith(tmp) && s.endsWith(tmp) && tmp.length() > max) {
                    max =
