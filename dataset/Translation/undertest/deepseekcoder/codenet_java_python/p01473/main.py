from collections import Counter
from math import factorial

def count_factorial(n):
    facts = [1]*(n+1)
    for i in range(1, n+1):
        facts[i] = facts[i-1]*i
    return facts

def main():
    input_str = input()
    count = Counter(input_str)
    allow_odd = 0 if len(input_str) % 2 == 0 else 1
    odd_count = sum(1 for c in count.values() if c % 2 == 1)
    if allow_odd < odd_count:
        print(0)
        return
    if odd_count:
        count[list(count.keys())[list(count.values()).index(odd_count)]] -= 1
    count = {ch: count[ch]//2 for ch in count}
    valid = sum(count.values())
    facts = count_factorial(max(valid, sum(count.values())))
    sum_val = facts[valid]
    for c in count.values():
        sum_val //= facts[c]
    print(sum_val)

if __name__ == "__main__":
    main()