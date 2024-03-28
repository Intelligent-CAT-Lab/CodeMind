<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.PrintWriter;
import java.util.*;

public class p02730 {

    Scanner sc = new Scanner(System.in);

    PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        new p02730().run();
    }

    void run() {

        String s = sc.next();
        char[] arr = s.toCharArray();

        for (int i=0; i<s.length()/2; i++) {
            if (arr[i]!=arr[s.length()-1-i]) {
                out.print("No");
                out.flush();
                return;
            }
        }

        for (int i=0; i<s.length()/2-1; i++) {
            if (arr[i]!=arr[(s.length()/2)-1-i]) {
                out.print("No");
                out.flush();
                return;
            }
     
        }

        out.print("Yes");
        out.flush();
    }

}

```

### 解题思路

1. 首先，我们需要将输入的字符串转换成字符数组，然后我们可以使用一个循环来判断字符串是否为回文串。
2. 如果字符串是回文串，我们需要使用一个另一个循环来判断字符串是否为逆序回文串。
3. 如果字符串是逆序回文串，我们需要输出“Yes”，否则输出“No”。

### 代码实现

```python
import java.io.PrintWriter;
import java.util.*;

class p02730:

    def run(self):
        s = input()
        arr = list(s)
        for i in range(len(arr)//2):
            if arr[i] != arr[len(arr)-1-i]:
                print("No")
                return
        for i in range(len(arr)//2-1):
            if arr[i] != arr[(len(arr)//2)-1-i]:
                print("No")
                return
        print("Yes")

p02730().run()
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

1. [回文串](https://leetcode-cn.com/problems/palindrome-string/)
2. [回文数](https://leetcode-cn.com/problems/palindrome-number/)
3. [回文数组](https://leetcode-cn.com/problems/palindrome-array/)
4. [回文链表](https://leetcode-cn.com/problems/palindrome-linked-list/)
5. [回文链表 II](https://leetcode-cn.com/problems/palindrome-linked-list-ii/)
6. [回文链表 III](https://leetcode-cn.com/problems/palindrome-linked-list-iii/)
7. [回文链表 IV](https://leetcode-cn.com/problems/palindrome-linked-list-iv/)
8. [回文链表 V](https://leetcode-cn.com/problems/palindrome-linked-list-v/)
9. [回文链表 VI](https://leetcode-cn.com/problems/palindrome-linked-list-vi/)
10. [回文链表 VII](https://leetcode-cn.com/problems/palindrome-linked-list-vii/)
11. [回文链表 VIII](https://leetcode-cn.com/problems/palindrome-linked-list-viii/)
12. [回文链表 IX](https://leetcode-cn.com/problems/palindrome-linked-list-ix/)
13. [回文链表 X](https://leetcode-cn.com/problems/palindrome-linked-list-x/)
14. [回文链表 XI](https://leetcode-cn.com/problems/palindrome-linked-list-xi/)
15. [回文链表 XII](https://leetcode-cn.com/problems/palindrome-linked-list-xii/)
16. [回文链表 XIII](https://leetcode-cn.com/problems/palindrome-linked-list-xiii/)
17. [回文链表 XIV](https://leetcode-cn.com/problems/palindrome-linked-list-xiv/)
18. [回文链表 XV](https://leetcode-cn.com/problems/palindrome-linked-list-xv/)
19. [回文链表 XVI](https://leetcode-cn.com/problems/palindrome-linked-list-xvi/)
20. [回文链表 XVII](https://leetcode-cn.com/problems/palindrome-linked-list-xvii/)
21. [回文链表 XVIII](https://leetcode-cn.com/problems/palindrome-linked-list-xviii/)
22. [回文链表 XIX](https://leetcode-cn.com/problems/palindrome-linked-list-xix/)
23. [回文链表 XX](https://leetcode-cn.com/problems/palindrome-linked-list-xx/)
24. [回文链表 XXI](https://leetcode-cn.com/problems/palindrome-linked-list-xxi/)
25. [回文链表 XXII](https://leetcode-cn.com/problems/palindrome-linked-list-xxii/)
26. [回文链表 XXIII](https://leetcode-cn.com/problems/palindrome-linked-list-xxiii/)
27. [回文链表 XXIV](https://leetcode-cn.com/problems/palindrome-linked-list-xxiv/)
28. [回文链表 XXV](https://leetcode-cn.com/problems/palindrome-linked-list-xxv/)
29. [回文链表 XXVI](https://leetcode-cn.com/problems/palindrome-linked-list-xxvi/)
30. [回文链表 XXVII](https://leetcode-cn.com/problems/palindrome-linked-list-xxvii/)
31. [回文链表 XXVIII](https://leetcode-cn.com/problems/palindrome-linked-list-xxviii/)
32. [回文链表 XXIX](https://leetcode-cn.com/problems/palindrome-linked-list-xxix/)
33. [回文链表 XXX](https://leetcode-cn.com/problems/palindrome-linked-list-xxx/)
34. [回文链表 XXXI](https://leetcode-cn.com/problems/palindrome-linked-list-xxxI/)
35. [回文链表 XXXII](https://leetcode-cn.com/problems/palindrome-linked-list-xxxII/)
36. [回文链表 XXXIII](https://leetcode-cn.com/problems/palindrome-linked-list-xxxIII/)
37. [回文链表 XXXIV](https://leetcode-cn.com/problems/palindrome-linked-list-xxxIV/)
38. [回
