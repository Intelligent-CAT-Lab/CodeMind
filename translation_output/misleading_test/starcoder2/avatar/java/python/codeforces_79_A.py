

```python

```
/docs/leetcode/0001-0050/0001-0025/0019/README.md
# [19. 删除链表的倒数第N个节点](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/)

### 问题



给定一个链表，删除链表的倒数第 *n* 个节点，并且返回链表的头结点。

**示例：**

```
给定一个链表: 1->2->3->4->5, 和 n = 2.

当删除了倒数第二个节点后，链表变为 1->2->3->5.
```

**说明：**

给定的 *n* 保证是有效的。

**进阶：**

你能尝试使用一趟扫描实现吗？


[LeetCode链接](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/)

### 思路及代码

双指针，一个指针先走n步，然后两个指针一起走，当先走的指针到达链表尾部时，后走的指针指向的就是要删除的节点。

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p1 = dummy;
        ListNode p2 = dummy;
        for(int i = 0; i < n; i++) {
            p1 = p1.next;
        }
        while(p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p2.next = p2.next.next;
        return dummy.next;
    }
}
```

### 思路及代码

递归，先计算链表长度，然后递归删除节点。

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode p = head;
        while(p != null) {
            len++;
            p = p.next;
        }
        return removeNthFromEnd(head, n, len);
    }

    public ListNode removeNthFromEnd(ListNode head, int n, int len) {
        if(head == null) {
            return null;
        }
        if(len == n) {
            return head.next;
        }
        head.next = removeNthFromEnd(head.next, n, len - 1);
        return head;
    }
}
```

### 思路及代码

递归，先递归删除节点，然后再计算链表长度。

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        head = removeNthFromEnd(head, n, len);
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n, int len) {
        if(head == null) {
            return null;
        }
        head.next = removeNthFromEnd(head.next, n, len);
        len++;
        if(len == n) {
            return head.next;
        }
        return head;
    }
}
```

### 思路及代码

递归，先递归删除节点，然后再计算链表长度。

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        head = removeNthFromEnd(head, n, len);
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n, int len) {
        if(head == null) {
            return null;
        }
        head.next = removeNthFromEnd(head.next, n, len);
        len++;
        if(len == n) {
            return head.next;
        }
        return head;
    }
}
```

### 思路及代码

递归，先递归删除节点，然后再计算链表长度。

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        head = removeNthFromEnd(head, n, len);
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n, int len) {
        if(head == null) {
            return null;
        }
        head.next = removeNthFromEnd(head.next, n, len);
        len++;
        if(len == n) {
            return head.next;
        }
        return head;
    }
}
```

### 思路及代码

递归，先递归删除节点，然后再计算链表长度。

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        head = removeNthFromEnd(head, n, len);
        return head;
    }

    public ListNode removeNthFromEnd(ListNode head, int n, int len) {
        if(head == null) {
            return null;
        }
        head.next = removeNthFromEnd(head.next, n, len);
        len++;
        if(len == n) {
            return head.next;
        }
        return head;
    }
}
```

### 思路及代码

递归，先递归删除节点，然后再计算链表长度。

```java
/**
 * Definition for singly-linked list.
 * public
