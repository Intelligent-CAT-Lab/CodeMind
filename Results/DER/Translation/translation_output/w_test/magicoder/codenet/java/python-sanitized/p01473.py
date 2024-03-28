from collections import Counter
from math import factorial

def count_factorial(n):
    facts = [1] * (n + 1)
    for i in range(1, n + 1):
        facts[i] = facts[i - 1] * i
    return facts

def count_permutations(count, valid):
    sum = factorial(valid)
    for i in range(26):
        sum //= factorial(count[i])
    return sum

def main():
    facts = count_factorial(20)
    count = [0] * 26
    input_str = input()
    for c in input_str:
        count[ord(c) - ord('a')] += 1
    allow_odd = 1 if len(input_str) % 2 == 1 else 0
    odd_count = sum(1 for i in count if i % 2 == 1)
    if allow_odd < odd_count:
        print(0)
        return
    if odd_count:
        count[count.index(min(i for i in count if i % 2 == 1))] -= 1
    count = [i // 2 for i in count]
    valid = sum(count)
    print(count_permutations(count, valid))

if __name__ == "__main__":
    main()