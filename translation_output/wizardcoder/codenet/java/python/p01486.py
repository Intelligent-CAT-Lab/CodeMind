Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.lang.*;

class p01486 {
        public static void main(String args[]) {
                Scanner sc = new Scanner(System.in);
                String S = sc.next();
                if (saiki(S)) {
                        System.out.println("Cat");
                } else {
                        System.out.println("Rabbit");
                }
        }

        public static boolean saiki(String S){
                if (S.equals("")) {
                        return true;
                }
                if (S.charAt(0)!='m') {
                        return false;
                }
                int en = 1;
                int i;
                for (i = 1; i < S.length() && en!= 0; i++) {
                        if (S.charAt(i) =='m') {
                                en++;
                        } else if(S.charAt(i) == 'e'){
                                en--;
                        }
                }
                if (i == S.length()) {
                        return false;
                }
                int eindex = i;
                int mn = 1;
                i++;
                for (; i < S.length() && mn!= 0; i++) {
                        if (S.charAt(i) == 'e') {
                                mn++;
                        } else if(S.charAt(i) == 'w'){
                                mn--;
                        }
                }
                if (i!= S.length()) {
                        return false;
                }
                return saiki(S.substring(1, eindex - 1)) && saiki(S.substring(eindex, S.length() - 1));
        }
}
```

### Response:
```python
import java.util.*;
import java.lang.*;

class p01486:
    def main(self, args):
        sc = Scanner(System.in)
        S = sc.next()
        if self.saiki(S):
            print("Cat")
        else:
            print("Rabbit")

    def saiki(self, S):
        if S == "":
            return True
        if S[0]!='m':
            return False
        en = 1
        i = 1
        while i < len(S) and en!= 0:
            if S[i] =='m':
                en += 1
            elif S[i] == 'e':
                en -= 1
            i += 1
        if i == len(S):
            return False
        eindex = i
        mn = 1
        i += 1
        while i < len(S) and mn!= 0:
            if S[i] == 'e':
                mn += 1
            elif S[i] == 'w':
                mn -= 1
            i += 1
        if i!= len(S):
            return False
        return self.saiki(S[1:eindex-1]) and self.saiki(S[eindex:])
```<|endoftext|>
