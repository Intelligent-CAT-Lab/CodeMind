<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoderregularcontest

Expected output:
b


```
s = list(input())
s2 = []
for i in range(len(s)):
    s2.append(s[i])
s3 = list(set(s2))
s3.sort()
s4 = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
if s3 == s4:
    print('None')
else:
    for i in range(int(len(s3))):
        if s3[i]!= s4[i]:
            print(s4[i])
            break
        if i == len(s3)-1:
            print(s4[i+1])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s2 = s.toCharArray();
        Arrays.sort(s2);
        char[] s3 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        if(Arrays.equals(s2,s3)){
            System.out.println("None");
        }else{
            for(int i=0;i<s3.length;i++){
                if(s2[i]!= s3[i]){
                    System.out.println(s3[i]);
                    break;
                }
                if(i == s3.length-1){
                    System.out.println(s3[i+1]);
                }
            }
        }
    }
}
```
'''
<|endoftext|>
