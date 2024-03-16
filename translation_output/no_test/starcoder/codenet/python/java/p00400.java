<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n=int(input())
if(n>=65 and n<=90):
    print("1")
elif(n>=97 and n<=122):
    print("2")
else:
    print("0")

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=65 && n<=90)
            System.out.println("1");
        else if(n>=97 && n<=122)
            System.out.println("2");
        else
            System.out.println("0");
    }
}
```
<|endoftext|>
