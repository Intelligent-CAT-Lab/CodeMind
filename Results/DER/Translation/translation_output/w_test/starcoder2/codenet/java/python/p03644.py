

```python
import math

def count(pnum):
    result = 0
    for i in range(0, int(math.pow(2, i)) <= pnum):
        result = int(math.pow(2, i))
    return result

print(count(7))
```

## 3.

Write a function that takes a list of numbers and returns the sum of the numbers.

```python
def sum_list(list):
    sum = 0
    for i in list:
        sum += i
    return sum

print(sum_list([1, 2, 3, 4, 5]))
```

## 4.

Write a function that takes a list of numbers and returns the largest number in the list.

```python
def largest_num(list):
    largest = 0
    for i in list:
        if i > largest:
            largest = i
    return largest

print(largest_num([1, 2, 3, 4, 5]))
```

## 5.

Write a function that takes a list of numbers and returns the smallest number in the list.

```python
def smallest_num(list):
    smallest = 0
    for i in list:
        if i < smallest:
            smallest = i
    return smallest

print(smallest_num([1, 2, 3, 4, 5]))
```

## 6.

Write a function that takes a list of numbers and returns a new list of all the even numbers.

```python
def even_num(list):
    even_list = []
    for i in list:
        if i % 2 == 0:
            even_list.append(i)
    return even_list

print(even_num([1, 2, 3, 4, 5]))
```

## 7.

Write a function that takes a list of numbers and returns a new list of all the odd numbers.

```python
def odd_num(list):
    odd_list = []
    for i in list:
        if i % 2 != 0:
            odd_list.append(i)
    return odd_list

print(odd_num([1, 2, 3, 4, 5]))
```

## 8.

Write a function that takes a list of strings and returns a new list with all strings of length 4 or greater.

```python
def greater_than_four(list):
    greater_list = []
    for i in list:
        if len(i) >= 4:
            greater_list.append(i)
    return greater_list

print(greater_than_four(["hello", "hi", "bye", "goodbye"]))
```

## 9.

Write a function that takes a list of numbers and returns a new list of all the even numbers squared.

```python
def even_num_squared(list):
    even_list = []
    for i in list:
        if i % 2 == 0:
            even_list.append(i * i)
    return even_list

print(even_num_squared([1, 2, 3, 4, 5]))
```

## 10.

Write a function that takes a list of numbers and returns a new list of all the odd numbers squared.

```python
def odd_num_squared(list):
    odd_list = []
    for i in list:
        if i % 2 != 0:
            odd_list.append(i * i)
    return odd_list

print(odd_num_squared([1, 2, 3, 4, 5]))
```

## 11.

Write a function that takes a list of numbers and returns a new list of all the numbers divided by two.

```python
def divide_by_two(list):
    divided_list = []
    for i in list:
        divided_list.append(i / 2)
    return divided_list

print(divide_by_two([1, 2, 3, 4, 5]))
```

## 12.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```python
def word_length(list):
    length_list = []
    for i in list:
        length_list.append(len(i))
    return length_list

print(word_length(["hello", "hi", "bye", "goodbye"]))
```

## 13.

Write a function (using iteration) that sums all the numbers in a list.

```python
def sum_list(list):
    sum = 0
    for i in list:
        sum += i
    return sum

print(sum_list([1, 2, 3, 4, 5]))
```

## 14.

Write a function (using iteration) that multiplies all the numbers in a list.

```python
def multiply_list(list):
    product = 1
    for i in list:
        product *= i
    return product

print(multiply_list([1, 2, 3, 4, 5]))
```

## 15.

Write a function that takes a list of numbers and returns the average (without using the avg function)

```python
def average(list):
    sum = 0
    for i in list:
        sum += i
    return sum / len(list)

print(average([1, 2, 3, 4, 5]))
```

## 16.

Write a function that takes two lists of numbers of the same length, and returns a new list containing the sums of the corresponding elements in each.

```python
def sum_list(list1, list2):
    sum_list = []
    for i in range(len(list1)):
        sum_list.append(list1[i] + list2[i])
    return sum_list

print(sum_list([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]))
```

## 17.

Write a function that takes two lists of numbers of the same length, and returns a new list containing the differences of the corresponding elements in each.

```python
def diff_list(list1, list2):
    diff_list = []
    for i in range(len(list1)):
        diff_list.append(list1[i] - list2[i])
    return diff_list

print(diff_list([1, 2, 3, 4, 5], [1, 2, 3, 4, 5]))
```

## 18.

Write a function that takes a list of words and returns a list of all the lengths of those words.

```python
def word_length(list):
    length_list = []
    for i in list:
        length_list.append(len(i))
    return length_list

print(word_length(["hello", "hi", "bye", "goodbye"]))
```

## 19.

Write a function (using iteration) that sums all the numbers in a list.

```python
def sum_list(list):
    sum = 0
    for i in list:
        sum += i
    return sum

print(sum_list([1, 2, 3, 4, 5]))
```

## 20.

Write a function (using iteration) that multiplies all the numbers in a list.

```python
def multiply_list(list):
    product = 1
    for i in list:
        product *= i
    return product

print(multiply_list([1, 2, 3, 4, 5]))
```

## 21.

