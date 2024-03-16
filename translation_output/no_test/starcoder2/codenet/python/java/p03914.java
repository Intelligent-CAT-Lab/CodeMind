
```

```

```

java code:
```

```
/solutions/leetcode/100. Same Tree - leetcode/README.md
# [100. Same Tree](https://leetcode.com/problems/same-tree/)

### **Solution**
---

#### Approach 1: Recursion

**Intuition**

The simplest strategy here is to use recursion. If the current nodes contain the same value and their left and right subtree are both sameTree, then the tree is sameTree.

**Algorithm**

We can represent a recursive function which takes two nodes, p and q, as the two nodes to compare. If they are both empty, return true. If one is empty and the other is not, return false. Otherwise check if the values of the nodes are equal and their left and right subtrees are both sameTree.

**Complexity Analysis**

* Time complexity : O(n). We traverse the entire input tree once, so the total run time is O(n), where n is the total number of nodes in the tree.

* Space complexity : O(n). The number of recursive calls is bound by the height of the tree. In the worst case, the tree is linear and the height is in O(n). Therefore, space complexity due to recursive calls on the stack is O(n) in the worst case.

```

```

#### Approach 2: Iteration

**Intuition**

We can also use iteration to solve this problem. We initialize a stack with two elements, p and q. Then we pop the two elements from the stack and compare them. If they are not equal, we return false. If they are equal, we push their children to the stack. If we reach the end of the stack, we return true.

**Algorithm**

We start by pushing the root nodes of both the trees to a stack. Then, at every step, we pop a node from the stack, compare its value with the corresponding node of the other tree, and push the left and right children of the first tree to the stack only if they are non-empty.

**Complexity Analysis**

* Time complexity : O(n). We traverse the entire input tree once, so the total run time is O(n), where n is the total number of nodes in the tree.

* Space complexity : O(n). The number of elements in the queue is bound by the number of nodes in the tree.

```/solutions/leetcode/101. Symmetric Tree - leetcode/README.md
# [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)

### **Solution**
---

#### Approach 1: Recursion

**Intuition**

The simplest strategy here is to use recursion. If the current nodes contain the same value and their left and right subtree are both symmetric, then the tree is symmetric.

**Algorithm**

We can represent a recursive function which takes two nodes, p and q, as the two nodes to compare. If they are both empty, return true. If one is empty and the other is not, return false. Otherwise check if the values of the nodes are equal and their left and right subtrees are both symmetric.

**Complexity Analysis**

* Time complexity : O(n). We traverse the entire input tree once, so the total run time is O(n), where n is the total number of nodes in the tree.

* Space complexity : O(n). The number of recursive calls is bound by the height of the tree. In the worst case, the tree is linear and the height is in O(n). Therefore, space complexity due to recursive calls on the stack is O(n) in the worst case.

```

```

#### Approach 2: Iteration

**Intuition**

We can also use iteration to solve this problem. We initialize a stack with two elements, p and q. Then we pop the two elements from the stack and compare them. If they are not equal, we return false. If they are equal, we push their children to the stack. If we reach the end of the stack, we return true.

**Algorithm**

We start by pushing the root nodes of both the trees to a stack. Then, at every step, we pop a node from the stack, compare its value with the corresponding node of the other tree, and push the left and right children of the first tree to the stack only if they are non-empty.

**Complexity Analysis**

* Time complexity : O(n). We traverse the entire input tree once, so the total run time is O(n), where n is the total number of nodes in the tree.

* Space complexity : O(n). The number of elements in the queue is bound by the number of nodes in the tree.

```

```

#### Approach 3: Queue

**Intuition**

We can also use a queue to solve this problem. We initialize a queue with two elements, p and q. Then we pop the two elements from the queue and compare them. If they are not equal, we return false. If they are equal, we push their children to the queue. If we reach the end of the queue, we return true.

**Algorithm**

We start by pushing the root nodes of both the trees to a queue. Then, at every step, we pop a node from the queue, compare its value with the corresponding node of the other tree, and push the left and right children of the first tree to the queue only if they are non-empty.

**Complexity Analysis**

* Time complexity : O(n). We traverse the entire input tree once, so the total run time is O(n), where n is the total number of nodes in the tree.

* Space complexity : O(n). The number of elements in the queue is bound by the number of nodes in the tree.

```

```
/solutions/leetcode/104. Maximum Depth of Binary Tree - leetcode/README.md
# [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)

### **Solution**
---

#### Approach 1: Recursion

**Intuition**

The simplest strategy here is to use recursion. If the current node is empty, return 0. Otherwise, return the maximum depth of the left and right subtrees plus one.

**Algorithm**

We can represent a recursive function which takes a node, root, as the root of the subtree to be processed. If the node is empty, return 0. Otherwise, return the maximum depth of the left and right subtrees plus one.

**Complexity Analysis**

* Time complexity : O(n). We traverse the entire input tree once, so the total run time is O(n), where n is the total number of nodes in the tree.

* Space complexity : O(n). The number of recursive calls is bound by the height of the tree. In the worst case, the tree is linear and the height is in O(n). Therefore, space complexity due to recursive calls on the stack is O(n) in the worst case.

```

```

#### Approach 2: Iteration

**Intuition**

We can also use iteration to solve this problem. We initialize a queue with the root node. Then, at every step, we pop a node from the queue, push its children to the queue, and increment the depth. If we reach the end of the queue, we return the depth.

**Algorithm**

We start by pushing the root node to a queue. Then, at every step, we pop a node from the queue, push its children to the queue, and increment the depth. If we reach the end of the queue, we return the
