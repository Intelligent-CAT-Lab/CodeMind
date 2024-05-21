import math

MAX = 20

def main():
    facts = [1] * (MAX + 1)
    for i in range(1, MAX + 1):
        facts[i] = facts[i - 1] * i

    input_str = input()
    count = [0] * 26
    for c in input_str:
        count[ord(c) - ord('a')] += 1

    allow_odd = len(input_str) % 2 == 0
    odd_count = 0
    odd_pos = -1
    for i in range(26):
        if count[i] % 2 == 1:
            odd_count += 1
            odd_pos = i

    if allow_odd < odd_count:
        print(0)
        return

    if odd_pos != -1:
        count[odd_pos] -= 1

    for i in range(26):
        count[i] //= 2

    valid = sum(count)

    sum_val = facts[valid]
    for i in range(26):
        sum_val //= facts[count[i]]

    print(sum_val)

if __name__ == "__main__":
    main()