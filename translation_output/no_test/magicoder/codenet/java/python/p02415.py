<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
#8-A

def main():
    n = input()
    
    for i in n:
        if i.islower():
            print(i.upper(), end='')
        elif i.isupper():
            print(i.lower(), end='')
        #elif i == ' ':
        #    print(' ', end='')
        else:
            print(i, end='')
            
    print()

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. If the character is lowercase, it prints the uppercase version of the character. If the character is uppercase, it prints the lowercase version of the character. If the character is not a letter, it prints the character as is. The `end=''` argument in the `print` function is used to prevent a newline from being printed after each character.<｜end▁of▁sentence｜>
