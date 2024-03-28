

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        if (k % 10 == 0 || k % 10 == 2 || k % 10 == 4 || k % 10 == 5 || k % 10 == 6 || k % 10 == 8) {
            System.out.println(-1);
        } else if (k % 10 == 1) {
            int tmp = k * 7;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                if (tmp / 10 % 10 <= 7) {
                    int num = 7 - tmp / 10 % 10;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans += 1;
                } else if (tmp / 10 % 10 == 8) {
                    int num = 9;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans += 1;
                } else if (tmp / 10 % 10 == 9) {
                    int num = 8;
                    int tmp2 = k * num;
                    tmp = tmp / 10 + tmp2;
                    ans += 1;
                }
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 3) {
            int tmp = k * 9;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 3 - 1) % 10;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans += 1;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 7) {
            int tmp = k * 1;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) * 7 + 1) % 10;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans += 1;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        } else if (k % 10 == 9) {
            int tmp = k * 3;
            int ans = 1;
            while (true) {
                if (String.valueOf(tmp).chars().filter(ch -> ch == '7').count() == String.valueOf(tmp).length()) {
                    System.out.println(ans + String.valueOf(tmp).length() - 1);
                    break;
                }
                int num = ((tmp / 10 % 10) + 3) % 10;
                int tmp2 = k * num;
                tmp = tmp / 10 + tmp2;
                ans += 1;
                if (ans > k) {
                    System.out.println(-1);
                    break;
                }
            }
        }
    }
}
```
/docs/leetcode/0001-0100/0001-0010.md
## 1. Two Sum [$\star$](https://leetcode.com/problems/two-sum) :thumbsdown:

![](https://img.shields.io/badge/-Hash%20Table-7BA23F.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(n)$

```python
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        lookup = {}

        for i, num in enumerate(nums):
            if target - num in lookup:
                return [lookup[target - num], i]
            lookup[num] = i
```

## 2. Add Two Numbers [$\star\star$](https://leetcode.com/problems/add-two-numbers) :thumbsup:

![](https://img.shields.io/badge/-Linked%20List-90B44B.svg?style=flat-square) ![](https://img.shields.io/badge/-Math-434343.svg?style=flat-square)

- [x] Time: $O(n)$
- [x] Space: $O(1)$

```python
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy = ListNode(0)
        curr = dummy
        carry = 0

        while l1 or l2 or carry:
            if l1:
                carry += l1.val
                l1 = l1.next
            if l2:
                carry += l2.val
                l2 = l2.next
            curr.next = ListNode(carry % 10)
            curr = curr.next
            carry //= 10

        return dummy.next
```

## 3. Longest Substring Without Repeating Characters [$\star\star$](
