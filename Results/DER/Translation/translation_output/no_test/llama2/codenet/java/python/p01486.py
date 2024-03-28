<s> Translate the following java code to python and enclose your solution inside ```python```:
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
                if (S.charAt(0) != 'm') {
                        return false;
                }
                int en = 1;
                int i;
                for (i = 1; i < S.length() && en != 0; i++) {
                        if (S.charAt(i) == 'm') {
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
                for (; i < S.length() && mn != 0; i++) {
                        if (S.charAt(i) == 'e') {
                                mn++;
                        } else if(S.charAt(i) == 'w'){
                                mn--;
                        }
                }
                if (i != S.length()) {
                        return false;
                }
                return saiki(S.substring(1, eindex - 1)) && saiki(S.substring(eindex, S.length() - 1));
        }
}
```

### 解题思路

```python
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
                if (S.charAt(0) != 'm') {
                        return false;
                }
                int en = 1;
                int i;
                for (i = 1; i < S.length() && en != 0; i++) {
                        if (S.charAt(i) == 'm') {
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
                for (; i < S.length() && mn != 0; i++) {
                        if (S.charAt(i) == 'e') {
                                mn++;
                        } else if(S.charAt(i) == 'w'){
                                mn--;
                        }
                }
                if (i != S.length()) {
                        return false;
                }
                return saiki(S.substring(1, eindex - 1)) && saiki(S.substring(eindex, S.length() - 1));
        }
}
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p01485](/p01485)
</s>
