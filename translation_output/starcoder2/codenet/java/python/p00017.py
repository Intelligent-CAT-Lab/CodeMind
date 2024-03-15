
```
import re

while True:
    try:
        s = input()
        for i in range(26):
            converted = ""
            for j in range(len(s)):
                c = s[j]
                if c >= 'a' and c <= 'z':
                    converted += chr(ord(c) + i) if ord(c) + i <= ord('z') else chr(ord(c) + i - 26)
                else:
                    converted += c
            if re.search(r'the|this|that', converted):
                print(converted)
                break
    except EOFError:
        break
```

## 00018

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00018 {

    public static void main(String[] args) {
        new p00018().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\n]+");
        while (sc.hasNext()) {
            String S = sc.next();
            int[] count = new int[26];
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    count[c - 'a']++;
                }
            }
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    System.out.println((char) (i + 'a') + " " + count[i]);
                }
            }
        }
    }
}
```

python code:
```
while True:
    try:
        s = input()
        count = [0] * 26
        for i in range(len(s)):
            c = s[i]
            if c >= 'a' and c <= 'z':
                count[ord(c) - ord('a')] += 1
        for i in range(26):
            if count[i] > 0:
                print(chr(i + ord('a')), count[i])
    except EOFError:
        break
```

## 00019

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00019 {

    public static void main(String[] args) {
        new p00019().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\n]+");
        while (sc.hasNext()) {
            String S = sc.next();
            int[] count = new int[26];
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    count[c - 'a']++;
                }
            }
            int max = 0;
            for (int i = 0; i < 26; i++) {
                if (count[i] > max) {
                    max = count[i];
                }
            }
            for (int i = 0; i < 26; i++) {
                if (count[i] == max) {
                    System.out.println((char) (i + 'a') + " " + count[i]);
                }
            }
        }
    }
}
```

python code:
```
while True:
    try:
        s = input()
        count = [0] * 26
        for i in range(len(s)):
            c = s[i]
            if c >= 'a' and c <= 'z':
                count[ord(c) - ord('a')] += 1
        max = 0
        for i in range(26):
            if count[i] > max:
                max = count[i]
        for i in range(26):
            if count[i] == max:
                print(chr(i + ord('a')), count[i])
    except EOFError:
        break
```

## 00020

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00020 {

    public static void main(String[] args) {
        new p00020().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\n]+");
        while (sc.hasNext()) {
            String S = sc.next();
            int[] count = new int[26];
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    count[c - 'a']++;
                }
            }
            int max = 0;
            for (int i = 0; i < 26; i++) {
                if (count[i] > max) {
                    max = count[i];
                }
            }
            for (int i = 0; i < 26; i++) {
                if (count[i] == max) {
                    System.out.println((char) (i + 'a') + " " + count[i]);
                }
            }
        }
    }
}
```

python code:
```
while True:
    try:
        s = input()
        count = [0] * 26
        for i in range(len(s)):
            c = s[i]
            if c >= 'a' and c <= 'z':
                count[ord(c) - ord('a')] += 1
        max = 0
        for i in range(26):
            if count[i] > max:
                max = count[i]
        for i in range(26):
            if count[i] == max:
                print(chr(i + ord('a')), count[i])
    except EOFError:
        break
```

## 00021

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p00021 {

    public static void main(String[] args) {
        new p00021().compute();
    }

    void compute() {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("[\n]+");
        while (sc.hasNext()) {
            String S = sc.next();
            int[] count = new int[26];
            for (int i = 0; i < S.length(); i++) {
                char c = S.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    count[c - 'a']++;
                }
            }
            int max = 0;
            for (int i = 0; i < 26; i++) {
                if (count[i] > max) {
                    max = count[i];
                }
            }
            for (int i = 0; i < 26; i++) {
                if (count[i] == max) {
                    System.out.println((char) (i + 'a') + " " + count[i]);
                }
            }
        }
    }
}
```

python code:
```
while True:
    try:
        s = input()
        count = [0] * 26
        for i in range(len(s)):
            c = s[i]
            if c >= 'a' and c <= 'z':
                count[ord(c) - ord('a')] += 1
        max = 0
        for i in range(26):
            if count[i] > max:
                max = count[
