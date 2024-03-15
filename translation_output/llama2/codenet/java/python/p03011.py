<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p03011{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int P,Q,R;
      	int max = 0;
      	P = sc.nextInt();
      	Q = sc.nextInt();
      	R = sc.nextInt();

      	if(P >= Q){
        	if(P >= R){
            	max = Q + R;
            }else{
            	max = P + Q;
            }
        }else if(Q >= R){
					if(Q >= P){
							max = P + R;
					}else{
							max = Q + R;
					}
			}else if(R >= P) {
					if(R >= Q) {
							max = P + Q;
					}else {
							max = P + R;
					}
			}

      	System.out.println(max);
    }
}

```

### 解答

```python
import sys

P, Q, R = map(int, sys.stdin.readline().split())

if P >= Q:
    if P >= R:
        max = Q + R
    else:
        max = P + Q
else:
    if Q >= R:
        max = P + R
    else:
        max = Q + R

print(max)
```

### 解析

1. 使用 `sys.stdin.readline()` 读取输入，然后使用 `map` 将输入转换为 `int` 类型。
2. 使用 `if` 语句判断输入的情况，并根据情况计算最大值。
3. 使用 `print` 打印最大值。

### 复杂度分析

- 时间复杂度：O(1)。
- 空间复杂度：O(1)。

### 相关题目

1. [第 3 题：矩形](https://leetcode-cn.com/problems/rectangle-area/)
2. [第 10 题：最长公共子序列](https://leetcode-cn.com/problems/longest-common-subsequence/)
3. [第 11 题：盛最多水的容器](https://leetcode-cn.com/problems/container-with-most-water/)
4. [第 12 题：买卖股票的最佳时机](https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/)
5. [第 13 题：爬梯子](https://leetcode-cn.com/problems/climbing-stairs/)
6. [第 14 题：最长回文子串](https://leetcode-cn.com/problems/longest-palindromic-substring/)
7. [第 15 题：最长回文子序列](https://leetcode-cn.com/problems/longest-palindromic-subsequence/)
8. [第 16 题：最长公共子序列 II](https://leetcode-cn.com/problems/longest-common-subsequence-ii/)
9. [第 17 题：盛最多水的容器 II](https://leetcode-cn.com/problems/container-with-most-water-ii/)
10. [第 18 题：盛最多水的容器 III](https://leetcode-cn.com/problems/container-with-most-water-iii/)
11. [第 19 题：删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/)
12. [第 20 题：删除排序数组中的重复项 II](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array-ii/)
13. [第 21 题：合并两个有序数组](https://leetcode-cn.com/problems/merge-sorted-array/)
14. [第 22 题：合并有序数组](https://leetcode-cn.com/problems/merge-sorted-array-ii/)
15. [第 23 题：删除链表的倒数第 N 个节点](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/)
16. [第 24 题：删除链表的倒数第 N 个节点 II](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-ii/)
17. [第 25 题：删除链表的倒数第 N 个节点 III](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-iii/)
18. [第 26 题：删除链表的倒数第 N 个节点 IV](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-iv/)
19. [第 27 题：删除链表的倒数第 N 个节点 V](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-v/)
20. [第 28 题：删除链表的倒数第 N 个节点 VI](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-vi/)
21. [第 29 题：删除链表的倒数第 N 个节点 VII](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-vii/)
22. [第 30 题：删除链表的倒数第 N 个节点 VIII](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-viii/)
23. [第 31 题：删除链表的倒数第 N 个节点 IX](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-ix/)
24. [第 32 题：删除链表的倒数第 N 个节点 X](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-x/)
25. [第 33 题：删除链表的倒数第 N 个节点 XI](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-xi/)
26. [第 34 题：删除链表的倒数第 N 个节点 XII](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-xii/)
27. [第 35 题：删除链表的倒数第 N 个节点 XIII](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-xiii/)
28. [第 36 题：删除链表的倒数第 N 个节点 XIV](https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list-xiv/)
