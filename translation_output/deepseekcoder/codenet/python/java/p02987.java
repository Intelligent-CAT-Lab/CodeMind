<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c,d = input()
flag = 0
if(a==b and c==d):
    flag = 1
elif(a==c and b==d):
    flag = 1
elif(a==d and b==c):
    flag = 1
else:
    flag = 0
if(a==b and a==c and a==d):
    flag = 0
if(flag==1):
    print("Yes")
else:
    print("No")
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] arr = input.toCharArray();
        int flag = 0;
        if(arr[0] == arr[1] && arr[2] == arr[3]) {
            flag = 1;
        } else if(arr[0] == arr[2] && arr[1] == arr[3]) {
            flag = 1;
        } else if(arr[0] == arr[3] && arr[1] == arr[2]) {
            flag = 1;
        }
        if(arr[0] == arr[1] && arr[0] == arr[2] && arr[0] == arr[3]) {
            flag = 0;
        }
        if(flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, converts it to a character array, and then checks if the first two characters are equal to the last two characters. If they are, it sets `flag` to 1. If the first character is equal to all three other characters, it sets `flag` to 0. Finally, it prints "Yes" if `flag` is 1 and "No" otherwise.
<|EOT|>
