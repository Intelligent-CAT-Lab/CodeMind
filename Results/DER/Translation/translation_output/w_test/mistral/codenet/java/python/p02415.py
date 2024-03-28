<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
fAIR, LATER, OCCASIONALLY CLOUDY.

Expected output:
Fair, later, occasionally cloudy.


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
[/INST]
```python
#8-A
n = input()
num = len(n)

for i in range(num):
    if n[i].islower():
        print(n[i].upper(), end='')
    elif n[i].isupper():
        print(n[i].lower(), end='')
    else:
        print(n[i], end='')

print()
```</s>
