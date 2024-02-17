from itertools import groupby
print((sum(1 for _ in groupby(eval(input()))) - 1))
