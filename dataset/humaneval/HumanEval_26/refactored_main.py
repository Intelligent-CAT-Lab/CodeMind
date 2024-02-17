import collections
numbers = [1, 2, 3, 2, 4, 3, 5]
c = collections.Counter(numbers)
print([n for n in numbers if c[n] <= 1])