lst = [2, 4, 1, 3, 5, 7]
smallest = list(filter(lambda x: x < 0, lst))
largest = list(filter(lambda x: x > 0, lst))
print((max(smallest) if smallest else None, min(largest) if largest else None))