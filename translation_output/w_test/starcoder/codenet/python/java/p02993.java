<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3776

Expected output:
Bad


```
s = raw_input()
def f(s):
	for u,v in zip(s,s[1:]):
		if u == v:return 'Bad'
	return 'Good'
print f(s)  
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                System.out.println("Bad");
                return;
            }
        }
        System.out.println("Good");
    }
}
```
'''
<|endoftext|>
