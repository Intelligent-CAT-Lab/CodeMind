Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
 
public class p02417 {
      
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
         
        int res[]=new int[26];
         
        while(cin.hasNext()) {
            String str=cin.nextLine();
            for(int i=0;i<str.length();i++) {
                char c=str.charAt(i);
                if(c>=65 && c<=90)res[c-65]++;
                else if(c>=97 && c<=122)res[c-97]++;
            }
        }
         
        for(int i=0;i<26;i++) {
            System.out.println((char)(i+97)+" : "+res[i]);
        }
         
    }
     
}

```

### Response:
```python
import java.util.*;

public class p02417 {

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);

        int res[]=new int[26];

        while(cin.hasNext()) {
            String str=cin.nextLine();
            for(int i=0;i<str.length();i++) {
                char c=str.charAt(i);
                if(c>=65 and c<=90)res[c-65]++;
                else if(c>=97 and c<=122)res[c-97]++;
            }
        }

        for(int i=0;i<26;i++) {
            System.out.println((char)(i+97)+" : "+res[i]);
        }

    }

}
```<|endoftext|>
