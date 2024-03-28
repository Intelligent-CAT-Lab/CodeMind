

```java

```


```java

```
/solutions/leetcode/102.md
# [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
[3,9,20,null,null,15,7]

Expected output:
[[3],[9,20],[15,7]]

```
class Solution:
    def levelOrder(self, root: TreeNode) -> List[List[int]]:
        if not root:
            return []
        ans = []
        q = [root]
        while q:
            ans.append([node.val for node in q])
            q = [child for node in q for child in (node.left, node.right) if child]
        return ans
```/solutions/leetcode/101.md
# [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
[1,2,2,3,4,4,3]

Expected output:
true

```
class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        def check(l, r):
            if not l and not r:
                return True
            if not l or not r:
                return False
            return l.val == r.val and check(l.left, r.right) and check(l.right, r.left)
        return check(root, root)
```

java code:

```java

```
/solutions/leetcode/104.md
# [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
[3,9,20,null,null,15,7]

Expected output:
3

```
class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
```

java code:

```java

```

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
[3,9,20,null,null,15,7]

Expected output:
3

```
class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
```

java code:

```java

```

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
[3,9,20,null,null,15,7]

Expected output:
3

```
class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
```

java code:

```java

```

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
[3,9,20,null,null,15,7]

Expected output:
3

```
class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
```

java code:

```java

```

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
[3,9,20,null,null,15,7]

Expected output:
3

```
class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
```

java code:

```java

```

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
[3,9,20,null,null,15,7]

Expected output:
3

```
class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
```

java code:

```java

```

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
[3,9,20,null,null,15,7]

Expected output:
3

```
class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if not root:
            return 0
        return 1 + max(self.maxDepth(root.left), self.maxDepth(root.right))
```

java code:

```java

```

## Solution

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
