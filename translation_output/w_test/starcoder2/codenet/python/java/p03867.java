

```java

```
/docs/leetcode/0001-0050/0001-0025/0019/0019.md
## 19. Remove Nth Node From End of List

### Problem Link

https://leetcode.com/problems/remove-nth-node-from-end-of-list/

### Problem Description

Given a linked list, remove the n-th node from the end of list and return its head.

Example:

```
Given linked list: 1->2->3->4->5, and n = 2.

After removing the second node from the end, the linked list becomes 1->2->3->5.
```

Note:

Given n will always be valid.

Follow up:

Could you do this in one pass?

### Solution

#### Approach 1: Two Pass Algorithm

**Intuition**

We notice that the problem could be simply reduced to another one : Remove the (L - n + 1)-th node from the beginning in the list , where L is the list length. This problem is easy to solve once we found list length L.

**Algorithm**

First we will add an auxiliary "dummy" node, which points to the list head. The "dummy" node is used to simplify some corner cases such as a list with only one node, or removing the head of the list. On the first pass, we find the list length L. Then we set a pointer to the dummy node and start to move it through the list till it comes to the (L - n + 1)-th node. We relink next pointer of the (L - n + 1)-th node to the (L - n + 2)-th node and we are done.

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
        int length = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}
```

**Complexity Analysis**

* Time complexity : O(L). The algorithm makes two traversal of the sequence of L nodes. Therefore time complexity is O(L).

* Space complexity : O(1). We only used constant extra space.

#### Approach 2: One Pass Algorithm

**Algorithm**

The above algorithm could be optimized to one pass. Instead of one pointer, we could use two pointers. The first pointer advances the list by n+1 steps from the beginning, while the second pointer starts from the beginning of the list. Now, both pointers are exactly separated by n nodes apart. We maintain this constant gap by advancing both pointers together until the first pointer arrives past the last node. The second pointer will be pointing at the n+1th node counting from the last. We relink the next pointer of the second pointer to point to the node after the (n+1)th node and we are done.

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
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
```

**Complexity Analysis**

* Time complexity : O(L). The algorithm makes one traversal of the sequence of L nodes. Therefore time complexity is O(L).

* Space complexity : O(1). We only used constant extra space.

#### Approach 3: Recursive

**Algorithm**

The above algorithms could be easily converted into recursive one. This is left as an exercise to the reader.

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
        int length = getLength(head);
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        removeNthFromEnd(dummy, length, n);
        return dummy.next;
    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            length++;
            head = head.next;
        }
        return length;
    }

    private void removeNthFromEnd(ListNode head, int length, int n) {
        if (head == null) return;
        removeNthFromEnd(head.next, length, n);
        if (length == n) {
            head.next = head.next.next;
        }
        length--;
    }
}
```

**Complexity Analysis**

* Time complexity : O(L). The algorithm makes one traversal of the sequence of L nodes. Therefore time complexity is O(L).

* Space complexity : O(L). The extra space comes from implicit stack space due to recursion. For a linked list of length L, the recursion call stack would take O(L) space.

#### Approach 4: Fast and Slow Pointer

**Intuition**

The above approaches could be optimized to O(1) space complexity.

**Algorithm**

Instead of one pass, we do it in multiple passes.

First pass to get the length of linked list.

Second pass to get to the (L - n + 1)th node.

Third pass to remove the (L - n + 1)th node.

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
        int length = 0;
        ListNode first = head;
        while (first != null) {
            length++;
            first = first.next;
        }
        length -= n;
        first = dummy;
        while (length > 0) {
            length--;
            first = first.next;
        }
        first.next = first.next.next;
        return dummy.next;
    }
}
```

**Complexity Analysis**

* Time complexity : O(L). The algorithm makes three traversal of the sequence of L nodes. Therefore time complexity is O(L).

* Space complexity : O(1). We only used constant extra space.

#### Approach 
