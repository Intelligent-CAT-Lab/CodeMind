<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 3 1 1

Expected output:
100
10
1
41

```
h,w,a,b = map(int,input().split())
for i in range(h):
    if i < b:
        print("".join(["0"]*a+["1"]*(w-a)))
    else:
        print("".join(["1"]*a+["0"]*(w-a)))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0;i<h;i++){
            if(i<b){
                System.out.println(new String(new char[a]).replace("\0", "1")+new String(new char[w-a]).replace("\0", "0"));
            }else{
                System.out.println(new String(new char[a]).replace("\0", "0")+new String(new char[w-a]).replace("\0", "1"));
            }
        }
    }
}
```
<|endoftext|>
