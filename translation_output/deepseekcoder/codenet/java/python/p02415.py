<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
//8-A
import java.util.Scanner;

class p02415 {
    public static void main(String [] args){
    	
    	Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
        
        int num = n.length();
        
        for( int i = 0 ; i < num ; i++ ){
        	
        	if(Character.isLowerCase(n.charAt(i))){
        		
                System.out.print(Character.toUpperCase(n.charAt(i)));
                
            }else if(Character.isUpperCase(n.charAt(i))){
            	
                System.out.print(Character.toLowerCase(n.charAt(i)));
                
            }/*else if( n.charAt(i) == ' '){
            	
            	System.out.print(' ');
            	
            }*/else{
            	
                System.out.print(n.charAt(i));
                
            }
        	
        }
        
        System.out.println();
    }
}
```

### Response:
```python
#8-A
import sys

def main():
    n = sys.stdin.readline().strip()

    num = len(n)

    for i in range(num):
        if n[i].islower():
            print(n[i].upper(), end='')
        elif n[i].isupper():
            print(n[i].lower(), end='')
        #elif n[i] == ' ':
        #    print(' ', end='')
        else:
            print(n[i], end='')

    print()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, then iterates over each character in the input. If the character is lowercase, it prints it in uppercase. If the character is uppercase, it prints it in lowercase. If the character is not a letter, it prints it as is. The `end=''` argument in the `print` function is used to prevent a newline after each character.
<|EOT|>
