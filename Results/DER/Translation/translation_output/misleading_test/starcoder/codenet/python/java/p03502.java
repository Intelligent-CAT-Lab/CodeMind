<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
12

Expected output:
;@G

```
n = int(input())
list_N = list(str(n))
num = 0

for i in list_N:
    num += int(i)
ans = "No"

if n%num == 0:
    ans = "Yes"

print(ans)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        String ans = "No";
        String str = String.valueOf(n);
        for(int i=0;i<str.length();i++){
            sum += Integer.parseInt(str.charAt(i)+"");
        }
        if(n%sum == 0){
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>
