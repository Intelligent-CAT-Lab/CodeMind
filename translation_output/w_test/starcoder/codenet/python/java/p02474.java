<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 8

Expected output:
40


```
a=raw_input().split()
print(int(a[0])*int(a[1]))


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] a=sc.nextLine().split(" ");
        System.out.println(Integer.parseInt(a[0])*Integer.parseInt(a[1]));
    }
}
```
<|endoftext|>
