<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def calculate_score(s1):
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

    return won - lose

s1 = sys.stdin.readline().strip()
print(calculate_score(s1))
```

In this Python code, we define a function `calculate_score` that takes a string `s1` as input. The function iterates over the characters in `s1`, updating the `g` and `p` counters based on the rules of the game. The function then returns the difference between the `won` and `lose` counters. The input string is read from standard input using `sys.stdin.readline().strip()`. The result is printed to standard output.
<|EOT|>
