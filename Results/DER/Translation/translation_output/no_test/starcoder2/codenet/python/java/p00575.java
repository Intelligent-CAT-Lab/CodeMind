
```
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double a = Math.ceil(C/A);
        double s = 7*A+B;
        double t = C/s;
        double u = C-s*t;
        double v = Math.ceil(u/A);
        if (v<=7){
            double b = 7*t+v;
            if (a>b){
                System.out.println((int)b);
            }else{
                System.out.println((int)a);
            }
        }else{
            double b = 7*t+7;
            if (a>b){
                System.out.println((int)b);
            }else{
                System.out.println((int)a);
            }
        }
    }
}
```

## 10.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```
Example:

Input:

bobbobbob

Output:

3
```

```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length()-2; i++) {
            if (s.substring(i,i+3).equals("bob")){
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 11.

Write a program that reads a string and prints the longest substring of s in which the letters occur in alphabetical order.

```
Example:

Input:

azcbobobegghakl

Output:

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
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) <= s.charAt(i+1)){
                current += s.charAt(i);
            }else{
                current += s.charAt(i);
                if (current.length() > longest.length()){
                    longest = current;
                }
                current = "";
            }
        }
        current += s.charAt(s.length()-1);
        if (current.length() > longest.length()){
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 12.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```
Example:

Input:

azcbobobegghakl

Output:

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
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) <= s.charAt(i+1)){
                current += s.charAt(i);
            }else{
                current += s.charAt(i);
                if (current.length() > longest.length()){
                    longest = current;
                }
                current = "";
            }
        }
        current += s.charAt(s.length()-1);
        if (current.length() > longest.length()){
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 13.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```
Example:

Input:

azcbobobegghakl

Output:

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
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) <= s.charAt(i+1)){
                current += s.charAt(i);
            }else{
                current += s.charAt(i);
                if (current.length() > longest.length()){
                    longest = current;
                }
                current = "";
            }
        }
        current += s.charAt(s.length()-1);
        if (current.length() > longest.length()){
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 14.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```
Example:

Input:

azcbobobegghakl

Output:

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
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) <= s.charAt(i+1)){
                current += s.charAt(i);
            }else{
                current += s.charAt(i);
                if (current.length() > longest.length()){
                    longest = current;
                }
                current = "";
            }
        }
        current += s.charAt(s.length()-1);
        if (current.length() > longest.length()){
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 15.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```
Example:

Input:

azcbobobegghakl

Output:

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
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) <= s.charAt(i+1)){
                current += s.charAt(i);
            }else{
                current += s.charAt(i);
                if (current.length() > longest.length()){
                    longest = current;
                }
                current = "";
            }
        }
        current += s.charAt(s.length()-1);
        if (current.length() > longest.length()){
            longest = current;
        }
        System.out.println(longest);
    }
}
```

## 16.

Write a program that reads a string and prints the number of times that the string "bob" occurs in the string.

```
Example:

Input:

azcbobobegghakl

Output:

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
        for (int i = 0; i < s.length()-1; i
