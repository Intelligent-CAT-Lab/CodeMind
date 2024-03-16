a = input()
b = a.split("")
c = len(a)
if c == 3:
    str = b[0]
    b[0] = b[2]
    b[2] = str
for i in range(0, c):
    print(b[i])

/p03228.md
# p03228

Translate the following java code to python and enclose your solution inside :

import java.util.Scanner;

public class p03228 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String[] b = a.split("");
        
        int c=a.length();
        
        if(c==3){
            String str=b[0];
            b[0]=b[2];
            b[2]=str;
        }
        
        for(int i=0;i<c;i++){        
            System.out.print(b[i]);
        } 
    }

}