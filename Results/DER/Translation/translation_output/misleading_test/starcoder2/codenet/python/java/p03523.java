
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            List<Integer> L = new ArrayList<>();
            String s = "";
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) != 'A') {
                    s += "*";
                } else {
                    if (!s.equals("")) {
                        L.add(s.length());
                        s = "";
                    }
                }
            }
            if (!s.equals("")) {
                L.add(s.length());
            }
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            b &= L.stream().mapToInt(Integer::intValue).allMatch(i -> i <= X[i]);
        }
        System.out.println("YNEOS"[not b::2]);
    }
}
```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
bobbobbobbob
```

the output is:

```
4
```

## 3.

Write a program that reads a string and prints the longest substring of s in which the letters occur in alphabetical order. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
beggh
```

## 4.

Write a program that reads a string and prints the number of vowels contained in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
5
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

## 6.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 7.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 8.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 9.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 10.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 11.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 12.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 13.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 14.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 15.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 16.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 17.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 18.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 19.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 20.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 21.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 22.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 23.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 24.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 25.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbobobegghakl
```

the output is:

```
2
```

## 26.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string. For example, if the input is:

```
azcbo
