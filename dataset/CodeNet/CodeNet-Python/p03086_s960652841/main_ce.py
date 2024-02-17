import re
S = "ATCODER"
splitted = re.split("[^ATGC]", S)
max_length = 0
for inv in splitted:
    max_length = max(max_length, len(inv))
print(max_length)
