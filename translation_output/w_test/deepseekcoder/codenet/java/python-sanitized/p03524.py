from collections import Counter

def check_string(s):
    count = Counter(s)
    values = count.values()
    if max(values) - min(values) <= 1:
        return "YES"
    else:
        return "NO"

s = input()
print(check_string(s))