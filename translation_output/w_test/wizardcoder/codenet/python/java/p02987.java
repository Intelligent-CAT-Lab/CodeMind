Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ASSA

Expected output:
Yes


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
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        int flag = 0;
        if(arr[0]==arr[1] && arr[2]==arr[3]):
            flag = 1;
        else if(arr[0]==arr[2] && arr[1]==arr[3]):
            flag = 1;
        else if(arr[0]==arr[3] && arr[1]==arr[2]):
            flag = 1;
        else:
            flag = 0;
        if(arr[0]==arr[1] && arr[0]==arr[2] && arr[0]==arr[3]):
            flag = 0;
        if(flag==1):
            System.out.println("Yes");
        else:
            System.out.println("No");
    }
}
```<|endoftext|>
