
```python
n, l = map(int, input().split())
diff = []
for i in range(1, n+1):
    value = l+i-1
    if value < 0:
        value = value * -1
    diff.append(value)

removeK = diff.index(min(diff)) + 1
print(n*l + n*(n+1)/2 - n - (l+ removeK -1))
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```python
def sum_list(numbers):
    total = 0
    for x in numbers:
        total += x
    return total

print(sum_list([1, 2, 3, 4, 5]))
print(sum_list([6, 7, 8, 9, 10]))
```

## 4.

Write a function that takes a list of numbers and returns a new list with only the odd numbers.

```python
def only_odd(numbers):
    odd_numbers = []
    for x in numbers:
        if x % 2 != 0:
            odd_numbers.append(x)
    return odd_numbers

print(only_odd([1, 2, 3, 4, 5]))
print(only_odd([6, 7, 8, 9, 10]))
```

## 5.

Write a function that takes a list of strings and a new string as arguments and returns the number of times the new string occurs in the original list.

```python
def count_string(strings, new_string):
    count = 0
    for x in strings:
        if x == new_string:
            count += 1
    return count

print(count_string(["hello", "goodbye", "hello", "nope"], "hello"))
print(count_string(["this", "is", "a", "new", "list"], "new"))
```

## 6.

Write a function that takes two lists and returns True if they have at least one common member.

```python
def common_member(list1, list2):
    for x in list1:
        for y in list2:
            if x == y:
                return True
    return False

print(common_member([1, 2, 3, 4, 5], [5, 6, 7, 8, 9]))
print(common_member([1, 2, 3, 4, 5], [6, 7, 8, 9]))
```
/week-02/day-01/01-draw-triangle.py
# Write a program that reads a number from the standard input, then draws a
# triangle like this:
#
# *
# **
# ***
# ****
#
# The triangle should have as many lines as the number was

number = int(input("Enter a number: "))

for i in range(1, number+1):
    print("*" * i)


print(sum_of_digits(123))
/week-02/day-02/01-sum-of-digits.py
# Given a non-negative int n, return the sum of its digits recursively (no loops).
# Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
# divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

def sum_of_digits(n):
    if n == 0:
        return 0
    else:
        return n % 10 + sum_of_digits(n // 10)

print(sum_of_digits(126))
print(sum_of_digits(49))
print(sum_of_digits(12))

# def sum_of_digits(n):
#     if n == 0:
#         return 0
#     else:
#         return n % 10 + sum_of_digits(n // 10)e the following methods:
#
# add(a) - adds a to the tree
# contains(a) - returns true if the tree contains a
#
# Example
#
# tree = BinarySearchTree()
# tree.add(5)
# tree.add(3)
# tree.add(7)
# tree.add(6)
# tree.add(1)
# tree.add(9)
# tree.add(8)
#
# print(tree.contains(5))
# # True
# print(tree.contains(-1))
# # False

class BinarySearchTree:
    def __init__(self):
        self.root = None

    def add(self, a):
        if self.root is None:
            self.root = a
        else:
            self._add(a, self.root)

    def _add(self, a, node):
        if a < node:
            if node.left is None:
                node.left = a
            else:
                self._add(a, node.left)
        else:
            if node.right is None:
                node.right = a
            else:
                self._add(a, node.right)

    def contains(self, a):
        if self.root is None:
            return False
        else:
            return self._contains(a, self.root)

    def _contains(self, a, node):
        if a == node:
            return True
        elif a < node:
            if node.left is None:
                return False
            else:
                return self._contains(a, node.left)
        else:
            if node.right is None:
                return False
            else:
                return self._contains(a, node.right)

tree = BinarySearchTree()
tree.add(5)
tree.add(3)
tree.add(7)
tree.add(6)
tree.add(1)
tree.add(9)
tree.add(8)

print(tree.contains(5))
# True
print(tree.contains(-1))
# False
/week-03/day-03/01-binary-search-tree.py
# Create a binary search tree which has th/week-02/day-01/02-draw-pyramid.py
# Write a program that reads a number from the standard input, then draws a
# pyramid like this:
#
#
#    *
#   ***
#  *****
# *******
#
# The pyramid should have as many lines as the number was

number = int(input("Enter a number: "))

for i in range(1, number+1):
    print(" " * (number-i) + "*" * (2*i-1))
/week-02/day-02/02-bunnies.py
# We have a number of bunnies and each bunny has two big floppy ears.
# We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

def bunnies(n):
    if n == 0:
        return 0
    else:
        return 2 + bunnies(n-1)

print(bunnies(0))
print(bunnies(1))
print(bunnies(2))

# def bunnies(n):
#     if n == 0:
#         return 0
#     else:
#         return 2 + bunnies(n-1)

# print(bunnies(0))
# print(bunnies(1))

