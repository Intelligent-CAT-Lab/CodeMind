from collections import Counter
from math import factorial

def count_factorial(n):
    facts = [1] * (n + 1)
    for i in range(1, n + 1):
        facts[i] = facts[i - 1] * i
    return facts

def main():
    facts = count_factorial(20)
    input_str = input()
    count = Counter(input_str)
    allow_odd = 1 if len(input_str) % 2 == 1 else 0
    odd_count = sum(1 for v in count.values() if v % 2 == 1)
    if allow_odd < odd_count:
        print(0)
        return
    if odd_count:
        count[next(k for k, v in count.items() if v % 2 == 1)] -= 1
    count = {k: v // 2 for k, v in count.items()}
    valid = sum(count.values())
    sum_fact = factorial(valid)
    for v in count.values():
        sum_fact //= factorial(v)
    print(sum_fact)

if __name__ == "__main__":
    main()