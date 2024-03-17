

```python
r,d,x = map(int,input().split())
for i in range(10):
    x = r*x - d
    print(x)
```
/content/posts/2019-09-29-python-data-structures.md
---
title: Python Data Structures
date: 2019-09-29T12:00:00+05:30
draft: false
categories: ["python"]
---

## Lists

Lists are the most versatile of Python's compound data types. A list contains items separated by commas and enclosed within square brackets ([]). To some extent, lists are similar to arrays in C. One difference between them is that all the items belonging to a list can be of different data type.

The values stored in a list can be accessed using the slice operator ([ ] and [:]) with indexes starting at 0 in the beginning of the list and working their way to end -1. The plus (+) sign is the list concatenation operator, and the asterisk (*) is the repetition operator. For example −

```python
list1 = ['physics', 'chemistry', 1997, 2000];
list2 = [1, 2, 3, 4, 5, 6, 7 ];
print ("list1[0]: ", list1[0])
print ("list2[1:5]: ", list2[1:5])
```

Output:

```
list1[0]:  physics
list2[1:5]:  [2, 3, 4, 5]
```

## Updating Lists

You can update single or multiple elements of lists by giving the slice on the left-hand side of the assignment operator, and you can add to elements in a list with the append() method. For example −

```python
list = ['physics', 'chemistry', 1997, 2000];
print ("Value available at index 2 : ")
print (list[2])
list[2] = 2001;
print ("New value available at index 2 : ")
print (list[2])
```

Output:

```
Value available at index 2 :
1997
New value available at index 2 :
2001
```

## Delete List Elements

To remove a list element, you can use either the del statement if you know exactly which element(s) you are deleting or the remove() method if you do not know. For example −

```python
list1 = ['physics', 'chemistry', 1997, 2000];
print (list1)
del list1[2];
print ("After deleting value at index 2 : ")
print (list1)
```

Output:

```
['physics', 'chemistry', 1997, 2000]
After deleting value at index 2 :
['physics', 'chemistry', 2000]
```

## Basic List Operations

Lists respond to the + and * operators much like strings; they mean concatenation and repetition here too, except that the result is a new list, not a string.

In fact, lists respond to all of the general sequence operations we used on strings in the prior chapter.

Python Expression | Results | Description
--- | --- | ---
len([1, 2, 3]) | 3 | Length
[1, 2, 3] + [4, 5, 6] | [1, 2, 3, 4, 5, 6] | Concatenation
['Hi!'] * 4 | ['Hi!', 'Hi!', 'Hi!', 'Hi!'] | Repetition
3 in [1, 2, 3] | True | Membership
for x in [1, 2, 3]: print(x, end=" ") | 1 2 3 | Iteration

## Indexing, Slicing and Matrixes

Because lists are sequences, indexing and slicing work the same way for lists as they do for strings.

Assuming following input −

```python
L = ['spam', 'Spam', 'SPAM!']
```

Python Expression | Results | Description
--- | --- | ---
L[2] | 'SPAM!' | Offsets start at zero
L[-2] | 'Spam' | Negative: count from the right
L[1:] | ['Spam', 'SPAM!'] | Slicing fetches sections

## Built-in List Functions & Methods

Python includes the following list functions −

Python Function | Description
--- | ---
len(list) | Length
max(list) | Max value
min(list) | Min value
list(seq) | Convert a tuple into a list

Python includes following list methods −

Python Method | Description
--- | ---
list.append(obj) | Appends object obj to list
list.count(obj) | Returns
