<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 5

Expected output:
Ye

```
a,b,c = map(int,input().split())
if a == b and b!= c:
  print("Yes")
elif b == c and a!= b:
  print("Yes")
elif a == c and a!= b:
  print("Yes")
else:
  print("No")
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b && b!=c)
            System.out.println("Yes");
        else if(b==c && a!=b)
            System.out.println("Yes");
        else if(a==c && a!=b)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
```
<|endoftext|>
