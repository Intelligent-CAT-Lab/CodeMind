Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 3

Expected output:
9


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

### Response:
```python
import java.util.*; 

class p03071:
    def main(self):
        sc = Scanner(System.in)
        A = sc.nextInt()
        B = sc.nextInt()
        c = 0
        
        for i in range(2):
            if A >= B:
                c += A
                A -= 1
            else:
                c += B
                B -= 1
        
        System.out.print(c)

p03071().main()
```<|endoftext|>
