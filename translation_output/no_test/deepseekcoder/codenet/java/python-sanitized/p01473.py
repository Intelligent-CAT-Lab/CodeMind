import sys
from collections import Counter

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)

def main():
    facts = [1] * 21
    for i in range(1, 21):
        facts[i] = facts[i - 1] * i

    count = Counter(sys.stdin.readline().strip())

    allow_odd = 1 if len(count) % 2 == 1 else 0
    odd_count = sum(1 for c in count.values() if c % 2 == 1)

    if allow_odd < odd_count:
        print(0)
        return

    if odd_count > 0:
        odd_char = next(c for c in count if count[c] % 2 == 1)
        count[odd_char] -= 1

    count = {c: count[c] // 2 for c in count}

    valid = sum(count.values())

    sum_ = factorial(valid)
    for c in count.values():
        sum_ //= factorial(c)

    print(sum_)

if __name__ == "__main__":
    main()