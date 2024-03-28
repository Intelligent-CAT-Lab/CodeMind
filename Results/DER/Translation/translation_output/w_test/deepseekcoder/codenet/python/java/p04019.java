<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
SENW

Expected output:
Yes


```

def main():
    s = list(input())
    s = list(set(s))
    
    if len(s)==4:
        print("Yes")
    elif len(s)==3:
        print("No")
    elif len(s)==2:
        if "N"in s and "S" in s:
            print("Yes")
        elif "E" in s and "W" in s:
            print("Yes")
        else:
            print("No")
    else:
        print("No")
if __name__=='__main__':
    main()
```

### Response:
```java
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Set<Character> set = new HashSet<>();
        for (char c : input.toCharArray()) {
            set.add(c);
        }

        if (set.size() == 4) {
            System.out.println("Yes");
        } else if (set.size() == 3) {
            System.out.println("No");
        } else if (set.size() == 2) {
            if (set.contains('N') && set.contains('S')) {
                System.out.println("Yes");
            } else if (set.contains('E') && set.contains('W')) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the input, adds each character to a `HashSet` (which automatically removes duplicates), and then checks the size of the set to determine the output.
<|EOT|>
