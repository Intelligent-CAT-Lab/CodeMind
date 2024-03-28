<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
gpg

Expected output:
0


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

def calculate_score(s1):
    won = 0
    lose = 0
    g = 0
    p = 0

    for i in s1:
        if i == 'g':
            if p == g:
                g += 1
            elif p < g:
                p += 1
                won += 1
        elif i == 'p':
            if p == g:
                g += 1
                lose += 1
            elif p < g:
                p += 1
            else:
                g += 1
                lose += 1

    return won - lose

if __name__ == "__main__":
    s1 = sys.stdin.readline().strip()
    print(calculate_score(s1))
```

This Python code does the same thing as the Java code. It reads a string from the standard input, calculates the score, and prints it. The `calculate_score` function is a direct translation of the Java code. The `if __name__ == "__main__":` block is a common idiom in Python to make sure the code is only executed when the script is run directly, not when it's imported as a module.<｜end▁of▁sentence｜>
