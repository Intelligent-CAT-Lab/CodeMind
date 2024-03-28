class main:
    import sys
    
    MAX = 20
    
    def fact(n):
        return sum(range(1, n+1))
    
    input = sys.stdin.readline().strip()
    count = [0] * 26
    
    for char in input:
        count[ord(char) - ord('a')] += 1
    
    allow_odd = len(input) % 2 == 0
    odd_count = 0
    odd_pos = -1
    for i in range(26):
        if count[i] % 2 == 1:
            odd_count += 1
            odd_pos = i
    
    if allow_odd < odd_count:
        print(0)
        sys.exit()
    
    if odd_pos != -1:
        count[odd_pos] -= 1
    
    for i in range(26):
        count[i] //= 2
    
    valid = sum(count)
    
    sum = fact(valid)
    for i in range(26):
        sum //= fact(count[i])
    
    print(sum)