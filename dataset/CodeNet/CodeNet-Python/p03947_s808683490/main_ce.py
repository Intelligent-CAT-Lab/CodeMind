from itertools import groupby
print(sum(1 for _ in groupby("BBBWW")) - 1)
