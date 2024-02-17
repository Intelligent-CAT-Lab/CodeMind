from itertools import groupby
print(sum(1 for _ in groupby(input())) - 1)
