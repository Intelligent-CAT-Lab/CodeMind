<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i) == 'C') {
                list.add('Z');
            } else if (w.charAt(i) == 'B') {
                list.add('Y');
            } else if (w.charAt(i) == 'A') {
                list.add('X');
            } else {
                int c = (int) w.charAt(i) - 3;
                list.add((char) c);
            }
        }
        String l = new String(list.toArray());
        System.out.println(l);
    }
}
```</s>
