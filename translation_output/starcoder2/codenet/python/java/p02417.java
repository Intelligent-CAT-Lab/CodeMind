
```java
import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> map = new HashMap<>();
        while (sc.hasNext()) {
            String s = sc.nextLine();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                    c = Character.toLowerCase(c);
                    if (map.containsKey(c)) {
                        map.put(c, map.get(c) + 1);
                    } else {
                        map.put(c, 1);
                    }
                }
            }
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
            System.out.print(": ");
            if (map.containsKey(c)) {
                System.out.println(map.get(c));
            } else {
                System.out.println(0);
            }
        }
    }
}
```
/2019-09-16/README.md
# 2019-09-16

## 1. 题目

### 1.1 题目描述

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

### 1.2 示例

```
输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
```

```
输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
```

```
输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
```

### 1.3 链接

[https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)

## 2. 解题思路

### 2.1 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left和right都为0，每次将right向右移动一位，如果窗口内的字符不重复，则继续移动right，否则移动left，直到窗口内的字符不重复，记录窗口的长度，然后继续移动right，直到字符串结束。

### 2.2 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                max = Math.max(max, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
```

## 3. 总结

### 3.1 复杂度

时间复杂度：O(n)

空间复杂度：O(n)

### 3.2 思考

滑动窗口的思想，在很多题目中都有应用。
/2019-09-17/README.md
# 2019-09-17

## 1. 题目

### 1.1 题目描述

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

### 1.2 示例

```
输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
```

```
输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
```

```
输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
```

### 1.3 链接

[https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)

## 2. 解题思路

### 2.1 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left和right都为0，每次将right向右移动一位，如果窗口内的字符不重复，则继续移动right，否则移动left，直到窗口内的字符不重复，记录窗口的长度，然后继续移动right，直到字符串结束。

### 2.2 代码

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0;
        int max = 0;
        Set<Character> set = new HashSet<>();
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                max = Math.max(max, right - left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}
```

## 3. 总结

### 3.1 复杂度

时间复杂度：O(n)

空间复杂度：O(n)

### 3.2 思考

滑动窗口的思想，在很多题目中都有应用。

## 4. 题目

### 4.1 题目描述

给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

### 4.2 示例

```
输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
```

```
输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
```

```
输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
```

### 4.3 链接

[https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)

## 5. 解题思路

### 5.1 思路

使用滑动窗口，窗口内的字符不重复，窗口的左右边界分别为left和right，初始时left和right都为0，每次将right向右移动一位，如果窗口内的字符不重复，则继续移动right，
