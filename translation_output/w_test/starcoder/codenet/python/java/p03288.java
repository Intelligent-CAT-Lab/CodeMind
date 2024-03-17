<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1199

Expected output:
ABC


```
n = int(input())
if(n < 1200):
    print("ABC")
elif(n < 2800):
    print("ARC")
else:
    print("AGC")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 1200){
            System.out.println("ABC");
        }
        else if(n < 2800){
            System.out.println("ARC");
        }
        else{
            System.out.println("AGC");
        }
    }
}
```
'''
<|endoftext|>
