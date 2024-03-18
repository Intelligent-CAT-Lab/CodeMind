from math import factorial

MAX = 20
facts = [factorial(i) for i in range(MAX + 1)]

def calculate(input_str):
    count = [0] * 26
    for c in input_str:
        count[ord(c) - ord('a')] += 1

    allow_odd = 0 if len(input_str) % 2 == 0 else 1
    odd_count = 0
    odd_pos = -1
    for i in range(26):
        if count[i] % 2 == 1:
            odd_count += 1
            odd_pos = i

    if allow_odd < odd_count:
        return 0

    if odd_pos != -1:
        count[odd_pos] -= 1

    for i in range(26):
        count[i] //= 2

    valid = sum(count)
    # print(count)

    result = facts[valid]
    for i in range(26):
        result //= facts[count[i]]

    return result

# Test case
print(calculate("ab"))