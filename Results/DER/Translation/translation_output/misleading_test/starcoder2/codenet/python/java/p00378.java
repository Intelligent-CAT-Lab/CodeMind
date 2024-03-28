

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        int k = (X / 1000);
        int ans = k * Math.min(A, 2 * B);
        int r = X - 1000 * k;
        if (0 < r && r <= 500) {
            ans += Math.min(A, B);
        } else if (500 < r) {
            ans += Math.min(A, 2 * B);
        }
        System.out.println(ans);
    }
}

```

## 2.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

Test input:

```
bobbobbobbob
```

Expected output:

```
4
```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
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

Write a program that prints the longest substring of a string in which the letters occur in alphabetical order.

Test input:

```
azcbobobegghakl
```

Expected output:

```
beggh
```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String longest = "";
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                current += s.charAt(i);
            } else {
                if (s.charAt(i) >= s.charAt(i - 1)) {
                    current += s.charAt(i);
                } else {
                    if (current.length() > longest.length()) {
                        longest = current;
                    }
                    current = "" + s.charAt(i);
                }
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println(longest);
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        int k = (X / 1000);
        int ans = k * Math.min(A, 2 * B);
        int r = X - 1000 * k;
        if (0 < r && r <= 500) {
            ans += Math.min(A, B);
        } else if (500 < r) {
            ans += Math.min(A, 2 * B);
        }
        System.out.println(ans);
    }
}

