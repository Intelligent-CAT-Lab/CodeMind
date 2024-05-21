import math

def factorial(n):
    if n == 0:
        return 1
    else:
        return n * factorial(n - 1)

def main():
    MAX = 20
    facts = [factorial(i) for i in range(MAX + 1)]
    facts[0] = 1
    
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
    
    if odd_pos!= -1:
        count[odd_pos] -= 1
    
    for i in range(26):
        count[i] //= 2
    
    valid = 0
    for i in range(26):
        valid += count[i]
    
    sum = facts[valid]
    for i in range(26):
        sum //= facts[count[i]]
    
    print(sum)

if __name__ == "__main__":
    main()