lst = [5, 8, 7, 1]
print(sum([x for idx, x in enumerate(lst) if idx%2==0 and x%2==1]))