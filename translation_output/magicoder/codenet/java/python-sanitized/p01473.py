import sys
from collections import Counter
from math import factorial

def main():
    facts = [factorial(i) for i in range(21)]
    count = [0] * 26
    input_str = sys.stdin.readline().strip()
    for c in input_str:
        count[ord(c) - ord('a')] += 1

    allow_odd = 1 if len(input_str) % 2 == 1 else 0
    odd_count = sum(1 for c in count if c % 2 == 1)
    if allow_odd < odd_count:
        print(0)
        return

    if odd_count:
        count[count.index(min(c for c in count if c % 2 == 1))] -= 1

    count = [c // 2 for c in count]
    valid = sum(count)

    sum_ = facts[valid]
    for c in count:
        sum_ //= facts[c]

    print(sum_)

if __name__ == "__main__":
    main()