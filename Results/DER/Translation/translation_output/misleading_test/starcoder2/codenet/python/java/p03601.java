

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] list = input.split(" ");
        int[] listInt = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            listInt[i] = Integer.parseInt(list[i]);
        }
        int e = listInt[4];
        int f = listInt[5];
        int a = listInt[0];
        int b = listInt[1];
        int c = listInt[2];
        int d = listInt[3];
        int[] listx = new int[10000];
        int[] listy = new int[10000];
        int lengthx = 0;
        int lengthy = 0;
        for (int i = 0; i < 10000; i++) {
            int x = i * a * 100;
            if (x > f) {
                break;
            }
            for (int j = 0; j < 10000; j++) {
                int y = j * b * 100;
                if (x + y > f) {
                    break;
                }
                if (x + y == 0) {
                    continue;
                }
                listx[lengthx] = x + y;
                lengthx++;
            }
        }
        double f2 = f * e / (100.0 + e);
        for (int i = 0; i < 10000; i++) {
            int x = i * c;
            if (x > f2) {
                break;
            }
            for (int j = 0; j < 10000; j++) {
                int y = j * d;
                if (x + y > f2) {
                    break;
                }
                listy[lengthy] = y;
                lengthy++;
            }
        }
        int xy_max = 0;
        int y_max = 0;
        double noudo_max = 0;
        for (int i = 0; i < lengthx; i++) {
            for (int j = 0; j < lengthy; j++) {
                int x = listx[i];
                int y = listy[j];
                if (x + y > f) {
                    continue;
                }
                if (y * 100.0 / x <= e) {
                    double noudo = y / (x + y);
                    if (noudo >= noudo_max) {
                        xy_max = x + y;
                        y_max = y;
                        noudo_max = noudo;
                    }
                }
            }
        }
        System.out.println(xy_max + " " + y_max);
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times that the string "bob" occurs in the string, so for example, if the input is:

```
azcbobobegghakl
```

the output should be:

```
Number of times bob occurs is: 2
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            if (input.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        System.out.println("Number of times bob occurs is: " + count);
    }
}
```

## 3. 
Write a program that prints the longest substring of s in which the letters occur in alphabetical order. For example, if s = 'azcbobobegghakl', then your program should print:

```
Longest substring in alphabetical order is: beggh
```

In the case of ties, print the first substring. For example, if s = 'abcbcd', then your program should print:

```
Longest substring in alphabetical order is: abc
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String longest = "";
        String current = "";
        for (int i = 0; i < input.length(); i++) {
            if (i == 0) {
                current = input.substring(i, i + 1);
            } else {
                if (input.charAt(i) >= input.charAt(i - 1)) {
                    current += input.substring(i, i + 1);
                } else {
                    if (current.length() > longest.length()) {
                        longest = current;
                    }
                    current = input.substring(i, i + 1);
                }
            }
        }
        if (current.length() > longest.length()) {
            longest = current;
        }
        System.out.println("Longest substring in alphabetical order is
