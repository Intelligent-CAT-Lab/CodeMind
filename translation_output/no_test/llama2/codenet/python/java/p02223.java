<s> Translate the following python code to java and enclose your solution inside ```java```:
```
n=input()

if n==1:
	print "1\n0"
elif n==2:
	print "2\n0\n11"
else:
	print n-1
	for i in xrange(n-1):
		print "1"+("0"*i)+"1"


```

### 解答

```java
int n = Integer.parseInt(br.readLine());

if (n == 1) {
    System.out.println("1");
    System.out.println("0");
} else if (n == 2) {
    System.out.println("2");
    System.out.println("0");
    System.out.println("11");
} else {
    System.out.println(n - 1);
    for (int i = 0; i < n - 1; i++) {
        System.out.println("1" + "0".repeat(i) + "1");
    }
}
```

### 解析

```
n=input()
```

读取一个整数，并赋值给变量n。

```
if n==1:
	print "1\n0"
elif n==2:
	print "2\n0\n11"
else:
	print n-1
	for i in xrange(n-1):
		print "1"+("0"*i)+"1"
```

如果n等于1，则打印出1和0。如果n等于2，则打印出2，0，11。否则，打印出n-1，并且从n-1开始，每次打印出一个1，然后一个0，然后一个1。

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [Python 题目 0001](https://leetcode-cn.com/problems/python-problem-0001/)
</s>
