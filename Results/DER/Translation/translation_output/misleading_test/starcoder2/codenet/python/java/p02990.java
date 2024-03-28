

```java

```
/docs/leetcode/0001-0050/0001-0010/0009/README.md
# [回文数](https://leetcode-cn.com/problems/palindrome-number/)

### 问题



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


### 解答

```go
func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
    if x < 10 {
        return true
    }
    if x%10 == 0 {
        return false
    }
    var y int
    for x > y {
        y = y*10 + x%10
        x /= 10
    }
    return x == y || x == y/10
}
```


### 参考

[回文数](https://leetcode-cn.com/problems/palindrome-number/solution/hui-wen-shu-by-leetcode/)

### 题解

```go
func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
    if x < 10 {
        return true
    }
    if x%10 == 0 {
        return false
    }
    var y int
    for x > y {
        y = y*10 + x%10
        x /= 10
    }
    return x == y || x == y/10
}
```

### 说明

1. 负数不是回文数
2. 0-9 都是回文数
3. 末尾为 0 的数不是回文数
4. 反转一半的数，如果是回文数，那么反转后的数和原数相等，或者反转后的数是原数的一半

### 参考

[回文数](https://leetcode-cn.com/problems/palindrome-number/solution/hui-wen-shu-by-leetcode/)

### 题解

```go
func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
    if x < 10 {
        return true
    }
    if x%10 == 0 {
        return false
    }
    var y int
    for x > y {
        y = y*10 + x%10
        x /= 10
    }
    return x == y || x == y/10
}
```

### 说明

1. 负数不是回文数
2. 0-9 都是回文数
3. 末尾为 0 的数不是回文数
4. 反转一半的数，如果是回文数，那么反转后的数和原数相等，或者反转后的数是原数的一半

### 参考

[回文数](https://leetcode-cn.com/problems/palindrome-number/solution/hui-wen-shu-by-leetcode/)

### 题解

```go
func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
    if x < 10 {
        return true
    }
    if x%10 == 0 {
        return false
    }
    var y int
    for x > y {
        y = y*10 + x%10
        x /= 10
    }
    return x == y || x == y/10
}
```

### 说明

1. 负数不是回文数
2. 0-9 都是回文数
3. 末尾为 0 的数不是回文数
4. 反转一半的数，如果是回文数，那么反转后的数和原数相等，或者反转后的数是原数的一半

### 参考

[回文数](https://leetcode-cn.com/problems/palindrome-number/solution/hui-wen-shu-by-leetcode/)

### 题解

```go
func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
    if x < 10 {
        return true
    }
    if x%10 == 0 {
        return false
    }
    var y int
    for x > y {
        y = y*10 + x%10
        x /= 10
    }
    return x == y || x == y/10
}
```

### 说明

1. 负数不是回文数
2. 0-9 都是回文数
3. 末尾为 0 的数不是回文数
4. 反转一半的数，如果是回文数，那么反转后的数和原数相等，或者反转后的数是原数的一半

### 参考

[回文数](https://leetcode-cn.com/problems/palindrome-number/solution/hui-wen-shu-by-leetcode/)

### 题解

```go
func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
    if x < 10 {
        return true
    }
    if x%10 == 0 {
        return false
    }
    var y int
    for x > y {
        y = y*10 + x%10
        x /= 10
    }
    return x == y || x == y/10
}
```

### 说明

1. 负数不是回文数
2. 0-9 都是回文数
3. 末尾为 0 的数不是回文数
4. 反转一半的数，如果是回文数，那么反转后的数和原数相等，或者反转后的数是原数的一半

### 参考

[回文数](https://leetcode-cn.com/problems/palindrome-number/solution/hui-wen-shu-by-leetcode/)

### 题解

```go
func isPalindrome(x int) bool {
    if x < 0 {
        return false
    }
    if x < 10 {
        return true
    }
    if x%10 == 0 {
        return false
    }
    var y int
    for x > y {
        y = y*10 + x%10
        x /= 10
    }
    return x == y || x == y/10
}
```

### 说明


