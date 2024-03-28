

```java

```
/docs/leetcode/0001-0050/0001-0010/0009/0009.md
## 9. 回文数

<div class="title-slug">
Palindrome Number
</div>

### 题目描述

判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

**示例 1:**

```
输入: 121
输出: true
```

**示例 2:**

```
输入: -121
输出: false
解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
```

**示例 3:**

```
输入: 10
输出: false
解释: 从右向左读, 为 01 。因此它不是一个回文数。
```

**进阶:**

你能不将整数转为字符串来解决这个问题吗？

### 题目分析

这道题目是判断一个整数是否是回文数，回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

这道题目可以用字符串来解决，也可以用数学方法来解决。

#### 字符串方法

字符串方法是将整数转为字符串，然后判断字符串是否是回文数。

```java
class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
```

#### 数学方法

数学方法是将整数转为字符串，然后判断字符串是否是回文数。

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int div = 1;
        while (x / div >= 10) {
            div *= 10;
        }
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) {
                return false;
            }
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}
```

### 复杂度分析

- 时间复杂度：$O(\log n)$，对于每次迭代，我们会将输入除以 10，因此时间复杂度为 $O(\log n)$。
- 空间复杂度：$O(1)$。

### 题目来源

- [https://leetcode-cn.com/problems/palindrome-number/](https://leetcode-cn.com/problems/palindrome-number/)

### 官方题解

#### 字符串方法

**思路**

最容易想到的解决方案是将数字转换为字符串，并检查字符串是否为回文。但是，这需要额外的非常量空间来创建问题描述中所不允许的字符串。

**算法**

首先，我们应该处理一些临界情况。所有负数都不可能是回文，例如：$-123$ 不是回文，因为 `-` 不等于 `3`。所以我们可以对所有负数返回 `false`。

现在，让我们来考虑如何反转后半部分的数字。 对于数字 `1221`，如果我们可以将后半部分反转，就可以得到前半部分，即 `12` 反转后为 `21`，正好是前半部分。

现在的问题是，我们如何知道反转数字的位数已经达到原始数字位数的一半？

我们将原始数字除以 10，然后给反转后的数字乘上 10，所以，当原始数字小于反转后的数字时，就意味着我们已经处理了一半位数的数字。

```java
public class Solution {
    public boolean isPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber/10;
    }
}
```

**复杂度分析**

- 时间复杂度：$O(\log n)$，对于每次迭代，我们会将输入除以 10，因此时间复杂度为 $O(\log n)$。
- 空间复杂度：$O(1)$。

#### 数学方法

**思路**

也可以不将数字转换为字符串来解决这个问题。

我们可以利用 % 运算符求出给定整数的最后一位数字，然后将原始整数除以 10，重复该过程，直到原始整数变为 0。

**算法**

首先，我们应该处理一些临界情况。所有负数都不可能是回文，例如：$-123$ 不是回文，因为 `-` 不等于 `3`。所以我们可以对所有负数返回 `false`。

现在，让我们来考虑如何反转后半部分的数字。 对于数字 `1221`，如果我们可以将后半部分反转，就可以得到前半部分，即 `12` 反转后为 `21`，正好是前半部分。

现在的问题是，我们如何知道反转数字的位数已经达到原始数字位数的一半？

我们将原始数字除以 10，然后给反转后的数字乘上 10，所以，当原始数字小于反转后的数字时，就意味着我们已经处理了一半位数的数字。

```java
public class Solution {
    public boolean isPalindrome(int x) {
        // 特殊情况：
        // 如上所述，当 x < 0 时，x 不是回文数。
        // 同样地，如果数字的最后一位是 0，为了使该数字为回文，
        // 则其第一位数字也应该是 0
        // 只有 0 满足这一属性
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数
