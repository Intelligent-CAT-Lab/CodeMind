System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import java.util.Scanner;
class p03359:
    def main(self):
        scn=Scanner(System.in);
        a = scn.nextInt();
        b = scn.nextInt(); 
        if(b>=a):
            System.out.println(a);
        else:
            System.out.println(a-1);
```<|endoftext|>
