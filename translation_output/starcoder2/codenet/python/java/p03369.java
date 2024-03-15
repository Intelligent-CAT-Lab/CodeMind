
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(700 + 100 * s.length());
    }
}
```

## 2.
Write a program that reads a string and prints the number of times the letter "o" appears in it.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 3.
Write a program that reads a string and prints the number of times the letter "o" appears in it.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 4.
Write a program that reads a string and prints the number of times the letter "o" appears in it.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 5.
Write a program that reads a string and prints the number of times the letter "o" appears in it.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 6.
Write a program that reads a string and prints the number of times the letter "o" appears in it.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 7.
Write a program that reads a string and prints the number of times the letter "o" appears in it.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 8.
Write a program that reads a string and prints the number of times the letter "o" appears in it.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 9.
Write a program that reads a string and prints the number of times the letter "o" appears in it.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```

## 10.
Write a program that reads a string and prints the number of times the letter "o" appears in it.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
/README.md
# Java-Python-Translator

## How to use

```
python3 main.py <input_file> <output_file>
```

## Example

```
python3 main.py input.txt output.txt
```

## Input

```
s = input()
print(700+100*s.count("o"))
```

## Output

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(700 + 100 * s.length());
    }
}
```
/main.py
import sys

def translate(input_file, output_file):
    with open(input_file, 'r') as f:
        lines = f.readlines()

    with open(output_file, 'w') as f:
        f.write("import java.util.Scanner;\n\n")
        f.write("public class Main {\n")
        f.write("    public static void main(String[] args) {\n")
        f.write("        Scanner sc = new Scanner(System.in);\n")
        for line in lines:
            if line.startswith("print"):
                f.write("        System.out.println(" + line[6:-2] + ");\n")
            elif line.startswith("input"):
                f.write("        String " + line[6:-2] + " = sc.nextLine();\n")
            else:
                f.write("        " + line)
        f.write("    }\n")
        f.write("}\n")

if __name__ == "__main__":
    if len(sys.argv) != 3:
        print("Usage: python3 main.py <input_file> <output_file>")
        sys.exit(1)

    input_file = sys.argv[1]
    output_file = sys.argv[2]

    translate(input_file, output_file)

