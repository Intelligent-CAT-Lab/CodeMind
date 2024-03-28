Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoderregularcontest

Expected output:
?b

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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Character> s2 = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            s2.add(s.charAt(i));
        }
        List<Character> s3 = new ArrayList<>(new HashSet<>(s2));
        Collections.sort(s3);
        List<Character> s4 = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            s4.add((char) ('a' + i));
        }
        if (s3.equals(s4)) {
            System.out.println("None");
        } else {
            for (int i = 0; i < s3.size(); i++) {
                if (s3.get(i)!= s4.get(i)) {
                    System.out.println(s4.get(i));
                    break;
                }
                if (i == s3.size() - 1) {
                    System.out.println(s4.get(i + 1));
                }
            }
        }
    }
}
```<|endoftext|>
