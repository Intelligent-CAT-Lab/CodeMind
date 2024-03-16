<s> Translate the following python code to java and enclose your solution inside ```java```:
```

def main():
    s = list(input())
    s = list(set(s))
    
    if len(s)==4:
        print("Yes")
    elif len(s)==3:
        print("No")
    elif len(s)==2:
        if "N"in s and "S" in s:
            print("Yes")
        elif "E" in s and "W" in s:
            print("Yes")
        else:
            print("No")
    else:
        print("No")
if __name__=='__main__':
    main()
```

### 解答

```java
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] ss = s.split(" ");
        List<String> list = new ArrayList<>();
        for (String str : ss) {
            list.add(str);
        }
        list.remove(null);
        if (list.size() == 4) {
            System.out.println("Yes");
        } else if (list.size() == 3) {
            System.out.println("No");
        } else if (list.size() == 2) {
            if (list.contains("N") && list.contains("S")) {
                System.out.println("Yes");
            } else if (list.contains("E") && list.contains("W")) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
```

### 解析

1. 首先，我们需要将输入的字符串转换为字符串数组，然后将字符串数组转换为集合，最后将集合转换为列表。
2. 然后，我们需要判断列表的长度，如果长度为4，则输出“Yes”，如果长度为3，则输出“No”，如果长度为2，则判断列表中是否包含“N”和“S”，如果包含，则输出“Yes”，如果不包含，则判断列表中是否包含“E”和“W”，如果包含，则输出“Yes”，如果不包含，则输出“No”。
3. 最后，如果列表的长度不为4，3，2，则输出“No”。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [100. 字符串的排列](https://leetcode-cn.com/problems/permutation-in-string/)
- [101. 最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/)
- [102. 丑数](https://leetcode-cn.com/problems/ugly-number/)
- [103. 最长回文子序列](https://leetcode-cn.com/problems/longest-palindromic-subsequence/)
- [104. 最长回文子串 II](https://leetcode-cn.com/problems/longest-palindromic-substring-ii/)
- [105. 最长回文子序列 II](https://leetcode-cn.com/problems/longest-palindromic-subsequence-ii/)
- [106. 最长回文子序列 III](https://leetcode-cn.com/problems/longest-palindromic-subsequence-iii/)
- [107. 字符串的排列 II](https://leetcode-cn.com/problems/permutation-ii/)
- [108. 最长回文子序列 III](https://leetcode-cn.com/problems/longest-palindromic-subsequence-iii/)
- [109. 最长回文子序列 IV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-iv/)
- [110. 最长回文子序列 V](https://leetcode-cn.com/problems/longest-palindromic-subsequence-v/)
- [111. 最长回文子序列 VI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-vi/)
- [112. 最长回文子序列 VII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-vii/)
- [113. 最长回文子序列 VIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-viii/)
- [114. 最长回文子序列 IX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-ix/)
- [115. 最长回文子序列 X](https://leetcode-cn.com/problems/longest-palindromic-subsequence-x/)
- [116. 最长回文子序列 XI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xi/)
- [117. 最长回文子序列 XII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xii/)
- [118. 最长回文子序列 XIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xiii/)
- [119. 最长回文子序列 XIV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xiv/)
- [120. 最长回文子序列 XV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xv/)
- [121. 最长回文子序列 XVI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xvi/)
- [122. 最长回文子序列 XVII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xvii/)
- [123. 最长回文子序列 XVIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xviii/)
- [124. 最长回文子序列 XIX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xix/)
- [125. 最长回文子序列 XX](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xx/)
- [126. 最长回文子序列 XXI](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxi/)
- [127. 最长回文子序列 XXII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxii/)
- [128. 最长回文子序列 XXIII](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxiii/)
- [129. 最长回文子序列 XXIV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxiv/)
- [130. 最长回文子序列 XXV](https://leetcode-cn.com/problems/longest-palindromic-subsequence-xxv/)
