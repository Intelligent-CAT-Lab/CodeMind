<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
6-s

```
n = input()

sn = 0

for i in range(len(n)):
    sn += int(n[i])


if (int(n) % sn == 0):
    print("Yes")
else:
    print("No")

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<n.length();i++){
            sum += n.charAt(i)-'0';
        }
        if(n%sum==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
```
'''
<|endoftext|>
