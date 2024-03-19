<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
MRL

Expected output:
OI

```
w=input()
list=[]
for i in range(len(w)):
    if w[i]=='C':
        list.append('Z')
        
    elif w[i]=='B':
        list.append('Y')
        
    elif w[i]=='A':
        list.append('X')
    else:
        c=ord(w[i])-3
        list.append(chr(c))
l=''.join(list)
print(l)
    

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='C'){
                arr[i]='Z';
            }
            else if(arr[i]=='B'){
                arr[i]='Y';
            }
            else if(arr[i]=='A'){
                arr[i]='X';
            }
            else{
                arr[i]=(char)(arr[i]-3);
            }
        }
        System.out.println(String.valueOf(arr));
    }
}
```
<|endoftext|>
