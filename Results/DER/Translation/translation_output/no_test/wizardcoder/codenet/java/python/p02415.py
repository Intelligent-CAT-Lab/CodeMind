Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
                
            }/*else if( n.charAt(i) ==''){
            	
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
import java.util.Scanner;

class p02415:
    def main(self):
        sc = Scanner(System.in)
        n = sc.nextLine()
        num = n.length()
        for i in range(num):
            if n.charAt(i).islower():
                System.out.print(chr(ord(n.charAt(i)).upper()))
            elif n.charAt(i).isupper():
                System.out.print(chr(ord(n.charAt(i)).lower()))
            #elif n.charAt(i) =='':
            #    System.out.print(' ')
            else:
                System.out.print(n.charAt(i))
        System.out.println()
```<|endoftext|>
