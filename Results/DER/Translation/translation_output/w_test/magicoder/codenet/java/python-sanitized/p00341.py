from collections import Counter

def check_list(lst):
    count = Counter(lst)
    if len(count) > 3:
        return "no"
    for v in count.values():
        if v != 4 and v != 8 and v != 12:
            return "no"
    return "yes"

# Test input
lst = [1, 1, 3, 4, 8, 9, 7, 3, 4, 5, 5, 5]
print(check_list(lst))  # Expected output: no