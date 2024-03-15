import sys

MAX = 20

def fact(n):
    return 1 if n == 0 else n * fact(n-1)

def count_chars(input):
    count = [0] * 26
    for c in input:
        count[ord(c)-'a'] += 1
    return count

def has_odd_char(count):
    return sum(count[i] % 2 == 1 for i in range(26)) > 0

def remove_odd_char(count):
    count[count.index(max(count))] -= 1
    return count

def divide_by_2(count):
    return [count[i]//2 for i in range(26)]

def is_valid(count):
    return sum(count) % 2 == 0

def calculate_sum(facts, count):
    valid = sum(count)
    sum = facts[valid]
    for i in range(26):
        sum /= facts[count[i]]
    return sum

input = sys.stdin.readline().strip()
facts = [fact(i) for i in range(MAX+1)]
count = count_chars(input)

if has_odd_char(count):
    print(0)
    sys.exit()

count = remove_odd_char(count)
count = divide_by_2(count)

if not is_valid(count):
    print(0)
    sys.exit()

sum = calculate_sum(facts, count)
print(sum)