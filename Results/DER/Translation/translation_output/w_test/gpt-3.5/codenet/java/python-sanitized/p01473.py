import math

MAX = 20

facts = [0] * (MAX + 1)
facts[0] = 1
for i in range(1, MAX + 1):
    facts[i] = facts[i - 1] * i

count = [0] * 26
input_str = input()

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
    print(0)
    exit()

if odd_pos != -1:
    count[odd_pos] -= 1

for i in range(26):
    count[i] //= 2

valid = sum(count)

result = facts[valid]
for i in range(26):
    result //= math.factorial(count[i])

print(result)