<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
class p03359{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt(); 
        if(b>=a){
            System.out.println(a);
        }else{
            System.out.println(a-1);
        }
    }
}
```

python code:<fim_suffix><fim_middle>
```python
import java.util.Scanner;
class p03359{
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt(); 
        if(b>=a):
            System.out.println(a);
        else:
            System.out.println(a-1);
    }
}
```
"""
<|endoftext|>
