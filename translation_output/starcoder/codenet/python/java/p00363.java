<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
w,h,c=input().split(" ")
w=int(w)
h=int(h)
print("+"+"-"*(w-2)+"+")
for i in range(h-2):
    if i*2==h-3:
        print("|"+"."*((w-3)//2)+c+"."*((w-3)//2)+"|")
    else:
        print("|"+"."*(w-2)+"|")
print("+"+"-"*(w-2)+"+")

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int w=Integer.parseInt(s[0]);
        int h=Integer.parseInt(s[1]);
        int c=Integer.parseInt(s[2]);
        System.out.println("+"+"-"*(w-2)+"+");
        for(int i=0;i<h-2;i++){
            if(i*2==h-3){
                System.out.println("|"+"."*((w-3)/2)+c+"."*((w-3)/2)+"|");
            }
            else{
                System.out.println("|"+"."*(w-2)+"|");
            }
        }
        System.out.println("+"+"-"*(w-2)+"+");
    }
}
```
<|endoftext|>
