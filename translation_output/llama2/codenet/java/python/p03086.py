<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03086 {

    private static void nCombination3(int c) {
        int count = c;
        int num = 0;
        for (int i = 0; i < count - 2; i++) {
            for (int j = i + 1; j < count - 1; j++) {
                for (int k = j + 1; k < count; k++) {
                    num++;
                }
            }
        }
    }

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        char[] S=sc.next().toCharArray();
        int currentlength = 0;
        int length = 0;
        for(int i=0;i<S.length;i++){
            if(S[i]=='A'||S[i]=='C'||S[i]=='G'||S[i]=='T'){
               currentlength++;

            }else{
                if(currentlength>length){
                    length = currentlength;
                }
                currentlength = 0;
            }
        }
        System.out.println(Math.max(length,currentlength));

    }
}

```

### 解题思路

```python
import java.util

class p03086:
    def nCombination3(self, c):
        count = c
        num = 0
        for i in range(0, count - 2):
            for j in range(i + 1, count - 1):
                for k in range(j + 1, count):
                    num += 1

    def main(self):
        sc = java.util.Scanner(System.in)
        S = sc.next().toCharArray()
        currentlength = 0
        length = 0
        for i in range(0, S.length):
            if S[i] == 'A' or S[i] == 'C' or S[i] == 'G' or S[i] == 'T':
                currentlength += 1
            else:
                if currentlength > length:
                    length = currentlength
                currentlength = 0
        print(max(length, currentlength))


if __name__ == '__main__':
    p03086().main()
```

### 复杂度分析

- 时间复杂度：O(n^3)。
- 空间复杂度：O(1)。

### 相关题目

- [p03085](./p03085.md)
</s>
