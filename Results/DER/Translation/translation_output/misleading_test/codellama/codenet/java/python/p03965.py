<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
gpg

Expected output:
-51

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
[/INST]
```python
import sys

def main():
    input_str = sys.stdin.readline().strip()
    won = 0
    lose = 0
    g = 0
    p = 0
    for char in input_str:
        if char == 'g':
            if p == g:
                g += 1
            elif p < g:
                p += 1
                won += 1
        elif char == 'p':
            if p == g:
                g += 1
                lose += 1
            elif p < g:
                p += 1
            else:
                g += 1
                lose += 1
    print(won - lose)

if __name__ == '__main__':
    main()
```
Note: The code is written in Python 3.x.

Explanation:

The code first reads the input string from stdin using `sys.stdin.readline()`. It then initializes the variables `won`, `lose`, `g`, and `p` to 0.

The code then iterates over the characters in the input string using a for loop. For each character, it checks if it is 'g' or 'p'. If it is 'g', it checks if `p` is equal to `g`. If it is, it increments `g` by 1. If `p` is less than `g`, it increments `p` by 1 and increments `won` by 1.

If the character is 'p', it checks if `p` is equal to `g`. If it is, it increments `g` by 1 and increments `lose` by 1. If `p` is less than `g`, it increments `p` by 1. If `p` is greater than `g`, it increments `g` by 1 and increments `lose` by 1.

After the for loop, the code prints the difference between `won` and `lose` to stdout.

The code is written in a modular fashion, with the main logic of the program in the `main()` function, and the input and output handling in the `if __name__ == '__main__':` block. This makes it easier to test and debug the code.</s>
