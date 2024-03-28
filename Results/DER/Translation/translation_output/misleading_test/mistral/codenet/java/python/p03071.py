<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 3

Expected output:
-70

```
import java.util.*; 
class p03071 {
   public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int c = 0;
     
      for(int i = 0;i<2;i++){
       if(A>=B){c += A;A = A -1;}
        else{c += B;B = B -1;}
      }
       
     
     
     System.out.print(c);


   }
}

```
[/INST]
```python
A, B = map(int, input().split())
c = 0
for i in range(2):
    if A >= B:
        c += A
        A = A - 1
    else:
        c += B
        B = B - 1
print(c)
```</s>
