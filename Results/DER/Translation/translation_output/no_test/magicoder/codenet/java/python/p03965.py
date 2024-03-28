<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    s1 = sys.stdin.readline().strip()
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

This Python code does the same thing as the Java code. It reads a string from the standard input, then iterates over the string. If the character is 'g', it checks if the number of 'g's is equal to the number of 'p's. If it is, it increments the number of 'g's. If it's not, it increments the number of 'p's and increments the 'won' counter. If the character is 'p', it does the same thing, but also checks if the number of 'p's is less than the number of 'g's. If it is, it increments the number of 'p's. If it's not, it increments the number of 'g's and increments the 'lose' counter. Finally, it prints the difference between 'won' and 'lose'.<｜end▁of▁sentence｜>
