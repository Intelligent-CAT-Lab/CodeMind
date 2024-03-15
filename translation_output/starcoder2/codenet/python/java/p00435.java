
```
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String list = "";
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == 'C') {
                list += 'Z';
            } else if (w.charAt(i) == 'B') {
                list += 'Y';
            } else if (w.charAt(i) == 'A') {
                list += 'X';
            } else {
                list += (char) (w.charAt(i) - 3);
            }
        }
        System.out.println(list);
    }
}
```

## 2.
Write a program that takes a string and returns the number of times that the string "hi" appears anywhere in the given string.

```
count_hi('abc hi ho') → 1
count_hi('ABChi hi') → 2
count_hi('hihi') → 2
```

```
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        int count = 0;
        for (int i = 0; i < w.length() - 1; i++) {
            if (w.charAt(i) == 'h' && w.charAt(i + 1) == 'i') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```


```
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String list = "";
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == 'C') {
                list += 'Z';
            } else if (w.charAt(i) == 'B') {
                list += 'Y';
            } else if (w.charAt(i) == 'A') {
                list += 'X';
            } else {
                list += (char) (w.charAt(i) - 3);
            }
        }
        System.out.println(list);
    }
}
```

## 2.
Write a program that takes a string and returns the number of times that the string "hi" appears anywhere in the given string.

```
count_hi('abc hi ho') → 1
count_hi('ABChi hi') → 2
count_hi('hihi') → 2
```

```
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        int count = 0;
        for (int i = 0; i < w.length() - 1; i++) {
            if (w.charAt(i) == 'h' && w.charAt(i + 1) == 'i') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/README.md
# Python to Java

## 1.
Translate the following python code to java and enclose your solution inside ```java```:
```
w=input()
list=[]
for i in range(len(w)):
    if w[i]=='C':
        list.append('Z')
        
    elif w[i]=='B':
        list.append('Y')
        
    elif w[i]=='A':
        list.append('X')
    else:
        c=ord(w[i])-3
        list.append(chr(c))
l=''.join(list)
print(l)
    

```
