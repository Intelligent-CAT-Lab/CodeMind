<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.print("Enter d: ");
        int d = scanner.nextInt();
        int flag = 0;
        if(a==b && c==d){
            flag = 1;
        }
        else if(a==c && b==d){
            flag = 1;
        }
        else if(a==d && b==c){
            flag = 1;
        }
        else{
            flag = 0;
        }
        if(a==b && a==c && a==d){
            flag = 0;
        }
        if(flag==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
```</s>
