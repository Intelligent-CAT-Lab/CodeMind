<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
 
public class p03965 {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);



        String s1 = sc.next();
      int won  = 0;
      int lose = 0;
      int g = 0;
      int p = 0;
      
      for(int i = 0; i < s1.length(); i++){
          
          if(s1.charAt(i)=='g')
          {
            if(p==g)
            {
                g++;
                
            }else if(p < g){
                p++;
                won++;
            }
            
            
            
          }
          else if(s1.charAt(i)=='p')
          {
            if(p==g)
            {
                g++;
                lose++;
                
            }else if(p < g){
                p++;
            }else{
                g++;
                lose++;
            }
          }
          
      }

//System.out.print(won);
//System.out.print(lose);

        System.out.print(won-lose);
        System.out.println();
	}
}
```

### Response:
```python
import sys

def main():
    s1 = input()
    won = 0
    lose = 0
    g = 0
    p = 0

    for i in range(len(s1)):
        if s1[i] == 'g':
            if p == g:
                g += 1
            elif p < g:
                p += 1
                won += 1
        elif s1[i] == 'p':
            if p == g:
                g += 1
                lose += 1
            elif p < g:
                p += 1
            else:
                g += 1
                lose += 1

    print(won - lose)

if __name__ == "__main__":
    main()
```
This Python code does the same thing as the Java code. It reads a string from the input, then iterates over the string. If the character is 'g', it checks if the number of 'p's is equal to the number of 'g's. If they are equal, it increments 'g' by 1. If 'p' is less than 'g', it increments 'p' by 1 and 'won' by 1. If the character is 'p', it checks if the number of 'p's is equal to the number of 'g's. If they are equal, it increments 'g' by 1 and 'lose' by 1. If 'p' is less than 'g', it increments 'p' by 1. If 'p' is more than 'g', it increments 'g' by 1 and 'lose' by 1. Finally, it prints the difference between 'won' and 'lose'.
<|EOT|>
