<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n = input()

a = int(n[0])
b = int(n[1])
c = int(n[2])
d = int(n[3])

if (a+b+c+d) == 7:
    print(a, "+",b, "+",c, "+", d, "=7", sep="")
elif (a+b+c-d) == 7:
    print(a, "+",b, "+",c, "-", d, "=7", sep="")
elif (a+b-c+d) == 7:
    print(a, "+",b, "-",c, "+", d, "=7", sep="")
elif (a+b-c-d) == 7:
    print(a, "+",b, "-",c, "-", d, "=7", sep="")
elif (a-b+c+d) == 7:
    print(a, "-",b, "+",c, "+", d, "=7", sep="")
elif (a-b+c-d) == 7:
    print(a, "-",b, "+",c, "-", d, "=7", sep="")
elif (a-b-c+d) == 7:
    print(a, "-",b, "-",c, "+", d, "=7", sep="")
elif (a-b-c-d) == 7:
    print(a, "-",b, "-",c, "-", d, "=7", sep="")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int a = Integer.parseInt(n.substring(0,1));
        int b = Integer.parseInt(n.substring(1,2));
        int c = Integer.parseInt(n.substring(2,3));
        int d = Integer.parseInt(n.substring(3,4));
        if(a+b+c+d==7) System.out.println(a+" + "+b+" + "+c+" + "+d+" = 7");
        else if(a+b+c-d==7) System.out.println(a+" + "+b+" + "+c+" - "+d+" = 7");
        else if(a+b-c+d==7) System.out.println(a+" + "+b+" - "+c+" + "+d+" = 7");
        else if(a+b-c-d==7) System.out.println(a+" + "+b+" - "+c+" - "+d+" = 7");
        else if(a-b+c+d==7) System.out.println(a+" - "+b+" + "+c+" + "+d+" = 7");
        else if(a-b+c-d==7) System.out.println(a+" - "+b+" + "+c+" - "+d+" = 7");
        else if(a-b-c+d==7) System.out.println(a+" - "+b+" - "+c+" + "+d+" = 7");
        else if(a-b-c-d==7) System.out.println(a+" - "+b+" - "+c+" - "+d+" = 7");
    }
}
```
<|endoftext|>
